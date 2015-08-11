package com.euler.selectiveAmnesia;

import java.util.ArrayList;
import java.util.List;

public class AmnesiaPlayer {

	public static final int MEMORY_SIZE = 5;

	private List<Integer> memory;
	private int score;
	private ReplaceStrategy strategy;

	public AmnesiaPlayer() {
		memory = new ArrayList<>();
		score = 0;
		strategy = null;
	}

	public AmnesiaPlayer(ReplaceStrategy strategy) {
		memory = new ArrayList<>();
		score = 0;
		this.strategy = strategy;
	}

	public final List<Integer> memory() {
		return memory;
	}

	public void remember(Integer number) {
		if (hasInMemory(number)) {
			++score;
			strategy.updateNumberPosition(number, memory);
		} else {
			strategy.removeNumberIf(memory, freeMemory() == 0);
			strategy.addNumber(number, memory);
		}
	}

	public int score() {
		return score;
	}

	public int freeMemory() {
		return MEMORY_SIZE - memory.size();
	}

	public boolean hasInMemory(Integer number) {
		if (memory.indexOf(number) < 0) {
			return false;
		}
		return true;
	}

}
