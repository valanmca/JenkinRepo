package com.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.controller.MyController;

public class MyControllerTest {

	@Test
	public void testSayWelcome1() {
		MyController cont = new MyController();
		ModelAndView actual =  cont.sayWelcome();
		assertNotNull(actual);
	}
	
	@Test
	public void testSayWelcome2() {
		MyController cont = new MyController();
		ModelAndView mv =  cont.sayWelcome();
		String actual = mv.getViewName();
		String expected = "Welcome";
		assertEquals(expected, actual);
	}

}
