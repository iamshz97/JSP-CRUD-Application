package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Business.User;
import Business.UserCredentials;
import data.Encryption;
import data.SingletonDB;
import data.database;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private database db;
    private String path="";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uName = Encryption.hashPassword(request.getParameter("uName"));
		String pWord = Encryption.hashPassword(request.getParameter("pWord"));
		db=SingletonDB.getInstance();
		try {
			Object ob = db.verifylogin(uName, pWord);
			System.out.println(uName+"  "+pWord);
			UserCredentials user = (UserCredentials) ob;
			System.out.println(uName+"  "+user.getUsertype());
			if(ob!=null){
				
				String usertype = user.getUsertype();
				if (usertype.equals(usertype)){
				path="/JavaTestSQL/allUsers";
				response.sendRedirect(path);
				}
				else {
					System.out.println(user.getUsertype());
					path="/JavaTestSQL/error";
						response.sendRedirect(path);}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			path="/JavaTestSQL/error";
			
			response.sendRedirect(path);
		}
	}

}
