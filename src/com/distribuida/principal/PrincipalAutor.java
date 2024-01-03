package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		AutorDAO autorDAO = context.getBean("autorDAOImpl",AutorDAO.class);
		
		// CRUD
		
		// add
		// Autor autor1 = new Autor(0,"nombre1","Apellido1","Ecuador","en algun lado","0990562860","nombre@correo.com");
		// autorDAO.add(autor1);
		
		// up
		// Autor autor2 = new Autor(55,"Darwin","Sosa","Ecuador","en algun lado","0990562860","nombre@correo.com");
		// autorDAO.up(autor2);
		
		// delete
		// autorDAO.del(55);
		
		
		// findAll
		List<Autor> autores = autorDAO.findAll();
		
		// Impresion
		for(Autor item : autores){
     		System.out.println(item.toString());
		}
		
		// findOne
		// Autor autor = autorDAO.findOne(1);
		// System.out.println(autor.toString());
		
		context.close();
	}

}