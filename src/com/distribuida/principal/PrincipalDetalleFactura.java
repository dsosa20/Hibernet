package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.DetalleFacturaDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libro;

public class PrincipalDetalleFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		DetalleFacturaDAO detallefacturaDAO = context.getBean("detalleFacturaDAOImpl",DetalleFacturaDAO.class);
		FacturaDAO facturaDAO = context.getBean("facturaDAOImpl", FacturaDAO.class);
		LibroDAO libroDAO = context.getBean("libroDAOImpl",LibroDAO.class);
		
		// CRUD
		
		// add
		// Factura factura = facturaDAO.findOne(2);
		// Libro libro = libroDAO.findOne(2);
		// DetalleFactura detallefactura = new DetalleFactura(0,6,150.33,factura,libro);
		// detallefacturaDAO.add(detallefactura);
		
		// up
		// Factura factura1 = facturaDAO.findOne(1);
		// Libro libro1 = libroDAO.findOne(1);
		// DetalleFactura detallefactura1 = new DetalleFactura(201,6,999.33,factura1,libro1);
		// detallefacturaDAO.up(detallefactura1);
		
		// Delete
		// detallefacturaDAO.del(201);
		
		//findAll
		List<DetalleFactura> detallefacturas = detallefacturaDAO.findAll();
		
		//Impresion
		for(DetalleFactura item : detallefacturas) {
			System.out.println(item.toString());
		}
		
		// findOne
		// DetalleFactura detalleFactura = detallefacturaDAO.findOne(202);
		// System.out.println(detalleFactura.toString());
		
		context.close();
	}

}
