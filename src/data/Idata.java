package data;

import java.util.ArrayList;

import Business.User;




public interface Idata {

	    int delete(String id);
	    int update(Object ob);
	    int updateUser(Object ob);
	    Object get(String id); //Search
	    ArrayList<Object> getAll(String get);
		Object getUserByID(String id);
		int add(Object ob, String obType);
		String getID(String idType);
		String getCnameId(String Country);
		String getJnameId(String jobName);
		Object verifylogin(String Username,String Password);
}
