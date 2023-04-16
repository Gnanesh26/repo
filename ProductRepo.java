package Task.Repo;

import java.util.List;
//import java.awt.print.Pageable;
//
//import org.springframework.data.annotation.QueryAnnotation;
//import org.springframework.data.domain.Page;

import org.springframework.data.jpa.repository.JpaRepository;

import Task.En.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

// 7
	List<Product> findByproductName(String name);
}
