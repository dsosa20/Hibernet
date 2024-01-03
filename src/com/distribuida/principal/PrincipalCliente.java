package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
		
		// CRUD
		
		// add
		// Cliente cliente1 = new Cliente(0,"17521469222","Nombre","Apellido","Direccioxd","654654654","ijjdjd@nfdd.cs");
		// clienteDAO.add(cliente1);
		
		// up
		// Cliente cliente2 = new Cliente(40,"1752146922","Manuel","Maju","Direccio X","0954654654","paleta54@hotchanell.com");
		// clienteDAO.up(cliente2);
		
		// delete
		// clienteDAO.del(40);
		
		//findAll
		List<Cliente> clientes = clienteDAO.findAll();
		
		//Impresion
		for(Cliente item : clientes){
     		System.out.println(item.toString());
		}
		
		// findOne
		// Cliente cliente = clienteDAO.findOne(2);
		// System.out.println(cliente.toString());
		
		
		context.close();
	}

}