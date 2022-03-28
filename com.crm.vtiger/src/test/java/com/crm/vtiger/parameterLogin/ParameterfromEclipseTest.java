package com.crm.vtiger.parameterLogin;

import org.testng.annotations.Test;

public class ParameterfromEclipseTest {
		@Test
		public void loginPage() {
			System.out.println(System.getProperty("browser"));
			System.out.println(System.getProperty("url"));
			System.out.println(System.getProperty("username"));
			System.out.println(System.getProperty("password"));
		}

}