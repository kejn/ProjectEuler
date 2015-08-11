package com.euler.selectiveAmnesia;

/**
 * Larry strategy extends LIFOStrategy by:<br>
 * > holding recently called numbers at the end of memory
 */
public class LarryStrategy extends LIFOStrategy {
	
	public void updateNumberPosition(Integer number, PlayerMemory inMemory) {
		try {
			inMemory.add(inMemory.remove(inMemory.indexOf(number)));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
