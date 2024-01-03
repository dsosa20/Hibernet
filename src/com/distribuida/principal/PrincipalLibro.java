package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

public class PrincipalLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		LibroDAO libroDAO = context.getBean("libroDAOImpl",LibroDAO.class);
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl",CategoriaDAO.class);
		AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
		
		//CRUD
		
		// add
		// Categoria categoria = categoriaDAO.findOne(4);
		// Autor autor = autorDAO.findOne(3);
		// Libro libro = new Libro(0,"El oso juancho","Lee mas",150,"1th","Español",new Date(),"Trata de un oso","Pasta Dura","ISBN-23",50,"Color","fisico",10.55,categoria,autor);
		// libroDAO.add(libro);
		
		// up
		// Categoria categoria1 = categoriaDAO.findOne(4);
		// Autor autor1 = autorDAO.findOne(3);
		// Libro libro1 = new Libro(79,"El oso juancho 2","Lee mas",150,"1th","Español",new Date(),"Trata del mismo oso","Pasta Dura","ISBN-23",50,"Color","digital",10.55,categoria1,autor1);
		// libroDAO.up(libro1);
		
		// Delete
		//libroDAO.del(79);
		
		//findAll
		List<Libro> libros = libroDAO.findAll();
		
		//Impresion
		for(Libro item : libros) {
			System.out.println(item.toString());
		}
		
		// findOne
		// Libro libro = libroDAO.findOne(4);
		// System.out.println(libro.toString());
		
		context.close();
	}

}
