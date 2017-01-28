package main.java;

public class LoginBusiness {

	public String Validate(Login login) {
		// TODO Auto-generated method stub
		if(login.password.equals("xyz"))
		return "Login successful";
		else
			return "Login failed";
	}

}
