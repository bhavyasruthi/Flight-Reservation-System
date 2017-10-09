package com.frs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frs.DAO.FlightDAO;
import com.frs.model.Flight;

@Service("flightservice")
public class FlightServiceImpl implements FlightService{
	@Autowired
	private FlightDAO daoImpl;
	@Transactional
	public boolean addFlight(Flight flight) {
		System.out.println("in service");
		return daoImpl.addflight(flight);
	}
	@Transactional
	public boolean removeFlight(Flight flight) {
		System.out.println("in service");
		return daoImpl.removeFlight(flight);
	}
	@Transactional
	public Object viewAllFlights() {
		System.out.println("in service");
		return daoImpl.viewAllFlights();
	}
	@Transactional
	public boolean updateFlight(Flight flight) {
		System.out.println("in service");
		return daoImpl.updateFlight(flight);
	}
	@Transactional
	public Flight getFlight(Flight flight) {
		System.out.println("in service");
		return daoImpl.getFlight(flight);
	}

}
