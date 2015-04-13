package com.component.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.CriteriaImpl;
import org.springframework.stereotype.Repository;

import com.component.dao.BaseHibernateDAO;
import com.component.dao.ComponentDAO;
import com.component.entity.AddressEntity;
import com.component.entity.ComponentEntity;
import com.component.entity.RestaurantsEntity;
import com.component.info.Address;
import com.component.info.ComponentInfo;
import com.component.info.Restaurants;

@Repository
public class RestaurantsHibernateDAO extends BaseHibernateDAO implements
		ComponentDAO {

	public void addRestaurants(Restaurants restaurants) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(session);
		session.getTransaction().commit();
	}

	public void deleteRestaurants(Restaurants restaurants) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ComponentEntity> searchComponent(String iD) {
		// TODO Auto-generated method stub
		List<ComponentEntity> listOfRestaurants = new ArrayList<ComponentEntity>();
		SessionFactory sessionFactory = getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		/*AddressEntity address = new AddressEntity();
		address.setZipCode(Integer.getInteger(iD));*/
		/*
		 * listOfRestaurants = (List<RestaurantsEntity>) session
		 * .get(RestaurantsEntity.class, address);
		 */
/*
		"select restaurant.restaurantID, "
		+ "restaurant.name, "
		+ "restaurant.addressId, "
		+ "restaurant.hoursOfOperation, "
		+ "address.street, "
		+ "address.city, "
		+ "address.state, "
		+ "address.zipcode, "
		+ "address.contactdetails, "*/
	/*	String arg0 = "from restaurant rest" + " INNER JOIN " +AddressEntity.class.getName() 
				+ " where zipCode =" + iD;*/

//System.out.println(session.createQuery(arg0));
//		listOfRestaurants = (session.createQuery(arg0)).list();
		
		Criteria crit = session.createCriteria(RestaurantsEntity.class);
		
		
		 crit.add(Restrictions.eq("zipCode", Integer.getInteger(iD)));

		 listOfRestaurants = crit.list();
		 
		
		System.out.println("List : "+ listOfRestaurants);
		session.getTransaction().commit();

		return listOfRestaurants;
	}

	@SuppressWarnings("unchecked")
	public List<ComponentEntity> getAllComponent() {
		// TODO Auto-generated method stub

		List<ComponentEntity> listOfAllRestaurants = new ArrayList<ComponentEntity>();
		SessionFactory sessionFactory = getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		listOfAllRestaurants = (List<ComponentEntity>) session
				.createCriteria(RestaurantsEntity.class).list();
		session.getTransaction().commit();
		System.out.println("list of Restaurants" + listOfAllRestaurants);
		return listOfAllRestaurants;
	}

	@Override
	public void addComponent(ComponentInfo restaurants) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComponent(ComponentInfo restaurants) {
		// TODO Auto-generated method stub
		
	}

}
