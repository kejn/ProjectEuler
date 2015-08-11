package com.euler.selectiveAmnesia;

import java.util.List;

/**
 * Robin's strategy is to:
 * > hold new numbers at the end of memory 
 * > remove number from the beginning of memory if it's full
 */
public class RobinStrategy implements ReplaceStrategy {
	public void updateNumberPosition(Integer number, List<Integer> inMemory) {
	}
	
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
