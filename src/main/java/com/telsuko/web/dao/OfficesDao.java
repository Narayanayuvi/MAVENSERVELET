package com.telsuko.web.dao;

import java.sql.*;

import com.telsuko.web.model.Offices;

public class OfficesDao 
{
public Offices getOffices(int office_id)
{
	Offices a=new Offices();
	
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_hr","root","NARAYANA");
		System.out.println("connecting to psysical database...");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from offices where office_id="+office_id);
		if(rs.next())
		{
			a.setOffice_id(rs.getInt("office_id"));
			a.setAddress(rs.getString("address"));
			a.setCity(rs.getString("city"));
			a.setState(rs.getString("state"));
		}
	}
	catch(Exception e)
	{
	System.out.println(e);	
	}
	
	return a;
}
}
