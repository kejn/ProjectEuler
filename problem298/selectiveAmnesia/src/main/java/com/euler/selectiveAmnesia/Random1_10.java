package com.euler.selectiveAmnesia;

import java.util.Random;

public class Random1_10 extends Random {
	private static final long serialVersionUID = 558728106944558230L;
	
	public int next() {
		return super.nextInt(10) + 1;
	}
}
