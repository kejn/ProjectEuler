package com.euler.selectiveAmnesia;

public final class Game {

	public static void main(String[] args) {
		AmnesiaPlayer larry = new AmnesiaPlayer(new LarryStrategy());
		AmnesiaPlayer robin = new AmnesiaPlayer(new RobinStrategy());
		Random1_10 random = new Random1_10();
		
		System.out.println("Turn\tCalled number\tLarry\t\t\tRobin");
		for (int i = 0; i < 50; i++) {
			int number = random.next();
			larry.remember(number);
			robin.remember(number);
			System.out.println(i + "\t" + number + "\t\t" + larry.toString() + "\t" + robin.toString());
		}
	}

}
