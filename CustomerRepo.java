package Task.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Task.En.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}


//
//package project.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import project.entites.Customer;
//
//public interface CustomerRepo extends JpaRepository<Customer, Integer> {
//
//}