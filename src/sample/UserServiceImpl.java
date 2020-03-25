package sample;


public class UserServiceImpl implements UserService, Runnable, Flyable {

	@Override
	public boolean login(String id, String password) {
		return true;
	}

	@Override
	public void run(int runningHour) {
		System.out.println(runningHour + "시간 동안 뛰었습니다.");
	}

	@Override
	public void fly(int distance) {
		System.out.println(distance + "거리를 날아갔습니다.");
	}

}
