package hijava.practice;

/**
 * 첫번째 자바 실습
 * @author Administrator
 * @update say함수 추가 (2019-01-12 by mskim)
 */

public class HelloJava {

	public static void main(String[] args) {
		//HelloJava에게 say라는 명령을 내림
		HelloJava.say("안녕");
		System.out.println("Hello Java!!");
	}
	
	public static void say(String msg) {
		System.out.println("msg : " + msg);
	}

}
