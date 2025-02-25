package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Person_info_changeDao;
import model.EmployeeModel;
import model.EmployeeShiftInfoModel;
import model.Shift_desired_templateModel;

/**
 * Servlet implementation class Person_info_change
 */
@WebServlet("/Person_info_change")
public class Person_info_change extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Person_info_change() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String employeeId = (String) session.getAttribute("id");
        Person_info_changeDao dao = new Person_info_changeDao();
        EmployeeShiftInfoModel info = dao.getEmployeeShiftInfo(employeeId);

        if (info != null) {
            EmployeeModel employee = info.getEmployee();
            Shift_desired_templateModel shift = info.getShift();

            System.out.println("Name: " + employee.getEmployee_name());
            System.out.println("Furigana: " + employee.getFurigana());
            System.out.println("Birthdate: " + employee.getBirthdate());
            System.out.println("Address: " + employee.getAddress());
            System.out.println("Postal Code: " + employee.getPostal_code());
            System.out.println("Email: " + employee.getEmail_address());
            System.out.println("Phone: " + employee.getPhone_number());

            System.out.println("Weekday: " + shift.getWeekday());
            System.out.println("Start Time: " + shift.getStart_time());
            System.out.println("End Time: " + shift.getEnd_time());
            request.setAttribute("Employee_name",employee.getEmployee_name());
            request.setAttribute("Furigana",employee.getFurigana());
            request.setAttribute("Birthdate",employee.getBirthdate());
            request.setAttribute("Address",employee.getAddress());
            request.setAttribute("Postal_code",employee.getPostal_code());
            request.setAttribute("Email_address",employee.getEmail_address());
            request.setAttribute("Phone_number",employee.getPhone_number());
            request.setAttribute("Weekday",shift.getWeekday());
            request.setAttribute("Start_time",shift.getStart_time());
            request.setAttribute("End_time",shift.getEnd_time());
            RequestDispatcher dispatcher = request.getRequestDispatcher(".jsp");
            dispatcher.forward(request, response);
        } else {
            System.out.println("No data found.");
        }
        
        
	}

}
