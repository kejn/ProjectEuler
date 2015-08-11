package com.euler.selectiveAmnesia;

public class AmnesiaPlayer {

	private int score = 0;
	private PlayerMemory memory = new PlayerMemory();
	private ReplaceStrategy strategy;

	public AmnesiaPlayer(ReplaceStrategy strategy) {
		this.strategy = strategy;
	}

	public final PlayerMemory memory() {
		return memory;
	}

	public int score() {
		return score;
	}

	public void remember(Integer number) {
		if (memory.contains(number)) {
			++score;
			strategy.updateNumberPosition(number, memory);
		} else {
			strategy.removeNumberIf(memory);
			strategy.addNumber(number, memory);
		}
	}
	
	@Override
	public String toString() {
		return memory.toString() + " score: " + score;
	}

}
