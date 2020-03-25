package sample;

import sample.practice.Cat;
import sample.practice.Chicken;
import sample.practice.DragonFly;

public class Main {
	
	private static UserController controller = new UserController();
	
	/*
	 * 동물 클래스를 3개를 만드는데 하나는 Runnable, 하나는 Runnable, Flyable, 나머지 하나는 Flyable 만들고
	 * 객체를 각각 한개씩 생성한 다음에
	 * 배열로 달릴수 있는 객체만 담아서
	 * 반복문으로 달리도록 실행시켜라
	 * 
	 */
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Chicken chicken = new Chicken();
		DragonFly dragonfly = new DragonFly();
		
	
		Runnable[] running = { cat, chicken };		
		
		for (int i = 0; i < running.length; i++) {
			running[i].run((i*34)+1);
		}
		
		Flyable[] flying = {chicken, dragonfly};
		
		for (int i = 0; i < flying.length; i++) {
			flying[i].fly((i*38)+1);
		}
			
	}
	
	
	/*
	 * 동물 클래스를 3개를 만드는데 하나는 Runnable, 하나는 Runnable, Flyable, 나머지 하나는 Flyable 만들고
	 * 객체를 각각 한개씩 생성한 다음에
	 * 배열로 달릴수 있는 객체만 담아서 반복문으로 달리도록 실행시켜라
	 * 
	 */
	
}
