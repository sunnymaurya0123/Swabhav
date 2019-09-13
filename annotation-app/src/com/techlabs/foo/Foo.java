package com.techlabs.foo;
import com.techlabs.unittest.UnitTest;

public class Foo {
	
	@UnitTest
	public boolean m1() {
		return false;
	}
	
	@UnitTest
	public boolean m2() {
		return true;
	}
	
	//@UnitTest
	public boolean m3() {
		return true;
	}
	
	@UnitTest
	public boolean m4() {
		return true;
	}
	
}
