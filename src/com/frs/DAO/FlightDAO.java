package com.frs.DAO;

import com.frs.model.Flight;

public interface FlightDAO {
public boolean addflight(Flight flight);
public boolean removeFlight(Flight flight);
public Object viewAllFlights();
public boolean updateFlight(Flight flight);
public Flight getFlight(Flight flight);
}
