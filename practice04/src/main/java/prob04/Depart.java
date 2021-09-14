package prob04;

public class Depart extends Employee {
	private String department;
	
	public Depart(String name, int salary, String department) {
		super(name,salary); // 부모클래스인 Employee에서 먼저 설정 완료. 설정된 값을 불러오는 함수
		this.department = department; // Prob4의 값을 불러 온다.
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public void getInformation() { // 부모클래스인 Employee에 먼저 설정된 getInformation을 오버라이드 하여 덮어씌워 출력
		System.out.println("이름 : "+ getName() + " 연봉 : "+ getSalary() + " 부서 : " + department);
	}

}
