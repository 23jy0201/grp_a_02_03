package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MenuDao;

/**
 * Servlet implementation class Menu
 */
@WebServlet("/Menu")
public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Menu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // クエリパラメータから employeeId を取得
        HttpSession session = request.getSession();
        String employeeId = (String) session.getAttribute("id");
        request.setAttribute("id", employeeId);


        // DAOからデータ取得
        MenuDao dao = new MenuDao ();
        boolean shift = dao.getDesiredShifts(employeeId);
        int replacement_request = dao.getreplacement_request(employeeId);


        System.out.println(shift);
       	request.setAttribute("DesiredShifts",shift);
  
        
        request.setAttribute("replacement_request", replacement_request);
        RequestDispatcher dispatcher = request.getRequestDispatcher("menu_albite.jsp");
        dispatcher.forward(request, response);
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
