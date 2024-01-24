package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dto.AutorService;
import com.distribuida.entities.Autor;

public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		AutorService autorService = context.getBean("autorServiceImpl",AutorService.class);
		
		// CRUD
		
		// add
		// autorService.add(0,"nombre3","apellido2","pais2","direccion2","telefono2","correo2");
		
		// up
		// autorService.up(54,"nombre3","apellido2","pais2","direccion2","telefono2","correo2");
		
		// delete
	    autorService.del(54);
		
		
		// findAll
		List<Autor> autores = autorService.findAll();
		
		// Impresion
		for(Autor item : autores){
     		//System.out.println(item.toString());
		}
		
		// findOne
		//Autor autor = autorService.findOne(1);
		//System.out.println(autor.toString());
		
		context.close();
	}

}