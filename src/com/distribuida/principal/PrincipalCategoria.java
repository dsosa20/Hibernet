package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;


public class PrincipalCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl",CategoriaDAO.class);
		
		// CRUD
		
		// add
	    // Categoria categoria1 = new Categoria(0, "Acccion","Una categoria mas");
		// categoriaDAO.add(categoria1);
	    
	    // up
		// Categoria categoria2 = new Categoria(59, "Terror","Una categoria mas");
		// categoriaDAO.up(categoria2);
		

		// Delete
		// categoriaDAO.del(59);
		
		//findAll
		List<Categoria> categorias = categoriaDAO.findAll();
		
		//Impresion
		for(Categoria item : categorias){
     		System.out.println(item.toString());
		}
		
		// findOne
		// Categoria categoria = categoriaDAO.findOne(30);
		// System.out.println(categoria.toString());
		
		context.close();
	}

}
