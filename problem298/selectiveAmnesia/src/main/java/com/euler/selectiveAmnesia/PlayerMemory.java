package com.euler.selectiveAmnesia;

import java.util.ArrayList;

public class PlayerMemory extends ArrayList<Integer> {
	private static final long serialVersionUID = 1113061817322728994L;

	public static final int MEMORY_SIZE = 5;

	public int freeMemory() {
		return MEMORY_SIZE - size();
	}
	
	public boolean contains(Integer number) {
		if (indexOf(number) < 0) {
			return false;
		}
		return true;
	}

	@Override
	public boolean add(Integer e) throws IndexOutOfBoundsException {
		if(size() == MEMORY_SIZE) {
			throw new IndexOutOfBoundsException("PlayerMemory is full.");
		}
		return super.add(e);
	}
	
	
}
