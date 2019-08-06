package servlets;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Business.User;
import data.Encryption;
import data.SingletonDB;
import data.database;

/**
 * Servlet implementation class updateUser
 */
@WebServlet("/updateUser")
public class updateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private database db;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		db=SingletonDB.getInstance();
		  String idTemp = request.getParameter("id");
	     
	        request.setAttribute("getUserByID", db.getUserByID(idTemp));
	        RequestDispatcher rd = request.getRequestDispatcher("updateUser.jsp");
	        try {
	            rd.forward(request, response);
	        } catch (ServletException | IOException ex) {
	            Logger.getLogger(updateUser.class.getName()).log(Level.SEVERE, null, ex);
	        }
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		db=SingletonDB.getInstance();
		int result = 0;
		String uid = request.getParameter("UID");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String dob = request.getParameter("date");
		String gender = request.getParameter("gender");
		String uName = Encryption.hashPassword(request.getParameter("uName"));
		String pWord = Encryption.hashPassword(request.getParameter("pWord"));
		String uType = request.getParameter("uType");
		String Country[] = request.getParameterValues("Countries");
		String Job[] = request.getParameterValues("Jobs");
	
		
		db=SingletonDB.getInstance();
		
		User u = new User(uid, firstName, lastName, email, dob, gender, uName, pWord, uType, "avaliable");
		
		try {	
			//Adds Users Information
			Object ob = (Object) u;
			result = db.updateUser(ob);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		

		String path="";
		if (result>0){
            path="/JavaTestSQL/allUsers";
        }else{
            path="/error.jsp";
        }
		
		
		
		response.sendRedirect(path);
		
	}

}
