package net.javaguides.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.javaguides.registration.dao.employeeDao;
import net.javaguides.registration.model.employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private employeeDao employeeDao = new employeeDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeregister.jsp");
		dispatcher.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String Name = request.getParameter("Name");
	 String LastName = request.getParameter("LastName");
	 String Gender = request.getParameter("Gender");
	 String DOB = request.getParameter("DOB");
	 String Relationship = request.getParameter("Relationship");
	 
 employee employee = new employee();
 employee.setName(Name);
 employee.setLastName(LastName);
 employee.setGender(Gender);
 employee.setDOB(DOB);
 employee.setRelationship(Relationship);
try {
	employeeDao.registerEmployee(employee); 
}catch(ClassNotFoundException e) {
	
	e.printStackTrace();
}
RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
dispatcher.forward(request, response);
 
	 
	}

}
