package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Business.User;
import data.SingletonDB;
import data.database;

/**
 * Servlet implementation class allUsers
 */
@WebServlet("/allUsers")
public class allUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private database db;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public allUsers() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    protected void processRequest (HttpServletRequest request, HttpServletResponse response)
    
    	throws ServletException, IOException{
    	
    	}
    	
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
    		db=SingletonDB.getInstance();
			ArrayList<Object> ob = db.getAll("userList");
			
			ArrayList<User> user = new ArrayList<>();
			
			for(Object o: ob )
			{
				User u = (User) o;
				user.add(u);
				
			}
			
			request.setAttribute("viewAllUsers",user );
    		RequestDispatcher rd = request.getRequestDispatcher("viewAllUsers.jsp");
    		rd.forward(request, response);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
    	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
