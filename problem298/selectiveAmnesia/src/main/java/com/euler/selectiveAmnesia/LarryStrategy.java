package com.euler.selectiveAmnesia;

import java.util.List;

/**
 * Larry strategy except of LIFOStrategy is to:<br>
 * > hold recently called numbers at the end of memory
 */
public class LarryStrategy extends LIFOStrategy {
	
	public void updateNumberPosition(Integer number, List<Integer> inMemory) {
		inMemory.add(inMemory.remove(inMemory.indexOf(number)));
	}
}
