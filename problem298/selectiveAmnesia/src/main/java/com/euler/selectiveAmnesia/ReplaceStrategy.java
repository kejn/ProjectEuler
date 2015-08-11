package com.euler.selectiveAmnesia;

public interface ReplaceStrategy {
	
	public void updateNumberPosition(Integer number, PlayerMemory memory);
	public void addNumber(Integer number, PlayerMemory memory);
	public void removeNumberIf(PlayerMemory memory);
}
