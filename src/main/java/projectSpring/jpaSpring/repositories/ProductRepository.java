package projectSpring.jpaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projectSpring.jpaSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
