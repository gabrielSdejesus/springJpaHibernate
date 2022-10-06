package projectSpring.jpaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projectSpring.jpaSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
