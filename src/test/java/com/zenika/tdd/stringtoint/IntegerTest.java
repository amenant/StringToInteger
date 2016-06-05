package com.zenika.tdd.stringtoint;

import org.junit.Assert;
import org.junit.Test;

import com.zenika.tdd.stringtoint.Integer;

public class IntegerTest {
	
	@Test
	public void testParseIntegerWith1Digit() {
		 Assert.assertEquals(3, Integer.parseInt1("3"));
		 Assert.assertEquals(1, Integer.parseInt1("1"));
	}
	
	@Test
	public void testParseInteger() {
		 Assert.assertEquals(123, Integer.parseInt2("123"));
		 Assert.assertEquals(1, Integer.parseInt2("1"));
	}
	
	@Test
	public void testParseIntegerNegative() {
		 Assert.assertEquals(123, Integer.parseInt3("123"));
		 Assert.assertEquals(1, Integer.parseInt3("1"));
		 Assert.assertEquals(-1, Integer.parseInt3("-1"));
		 Assert.assertEquals(-98745, Integer.parseInt3("-98745"));
		 Assert.assertEquals(555, Integer.parseInt3("555"));
	}
}
