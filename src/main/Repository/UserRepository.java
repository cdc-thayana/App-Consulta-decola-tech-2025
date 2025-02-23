package src.main.Repository;

import src.main.java.dio.me.Model.User;
import org.springframework.data.jpa;repository.jpaRepository;


@Repository
public interface UserRepository extends jpaRepository<User, Long {
}
