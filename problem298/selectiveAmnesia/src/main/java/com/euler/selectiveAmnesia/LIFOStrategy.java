package com.euler.selectiveAmnesia;

import java.util.List;

/**
 * LIFO strategy is to:<br>
 * > remove number from the beginning of memory if it's full<br>
 * > add number at the end of memory
 */
public abstract class LIFOStrategy implements ReplaceStrategy {

	@Override
	public void removeNumberIf(List<Integer> memory, boolean isFull) {
		if(isFull) {
			memory.remove(0);
		}
	}

	@Override
	public void addNumber(Integer number, List<Integer> toMemory) {
		toMemory.add(number);
	}

}
