package sample.practice;

import sample.Flyable;
import sample.Runnable;

public class Chicken extends Animal implements Runnable, Flyable {

	@Override
	public void fly(int distance) {
		System.out.println("chicken이" + distance + "거리를 동안 날았습니다.");
		
	}

	@Override
	public void run(int runningHour) {
		System.out.println("chicken이" + runningHour + "시간 동안 뛰었습니다.");
	}
	
}