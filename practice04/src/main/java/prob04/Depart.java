package prob04;

public class Depart extends Employee {
	private String department;
	
	public Depart(String name, int salary, String department) {
		super(name,salary); // 부모클래스의 값을 불러오는 함수
		this.department = department; // 먼저 입력된 값을 불러 온다.
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public void getInformation() { // getInformation을 오버라이드 해주어서 출력되게 해줌
		System.out.println("이름 : "+ getName() + " 연봉 : "+ getSalary() + " 부서 : " + department);
	}

}
