package Task.Repo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Task.En.Customer;
import Task.En.Order;


public interface OrderRepo extends JpaRepository<Order, Integer> {



	// Provide all details of order by given customerid---------------10
	List<Order> findByorderId(int id);

	

//	4
	List<Order> findByOrderDate(LocalDate date);
	
//	5
	List<Order> findByOrderStatus(String status);

	//----------------without Query-----3
	List<Order> findByCustomers(Customer customerId);
	
	@Query("from Order where orderDate>:orderDate")
	List<Order> getByOrderDate(@Param("orderDate")LocalDate orderDate);
	
}





//package project.repository;
//
//import java.time.LocalDate;
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import project.entites.Customer;
//import project.entites.Order;
//
////import jakarta.persistence.criteria.Order;
//
//public interface OrderRepo extends JpaRepository<Order, Integer> {
//
//	// Provide all details of order by given customerid---------------10
//	List<Order> findByorderId(int id);
//
////	4
//	List<Order> findByOrderDate(LocalDate date);
//
////	5
//	List<Order> findByOrderStatus(String status);
//
//	// ----------------without Query-----3
//	List<Order> findByCustomers(Customer customerId);
//
//	@Query("from Order where orderDate>:orderDate")
//	List<Order> getByOrderDate(@Param("orderDate") LocalDate orderDate);
//
//	Order save(Order order);

//}