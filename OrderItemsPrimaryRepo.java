package Task.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Task.En.OrderItems;
import Task.En.OrderItemsPrimary;

public interface OrderItemsPrimaryRepo extends JpaRepository<OrderItemsPrimary, OrderItems> {

	// 6.............
	@Query("select P.productName,oi.quantity,oi.price from Product P join OrderItemsPrimary oi on P.productId=oi.id.prodid where oi.id.orderid=:orderid")
	List<Object> getproductorderitemsByorderid(@Param(value = "orderid") int orderId);

	//// 8................
	@Query("select p.productName,c.customerName,oi.quantity,oi.price,o.orderDate from Order o join OrderItemsPrimary oi on oi.id.orderid=o.orderId join Customer c on o.customerId=c.customerId join Product p  on oi.id.prodid=p.productId where oi.id.prodid=:prodid ")
	List<Object> getcustomerorderproductorderitemsByprodid(@Param("prodid") int prodid);


}




//
//package project.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import project.entites.OrderItems;
//import project.entites.OrderItemsPrimary;
//import project.entites.Product;
//
//public interface OrderItemsPrimaryRepo extends JpaRepository<OrderItemsPrimary, OrderItems> {
//
////6.............
//	@Query("select P.productName,oi.quantity,oi.price from Product P join OrderItemsPrimary oi on P.productId=oi.id.prodid where oi.id.orderid=:orderid")
//	List<Object> getproductorderitemsByorderid(@Param(value = "orderid") int orderId);
//
//////8................
//	@Query("select p.productName,c.customerName,oi.quantity,oi.price,o.orderDate from Order o join OrderItemsPrimary oi on oi.id.orderid=o.orderId join Customer c on o.customerId=c.customerId join Product p  on oi.id.prodid=p.productId where oi.id.prodid=:prodid ")
//	List<Object> getcustomerorderproductorderitemsByprodid(@Param("prodid") int prodid);
//
//}