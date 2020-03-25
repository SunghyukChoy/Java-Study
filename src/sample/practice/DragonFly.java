package sample.practice;

import sample.Flyable;

public class DragonFly implements Flyable {

	@Override
	public void fly(int distance) {
		System.out.println("dragonfly가" + distance + "거리를 동안 날았습니다.");
		
	}
	
}
