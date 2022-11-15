package com.webservice.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.course.entities.Order;
import com.webservice.course.repositories.OrderRepository;


@Service
public class OrderService {
	
	/*Lazy loading -> na relação muios para um, o JPA traz o dado único aninhado no Json
	 * Isso não ocorre numa situação oposta
	 * Isso só aconteceria se eu colocasse a anotação do JsonIgnore na relação muitos para um
	 * no caso nesse service do 'Order'
	 * O Jackson serializa o Json, forçando o JPA a buscar os dados e aninhar no resultado*/
	
	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
