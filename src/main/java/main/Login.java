package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.EmployeeDao;
import login.sha1changer;
import model.EmployeeModel;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		EmployeeDao empdao = new EmployeeDao();
		sha1changer sha1 = new sha1changer();
		pass = sha1.change(pass);
		
		try { // 例外処理を追加
			EmployeeModel employee = empdao.read(id);

			if (employee == null) { // employee が null の場合の処理
				request.setAttribute("error", "従業員IDまたはパスワードが間違っています。");
				request.getRequestDispatcher("login.html").forward(request, response);
				return; // 処理を終了
			}

			if (employee.getEmployee_id() != id && pass.equals(employee.getEmployee_password())) {
				HttpSession hs = request.getSession();
				hs.setAttribute("id", id);
				String page = empdao.user_decision(id);
				if (page.equals("part_timer_albite")) {
					RequestDispatcher rd = request.getRequestDispatcher("Menu");
					rd.forward(request, response);
				} else if (page.equals("shift_manager")) {
					response.sendRedirect("menu_adminstrator.jsp");
				} else if (page.equals("headquarters")) {
					response.sendRedirect("menu_headquarters.jsp");
				}
			} else {
				request.setAttribute("error", "従業員IDまたはパスワードが間違っています。"); // エラーメッセージを設定
				System.out.println(employee.getEmployee_id() + " " + employee.getEmployee_password() + "  :  " + pass);
				request.getRequestDispatcher("login.html").forward(request, response); // login.html にフォワード
			}

		} catch (Exception e) { // 例外をキャッチ
			e.printStackTrace(); // ログに出力
			request.setAttribute("error", "システムエラーが発生しました。"); // エラーメッセージを設定
			request.getRequestDispatcher("login.html").forward(request, response); // login.html にフォワード
		}
	}

}