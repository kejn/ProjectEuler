package com.euler.selectiveAmnesia;

import java.util.ArrayList;

public class PlayerMemory extends ArrayList<Integer> {
	private static final long serialVersionUID = 1113061817322728994L;
	private static final int memoryToStringLength = 16;

	public static final int MEMORY_SIZE = 5;

	public PlayerMemory() {
		super();
	}
	
	public PlayerMemory(PlayerMemory memory) {
		super();
		for (Integer integer : memory) {
			add(integer);
		}
	}

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
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(super.toString());
		for (int i = output.length(); i < memoryToStringLength; ++i) {
			output.append(' ');
		}
		return output.toString();
	}
	
	
}
