package chapter03;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student() ;
		s1.setGrade(1);
		
		Person p1 = s1; //up casting(암시적, Implicity)
		p1.setName("둘리");
		
		Student s2 = (Student)p1; //down casting(명시적, explicity)
		s2.setMajor("cs");
		
		
	}

}