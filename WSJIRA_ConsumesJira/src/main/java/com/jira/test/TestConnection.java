package com.jira.test;
import java.io.IOException;

import com.jira.consumesData.ConnectionJira;;

public class TestConnection {

	public static void main(String[] args) throws IOException {
		
		ConnectionJira connection = new ConnectionJira();
		connection.consumesJira("mdtavares", "Stefanini@1994");
		
		
		
	
	}

}
