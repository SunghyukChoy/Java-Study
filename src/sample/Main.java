package sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import sample.practice.Animal;
import sample.practice.Cat;
import sample.practice.Chicken;
import sample.practice.DragonFly;

public class Main {

	private static UserController controller = new UserController();

	/*
	 * 동물 클래스를 3개를 만드는데 하나는 Runnable, 하나는 Runnable, Flyable, 나머지 하나는 Flyable 만들고 객체를
	 * 각각 한개씩 생성한 다음에 배열로 달릴수 있는 객체만 담아서 반복문으로 달리도록 실행시켜라
	 * 
	 */

	public static void main(String[] args) {
		
		// 개념 코드
		Cat cat = new Cat();
		Chicken chicken = new Chicken();
		DragonFly dragonfly = new DragonFly();

		Runnable[] running = { cat, chicken };
		
		for (int i = 0; i < running.length; i++) {
			running[i].run((i * 34) + 1);
		}

		Flyable[] flying = { chicken, dragonfly };

		for (int i = 0; i < flying.length; i++) {
			flying[i].fly((i * 38) + 1);
		}

		// 실전 코드
		Animal[] animals = { cat, chicken, dragonfly };
		
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			runnableRun(animal, 35);
		}
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(cat);
		animalList.add(chicken);
		animalList.add(dragonfly);
		
		for (Animal animal : animalList) {
			runnableRun(animal, 35);
		}
		
		Iterator<Animal> iterator = animalList.iterator();
		while(iterator.hasNext()) {
			Animal animal = iterator.next();
			runnableRun(animal, 35);
		}
		
		HashSet<Animal> hashset = new HashSet<>();
		hashset.add(cat);
		hashset.add(chicken);
		hashset.add(dragonfly);
		
		Iterator<Animal> iterator2 = hashset.iterator();
		while(iterator2.hasNext()) {
			Animal animal = iterator2.next();
			runnableRun(animal, 35);
		}
		
	}
	
	public static void runnableRun(Animal animal, int value) {
		try {
			((Runnable)animal).run(value);
		} catch (Exception e) {
			System.out.println("이 동물은 달릴수 없는 동물입니다");
		}
	}

	/*
	 * 동물 클래스를 3개를 만드는데 하나는 Runnable, 하나는 Runnable, Flyable, 나머지 하나는 Flyable 만들고 객체를
	 * 각각 한개씩 생성한 다음에 배열로 달릴수 있는 객체만 담아서 반복문으로 달리도록 실행시켜라
	 * 
	 */

}
