package com.euler.selectiveAmnesia;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStrategies {

	// replace the number that hasn't been called in the longest time.
	@Test
	public void testLarryStrategyShouldReplace1() {
		// given
		AmnesiaPlayer player = new AmnesiaPlayer(new LarryStrategy());
		//when
		player.remember(1);
		player.remember(2);
		player.remember(3);
		player.remember(4);
		player.remember(5);
		
		player.remember(1); // memory full, but only +1 score
		player.remember(6); // memory-exceeding number
		//then
		assertTrue(player.memory().contains(1));
		assertFalse(player.memory().contains(2));
	}
	
	// replace the number that's been in the memory the longest time.
	@Test
	public void testRobinStrategyShouldReplace1() {
		//given
		AmnesiaPlayer player = new AmnesiaPlayer(new RobinStrategy());
		//when
		player.remember(1);
		player.remember(2);
		player.remember(3);
		player.remember(4);
		player.remember(5);
		
		player.remember(6); // memory-exceeding number
		player.remember(7); // memory-exceeding number
		//then
		assertFalse(player.memory().contains(1));
		assertFalse(player.memory().contains(2));
	}

}
