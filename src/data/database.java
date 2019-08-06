package data;


import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.ObjectUtils.Null;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Business.CountryUser;
import Business.JobUser;
import Business.User;
import Business.UserCredentials;


public class database implements Idata {
	
	public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
		PreparedStatement ps = null;
	
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;databaseName=JobConsultant";
			String username = "shaznishiraz";
			String password = "shz1234";
			
			Connection cn = DriverManager.getConnection(url, username, password);
			ps = cn.prepareStatement(sql);
			
			
			return ps;
	}
	
	

	@Override
	public int delete(String id){

		try {
			String sql = "delete from [JobUser] where UserID = ? delete from [CountryUser] where UserID = ? delete from [User] where UserID = ?";
            PreparedStatement ps = database.getPreparedStatement(sql);
            ps.setString(1, id);
            ps.setString(2, id);
            ps.setString(3, id);
            ps.executeUpdate();
            return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		
		return 0;
	}
	
		



	@Override
	public int add(Object ob,String obType) {
		int result;
	
		if(obType=="User")
		{
			// TODO Auto-generated method stub
			User user = (User) ob;
			try {
			PreparedStatement ps = getPreparedStatement("insert into [User] values(?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, user.getUserID());
			ps.setString(2, user.getFirstName());
			ps.setString(3, user.getLastName());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getDOB());
			ps.setString(6, user.getGender());
			ps.setString(7, user.getuName());
			ps.setString(8, user.getpWord());
			ps.setString(9, user.getuType());
			ps.setString(10, user.getuStatus());
			
			result = ps.executeUpdate();
			return result;
			
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString()+ "Add User Faliure");
			
			}
			return 0;	
		
		}
		
		if(obType=="JobUser"){
			// TODO Auto-generated method stub
						
						JobUser jobuser = (JobUser) ob;
						try {
						PreparedStatement ps = getPreparedStatement("insert into [JobUser] values(?,?,?)");
						ps.setString(1, jobuser.getJuID());
						ps.setString(3, jobuser.getJobName());
						ps.setString(2, jobuser.getjID());
					
						result = ps.executeUpdate();
						return result;
						
						} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e.toString()+"Issue with adding");
						
						}
						return 0;	
			
		}
		
		if(obType=="CountryUser"){
			// TODO Auto-generated method stub
						
			CountryUser countryUser = (CountryUser) ob;
						try {
						PreparedStatement ps = getPreparedStatement("insert into [CountryUser] values(?,?,?)");
						ps.setString(1, countryUser.getCuID());
						ps.setString(2, countryUser.getcID());
						ps.setString(3, countryUser.getCountryCode());
					
						result = ps.executeUpdate();
						return result;
						
						} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e.toString());
						
						}
						return 0;	
			
		}
		
		if(obType=="JobUser"){
			// TODO Auto-generated method stub
						
			
			JobUser jobUser = (JobUser) ob;
						try {
						PreparedStatement ps = getPreparedStatement("insert into [JobUser] values(?,?,?)");
						ps.setString(1, jobUser.getJuID());
						ps.setString(2, jobUser.getjID());
						ps.setString(3, jobUser.getJobName());
					System.out.println(jobUser.getJuID()+" "+ jobUser.getjID()+" "+jobUser.getJobName());
						result = ps.executeUpdate();
						return result;
						
						} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e.toString()+"Add Job User Issue");
						
						}
						return 0;	
			
		}
		
		
		
		
		
			return 0;
	}

	
	public Object verifylogin(String Username,String Password){
		Object ob = null;
		try {
			System.out.println(Username+" "+Password);
			ResultSet rs = getPreparedStatement("Select FirstName,LasttName,Uname,Pword,UType from [User] where Uname='"+Username+"' AND Pword='"+Password+"'").executeQuery();
			while(rs.next()) {
				UserCredentials uc = new UserCredentials();
				uc.setFirstName(rs.getString(1));
				uc.setLastName(rs.getString(2));
				uc.setUsername(rs.getString(3));
				uc.setPassword(rs.getString(4));
				uc.setUsertype(rs.getString(5));
				ob = uc;
				}
			
			
			return ob;
			
			} catch (Exception e) {
			// TODO: handle exception
				System.out.println(e.toString()+"Add verify login User Issue");
			return null;
			
			}
	}
	
	public String getCnameId(String Country){
		
		String CID=null;
		try {
			ResultSet rs = getPreparedStatement("select CID from [Country] where CountryCode='"+Country+"'").executeQuery();
			System.out.println(rs.toString());
			while (rs.next()){
				CID = rs.getString(1);
				
			}
	
		} catch (ClassNotFoundException | SQLException ex) {
		        Logger.getLogger(database.class.getName()).log(Level.SEVERE, null,"get Country Naame ID error"+ ex);
		        return null;
		}		
		
		return CID;
	}
	
	public String getJnameId(String jobName){
		
		String JID=null;
		try {
			ResultSet rs = getPreparedStatement("select JID from [Job] where Jobname='"+jobName+"'").executeQuery();
			System.out.println(rs.toString());
			while (rs.next()){
				JID = rs.getString(1);
				
			}
	
		} catch (ClassNotFoundException | SQLException ex) {
		        Logger.getLogger(database.class.getName()).log(Level.SEVERE, null,"get Job Naame ID error"+ ex);
		        return null;
		}		
		
		return JID;
	}

	public String getID(String idType){
		
		int id=1;
		int id2=1;
		if(idType=="User"){
			
			
			try {
		ResultSet rs = getPreparedStatement("select UserID from [User]").executeQuery();
		System.out.println(rs.toString());
		while (rs.next()){
			rs.getString(1);
			id++;
				}
		
			} catch (ClassNotFoundException | SQLException ex) {
	        Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
	        return null;
			}		
			
				return "U"+id;
		}
		
		
	

	if(idType=="CountryUser"){
			
			
			try {
		ResultSet rs = getPreparedStatement("select CUID from [CountryUSer]").executeQuery();
		System.out.println(rs.toString());
		while (rs.next()){
			rs.getString(1);
			id2++;
				}
		
			} catch (ClassNotFoundException | SQLException ex) {
	        Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
	        return null;
			}		
			
			return "CU"+id2;
		}
	
	if(idType=="JobUser"){
		
		id=0;
		try {
	ResultSet rs = getPreparedStatement("select JUID from [JobUser]").executeQuery();
	System.out.println(rs.toString());
	while (rs.next()){
		rs.getString(1);
		id++;
			}
	
		} catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        return null;
		}		
		
		return "JU"+id;
	}
	
	return null;
	}
	
	
	
	
	
	
	@Override
	public int updateUser(Object ob) {
		User user = (User) ob;
		 try {
			 PreparedStatement ps = getPreparedStatement("update [User] SET FirstName = ?, LasttName = ?, Email = ?, DOB = ?, Gender = ?, Uname = ?, "
			 		+ "Pword = ?, UType = ?, UStatus = ? where UserID = ?");
	        	
				ps.setString(1, user.getFirstName());
				ps.setString(2, user.getLastName());
				ps.setString(3, user.getEmail());
				ps.setString(4, user.getDOB());
				ps.setString(5, user.getGender());
				ps.setString(6, user.getuName());
				ps.setString(7, user.getpWord());
				ps.setString(8, user.getuType());
				ps.setString(9, user.getuStatus());
				ps.setString(10, user.getUserID());
				
	            ps.executeUpdate();
	            return 1;
	        } catch (ClassNotFoundException | SQLException ex) {
	            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
		return 0;
	}


	@Override
	public Object getUserByID(String id) {
					ArrayList<User> user = new ArrayList<>();
					try {
				ResultSet rs = getPreparedStatement("select * from [User] where UserID = '"+ id +"'  ").executeQuery();
				System.out.println(rs.toString());
				while (rs.next()){
					User user2 = new User(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)
							,rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),
							rs.getString(10));
					user.add(user2);
					
				}
				return user;
			 } catch (ClassNotFoundException | SQLException ex) {
			        Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
			    }		
			return null;		
	}


	public ArrayList<Object> getAll(String get) {
	if(get=="userList")
	{
		
				ArrayList<Object> user = new ArrayList<>();
				ArrayList<User> user3 = new ArrayList<>();
				try {
			ResultSet rs = getPreparedStatement("select * from [User]").executeQuery();
			while (rs.next()){
				User user2 = new User(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)
						,rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),
						rs.getString(10));
				user.add(user2);        
				
			}
			return user;
		 } catch (ClassNotFoundException | SQLException ex) {
			 	System.out.println(ex.toString());
		        Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
		    }
	}
		
		
		
		
return null;	
	}


	
	public static void main(String[] args) {
		
	}

	@Override
	public int update(Object ob) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public Object get(String id) {
		// TODO Auto-generated method stub
		return null;
	}



}
