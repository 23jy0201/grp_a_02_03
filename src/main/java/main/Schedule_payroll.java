package main;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.hourly_wagesDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Hourly_wagesModel;

/**
 * Servlet implementation class Schedule_payroll
 */
public class Schedule_payroll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Schedule_payroll() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		hourly_wagesDAO dao = new hourly_wagesDAO();
		Hourly_wagesModel wage = dao.getWageById(request.getParameter("id"));
		
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("mm");
        Date today = new Date();
        String year = sdf1.format(today);
        String month = sdf2.format(today);
		int price = wage.getHourly_wage();
		RequestDispatcher dispatcher = request.getRequestDispatcher("schedule_payroll.jsp");
		dispatcher.forward(request, response);
	}

}
