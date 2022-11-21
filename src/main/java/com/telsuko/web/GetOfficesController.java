package com.telsuko.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.telsuko.web.dao.OfficesDao;
import com.telsuko.web.model.Offices;

/**
 * Servlet implementation class GetOfficesController
 */
public class GetOfficesController extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 int office_id=Integer.parseInt(request.getParameter("office_id"));
		 OfficesDao dao=new OfficesDao();
		 Offices of=dao.getOffices(office_id);
		 
		 request.setAttribute("offices",of);
		 
		 RequestDispatcher rd=request.getRequestDispatcher("ShowOffices.jsp");
		 rd.forward(request, response);
	}

	
}
