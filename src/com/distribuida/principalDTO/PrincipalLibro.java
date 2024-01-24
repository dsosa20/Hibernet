package com.distribuida.principalDTO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.dto.LibroService;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

public class PrincipalLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		LibroService libroService = context.getBean("libroServiceImpl",LibroService.class);

		//CRUD
		
		// add
		//libroService.add(0,"El oso juancho","Lee mas",150,"1th","Español",new Date(),"Trata de un oso","Pasta Dura","ISBN-23",50,"Color","fisico",10.55, 1, 1);
		
		// up
		//libroService.up(79,"El oso rambo","Lee mas",150,"1th","Español",new Date(),"Trata de un oso","Pasta Dura","ISBN-23",50,"Color","fisico",10.55, 1, 1);

		
		// Delete
		libroService.del(79);
		
		//findAll
		List<Libro> libros = libroService.findAll();
		
		//Impresion
		for(Libro item : libros) {
			//System.out.println(item.toString());
		}
		
		// findOne
		// Libro libro = libroService.findOne(4);
		// System.out.println(libro.toString());
		
		context.close();
	}

}
