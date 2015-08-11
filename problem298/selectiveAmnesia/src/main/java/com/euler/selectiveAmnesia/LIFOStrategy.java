package com.euler.selectiveAmnesia;

/**
 * LIFO strategy is to:<br>
 * > remove number from the beginning of memory if it's full<br>
 * > add number at the end of memory
 */
public abstract class LIFOStrategy implements ReplaceStrategy {

	@Override
	public void removeNumberIf(PlayerMemory memory) {
		if(memory.freeMemory() == 0) {
			memory.remove(0);
		}
	}

	@Override
	public void addNumber(Integer number, PlayerMemory toMemory) {
		try {
			toMemory.add(number);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
