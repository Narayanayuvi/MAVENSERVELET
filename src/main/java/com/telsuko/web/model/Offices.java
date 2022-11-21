package com.telsuko.web.model;

public class Offices 
{
 private int office_id;
 private String address;
 private String city;
 private String state;
public int getOffice_id() 
{
	return office_id;
}
public void setOffice_id(int office_id) 
{
	this.office_id = office_id;
}
public String getAddress() 
{
	return address;
}
public void setAddress(String address) 
{
	this.address = address;
}
public String getCity()
{
	return city;
}
public void setCity(String city)
{
	this.city = city;
}
public String getState()
{
	return state;
}
public void setState(String state) 
{
	this.state = state;
}
@Override
public String toString() 
{
	return "Offices [office_id=" + office_id + ", address=" + address + ", city=" + city + ", state=" + state + "]";
}
 
 
}
