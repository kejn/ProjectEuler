package com.euler.selectiveAmnesia;

import org.junit.Test;

import junit.framework.TestCase;

public class TestRandom1_10 extends TestCase {

	@Test
	public void testShouldReturnNumberInRange1_10() {
		Random1_10 random = new Random1_10();
		int number = random.next();
		assertFalse(10 - number < 0);
	}
}
