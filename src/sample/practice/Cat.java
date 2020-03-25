package sample.practice;

import sample.Runnable;

public class Cat extends Animal implements Runnable {

	@Override
	public void run(int runningHour) {
		System.out.println("Cat이" + runningHour + "시간 동안 뛰었습니다.");
		
	}
}