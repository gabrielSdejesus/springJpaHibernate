package projectSpring.jpaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projectSpring.jpaSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
