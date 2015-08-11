package com.euler.selectiveAmnesia;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestAmnesiaPlayer {

	private AmnesiaPlayer player;
	
	@Before
	public void setUp() {
		// given
		player = new AmnesiaPlayer(new RobinStrategy());
	}
	
	/*********** MEMORY SIZE ***********/
	
	@Test
	public void testWholeMemoryFreeAtBeginning() {
		// then
		assertEquals(PlayerMemory.MEMORY_SIZE, player.memory().freeMemory());
	}

	@Test
	public void testMemoryHoldsMax5Numbers() {
		// when
		for (int i = 0; i < PlayerMemory.MEMORY_SIZE + 1; i++) {
			player.remember(i);
		}
		// then
		assertEquals(5, player.memory().size());
		assertEquals(0, player.memory().freeMemory());
	}

	/*********** SCORE COUNTING ***********/
	
	@Test
	public void testScoreShouldBe0AtBeginning() {
		// then
		assertEquals(0, player.score());
	}
	
	@Test
	public void testShouldIncrementScore() {
		// when
		player.remember(5);
		player.remember(1);
		player.remember(5);
		// then
		assertEquals(1, player.score());
	}
	
	@Test
	public void testShouldIncrementScoreFullMemory() {
		// when
		for (int i = 1; i < 6; i++) {
			player.remember(i);
		}
		player.remember(5);
		// then
		assertEquals(1, player.score());
	}
	
}
