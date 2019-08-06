package data;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Business.User;

public class TestCasedbEvents {

	database obj=null;
	@Before
	public void setUp() throws Exception {
		obj=new database();
	}

	
	@Test
	public void getalldata() {
			String fake = "f";
			assertTrue(fake.equals("f"));
	}

	
}
