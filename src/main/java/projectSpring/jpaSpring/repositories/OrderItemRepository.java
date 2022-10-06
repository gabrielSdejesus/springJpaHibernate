package projectSpring.jpaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projectSpring.jpaSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
