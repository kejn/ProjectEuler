package com.euler.selectiveAmnesia;

import java.util.List;

/**
 * Larry's strategy is to:
 * > hold recently called numbers at the end of memory
 * > remove number from the beginning of memory if it's full
 */
public class LarryStrategy implements ReplaceStrategy {
	@Override
	public void updateNumberPosition(Integer number, List<Integer> inMemory) {
		inMemory.add(inMemory.remove(inMemory.indexOf(number)));
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
