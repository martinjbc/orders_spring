package org.orders.controller;

import java.util.List;

import org.orders.entity.Categorias;
import org.orders.entity.Productos;
import org.orders.service.CategoriasService;
import org.orders.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("Order")
public class OrderController {

    @Autowired
	CategoriasService categoriasService;
    
    @Autowired
    ProductosService productosService;
    
	@RequestMapping("/")
	public ModelAndView index() {
	    //List<Categorias> lista=categoriasService.listaPersonalizada();
		List<Categorias> lista=categoriasService.getAll();
    	System.out.println("Cantidad hibernate :"+lista.size());
    	
    	Categorias cat=new Categorias();
    	System.out.println("INSERTADO antes:"+cat.getIdcategoria());
    	cat.setNombrecategoria("POLLOS2");
    	cat.setDescripcion("POLLOS SAN FERNANDO2");
    	categoriasService.add(cat);
    	
    	System.out.println("INSERTADO despues:"+cat.getIdcategoria());
    	
    	cat.setDescripcion("POLLOS SAN FERNANDO2 actualizado");
    	categoriasService.update(cat);
    	
    	ModelAndView model = new ModelAndView();
    	
    	List<Productos> lista2=productosService.listarJdbc();
    	System.out.println("Cantidad productos jdbc :"+lista2.size());
    	
    	List<Productos> lista3=productosService.listarProcedure();
		model.addObject("listaProducto", lista3);
		
		System.out.println("Cantidad productos procedure:"+lista3.size());
		model.setViewName("product/list");
		return model;
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
