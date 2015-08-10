package com.euler.selectiveAmnesia;

import org.junit.Test;

import junit.framework.TestCase;

public class RandomIntegerTest extends TestCase {

	@Test
	public void shouldReturnNumberInRange1_10() {
		RandomInteger randomNumber = new RandomInteger(1,10);
		int number = randomNumber.next();
		assertFalse(10 - number < 0);
	}
}
