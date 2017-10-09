package com.frs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.frs.DAO.FlightDAO;
import com.frs.model.Flight;
import com.frs.service.FlightService;

@Controller
public class FRSController {
@Autowired
private FlightService flightservice;

@RequestMapping(
        value = "/",
        method = RequestMethod.GET
    )
    public String welcome(@ModelAttribute("flight")
        Flight flight, BindingResult result)
    {
	System.out.println("in controller wel");
	return "Welcome";
    }
@RequestMapping(
        value = "toAddFlight",
        method = RequestMethod.GET
    )
    public String toAddFlight(@ModelAttribute("flight")
        Flight flight, BindingResult result)
    {
	System.out.println("in controller to add");
	return "addFlightDetails";
    }
@RequestMapping(
        value = "addingflightdetails",
        method = RequestMethod.GET
    )
    public String addFlight(@ModelAttribute("flight")
        Flight flight, BindingResult result)
    {
	System.out.println("in add controller");
        if(flightservice.addFlight(flight))
        return "FlightDetailsAddedSuccessful";
        else
        	return "err";
    }
@RequestMapping(
        value = "toRemoveFlight",
        method = RequestMethod.GET
    )
    public String toRemoveFlight(@ModelAttribute("flight")
        Flight flight, BindingResult result,Model model)
    {
	System.out.println("in controller to remove");
	Object o=flightservice.viewAllFlights();
	if(o!=null)
	{
		List<Flight> fl= (List)o;
	model.addAttribute("flightList",fl);
	return "removeFlightDetails";
    }
	else
    	return "errInRemove";
    }
@RequestMapping(
        value = "removingflightdetails",
        method = RequestMethod.GET
    )
    public String removeFlight(@ModelAttribute("flight")
        Flight flight, BindingResult result)
    {
	System.out.println("in remove controller");
        if(flightservice.removeFlight(flight))
        return "FlightDetailsRemovedSuccessful";
        else
        	return "err";
    }
@RequestMapping(
        value = "toViewAllFlights",
        method = RequestMethod.GET
    )
    public String viewFlight(@ModelAttribute("flight")
        Flight flight, BindingResult result , Model model)
    {
	System.out.println("in controller to view");
	Object o=flightservice.viewAllFlights();
	if(o!=null)
	{
		List<Flight> fl= (List)o;
	model.addAttribute("flightList",fl);
        return "viewAllFlightDetails";
	}
        	return "err";
    }
@RequestMapping(
        value = "toUpdateFlight",
        method = RequestMethod.GET
    )
    public String toUpdateFlight(@ModelAttribute("flight")
        Flight flight, BindingResult result)
    {
	System.out.println("in controller to upedat");
	return "updateFlightDetails";
    }
@RequestMapping(
        value = "gettingflightdetails",
        method = RequestMethod.GET
    )
    public String getFlight(@ModelAttribute("flight")
        Flight flight, BindingResult result,Model model)
    {
	System.out.println("in get flight controller");
    Flight f=flightservice.getFlight(flight);
    model.addAttribute("f",f);
    if(f!=null)
    return "viewFlightDetails";
    else
    	return "errInRemove";
    }
@RequestMapping(
        value = "updatingflightdetails",
        method = RequestMethod.GET
    )
    public String updateFlight(@ModelAttribute("flight")
        Flight flight, BindingResult result)
    {
	System.out.println("in update controller name is f"+flight.getName());
        if(flightservice.updateFlight(flight))
        return "FlightDetailsUpdatedSuccessful";
        else
        	return "err";
    }
 
}
