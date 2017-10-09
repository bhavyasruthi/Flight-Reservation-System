package com.frs.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.frs.model.Flight;


@Service("daoImpl")
public class FlightDAOImpl implements FlightDAO{
	    @Autowired
	    private SessionFactory sessionFactory;
	   

		@Override
		public boolean addflight(Flight flight) {
			System.out.println("in dao");
			Object result=sessionFactory.getCurrentSession().save(flight);
			if(result!=null)
			return true;
			return false;
		}
		@Override
		public boolean removeFlight(Flight flight) {
			System.out.println("in dao");
			sessionFactory.getCurrentSession().delete(flight);
			//if(result!=null)
			return true;
			//return false;
		}
		@Override
		public Object viewAllFlights() {
			System.out.println("in dao");
			List l=sessionFactory.getCurrentSession().createQuery("from Flight").list();
			return l;
		}
		/*@Override
		public Object viewAllFlights() {
			System.out.println("in dao");
			Object o=sessionFactory.getCurrentSession().get(Flight.class, null);
			return o;
		}*/
		@Override
		public boolean updateFlight(Flight flight) {
			System.out.println("in dao"+flight.getName());
			Transaction t=sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().update(flight);
            //t.commit();
			return true;
		}
		@Override
		public  Flight getFlight(Flight flight) {
			System.out.println("in dao");
			Flight f=(Flight)sessionFactory.getCurrentSession().get(Flight.class,flight.getName());
			return f;
		}
	 
}
