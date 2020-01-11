package pl.javastart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pl.javastart.dao.ClientDao;
import pl.javastart.dao.OrderDao;
import pl.javastart.model.Client;
import pl.javastart.model.Order;


@SpringBootApplication
public class Application {

	public static void main(String[] args) throws InterruptedException {
			
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		ClientDao clientDao = ctx.getBean(ClientDao.class);
		OrderDao orderDao = ctx.getBean(OrderDao.class);
		
// ADD NEW CUSTOMER AND NEW ORDERS AND SAVE ALL IN HD 
		
		/*
		Client client1 = new Client("Wojciech", "Tomczyk", "Plana 2");
		Order order1 = new Order("rzutnik", "rzutnik do ogladania filmow", client1);
		Order order2 = new Order("telewizor LCD", "telewizon marki RUBIN", client1);
		Client client2 = new Client("Tomasz", "Wilk", "Graniczna 12");
		Order order3 = new Order("smartphone", "smartphone galaxy note 4", client2);
		Order order4 = new Order("płyta Cd", "płyta RHCP Californication", client2);
		
		clientDao.save(client1);
		clientDao.save(client2);
		orderDao.save(order1);
		orderDao.save(order2);
		orderDao.save(order3);
		orderDao.save(order4);
		*/
		
		
		
//EDIT CLIENT AND ORDER 
		
		/*
		Client clientToChange = clientDao.get(1L);
		clientToChange.setFirstName("Franek");
		clientDao.update(clientToChange);
		
		Order orderToChange = orderDao.get(1L);
		orderToChange.setOrderDetails("coś innego niż bylo");
		orderDao.update(orderToChange);
		 */
		
		
//REMOVE A CLIENT
		
		/*
		Client clientToRemove = clientDao.get(1L);
		Order orderToRemove = orderDao.get(2L);
		clientDao.remove(clientToRemove);
		orderDao.remove(orderToRemove);
		*/
		
		
		ctx.close();
	}

}
