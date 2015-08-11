package com.euler.selectiveAmnesia;

import java.util.List;

public interface ReplaceStrategy {
	
	public void updateNumberPosition(Integer number, List<Integer> inMemory);
	public void removeNumberIf(List<Integer> memory, boolean isFull);
	public void addNumber(Integer number, List<Integer> toMemory);
}
