package com.vinod;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
	@Test(priority=1)
	public void a() {
		System.out.println("a");
	}

	@Test
	public void c() {
		System.out.println("c");
	}
	@Test(priority=3)
	@Parameters({"userName"})
	public void b(String userName) {
		System.out.println("b "+userName);
		
	}
	
}
