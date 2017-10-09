package com.frs.service;

import com.frs.model.Flight;

public interface FlightService {
public boolean addFlight(Flight flight);
public boolean removeFlight(Flight flight);
public Object viewAllFlights();
public boolean updateFlight(Flight flight);
public Flight getFlight(Flight flight);
}
