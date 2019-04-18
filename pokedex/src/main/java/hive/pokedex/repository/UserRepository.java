package hive.pokedex.repository;

import hive.entity.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends CrudRepository<User, Integer> {
  User findByUsername(String username);
}