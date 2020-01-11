package pl.javastart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pl.javastart.model.Client;
import pl.javastart.model.Order;

@Repository
@Transactional
public class ClientDao extends GenericDao<Client, Long>{

	
	/*
	 * In this class we override two methods (get and remove). First because of the lazy initialize - we have to run any action 
	 * in transactional mode in order to read whole information form database (whole order list).
	 * Remove - because we don't use cascade annotation and we have to remove all orders before we remove a client.
	 * 
	 */
	
	@Autowired
	private OrderDao orderDao;
	
	
	
	public void remove (Client client) {
		for(Order ord:client.getOrders()) {
			orderDao.remove(ord);
		}
		super.remove(client);
	}
	
	
	public Client get (Long id) {
		Client client = super.get(id);
		client.getOrders().size();
		return client;
	}

}
