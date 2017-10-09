package com.frs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="flight")
public class Flight {
	@Id
	private String name;

//@NotEmpty(message="Enter some value")
//@Length(min=8,max=8)
private String source;
//@NotEmpty(message="Enter some value")

//@Pattern(regexp="[0-9]*")
//@Length(min=10, max=10)
//@NotEmpty(message="Enter some value")
private String destination;
private int seats;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
}
