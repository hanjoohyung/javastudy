package prob04;

public class Person {
	private static int numberOfPerson = 0; // 전체 인구수
	private int age;
	private String name;
	
	public Person(String name) {
		age = 12;
		this.name = name;
		System.out.println("내 이름은 "+ name + "이며 나이는," + age + " 입니다.");
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void numberOfPerson() {
		numberOfPerson = numberOfPerson +1;
	}
	/* 코드 작성 */

	public static String getPopulation() {
		return null;
	}

	public void selfIntroduce() {
		// TODO Auto-generated method stub
		
	}
}
