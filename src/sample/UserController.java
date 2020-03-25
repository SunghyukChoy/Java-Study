package sample;

public class UserController {

	private UserService userService;		// 주소값 1 <-- 100
	private Runnable runImpl;				// 주소값 2 <-- 100
	private Flyable flyImpl;				// 주소값 3 <-- 100
	
	public UserController() {
		UserServiceImpl impl = new UserServiceImpl();	// 주소값 100
		userService = impl;
		runImpl = impl;
		flyImpl = impl;
	}
	
	public String tryLogin() {
		boolean result = userService.login("hyunmui", "1234");
		if (result) {
			return "user/login";
		} else {
			// TODO: Login 실패시 잘못된 메시지가 출력되도록 로직 추가
			return "";
		}
	}
	
	/* Simple is the best */
	
	public void test() {
		userService.login("1", "2");
		runImpl.run(12);
		flyImpl.fly(1000);
	}
	
	
	class B extends A {
		
	}
	
	abstract class A {
		
	}
}
