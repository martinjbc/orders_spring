package org.orders.controller;

import java.util.List;

import org.orders.entity.Categorias;
import org.orders.service.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("Order")
public class OrderController {

    @Autowired
	CategoriasService categoriasService;
    
	@RequestMapping("/")
	public String index() {
	    //List<Categorias> lista=categoriasService.listaPersonalizada();
		List<Categorias> lista=categoriasService.getAll();
    	System.out.println("Cantidad2 :"+lista.size());
		return "index";
	}
	
	@RequestMapping(value="/pedidos/list", method=RequestMethod.GET)
	public String listOrder() {
		return "order/list";
	}
	
	@RequestMapping(value="/pedidos/new", method=RequestMethod.GET)
	public String newOrder() {
		return "order/form";
	}	
	
	@RequestMapping(value="/pedidos/create", method=RequestMethod.POST)
	public String createOrder() {
		return "order/form";
	}
	
	@RequestMapping(value="/pedidos/edit", method=RequestMethod.GET)
	public String editOrder() {
		return "order/form";
	}
	
	@RequestMapping(value="/pedidos/update", method=RequestMethod.POST)
	public String updateOrder() {
		return "order/form";
	}
}
