package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.HashMap;

import Business.CountryUser;
import Business.JobUser;
import Business.User;
import data.Encryption;
import data.SingletonDB;
import data.database;

/**
 * Servlet implementation class addUsers
 */
@WebServlet("/addUsers")
public class addUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private database db;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addUsers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
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
		String uid = db.getID("User");
		User u = new User(uid, firstName, lastName, email, dob, gender, uName, pWord, uType, "avaliable");
	
		int result = 0;
		
		try {	
			//Adds Users Information
			Object ob = (Object) u;
			result = db.add(ob,"User");
		
			
		} finally {
		
			try {
				String coid;
				// Adds Users Preferred Country
				for (String string : Country) {
					String cuid = db.getID("CountryUser");
					coid = db.getCnameId(string);
					CountryUser cuuser = new CountryUser(cuid,coid , uid);
					db.add(cuuser, "CountryUser");
				}
				
			} finally {
					String jID;
					for (String jobs : Job) {
					String juid = db.getID("JobUser");
					jID = db.getJnameId(jobs);
					
					
					JobUser jUser = new JobUser(juid, jID,"U1");
					db.add(jUser, "JobUser");
					
				}
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

}
