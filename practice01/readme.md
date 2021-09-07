## Java study

### practice01
1. 자바 기본 프로그래밍 연습 

①번 문제

```package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner( System.in );
		System.out.println("수를 입력하십시오 : ");
		i = scanner.nextInt();
		
		if(i%3==0) {
			System.out.println("3의 배수입니다.");
		}
		else
		scanner.close();
	}
}
```

②번 문제

```package prob2;

public class Prob2 {
	public static void main(String[] args) {
		int i;
		int j;
		for(j=1;j<11;j++) {
		for(i=j;i<j+10;i++) {
			System.out.print(" "+ i);
		}
		System.out.println("");
		}
	}
}


```

### practice02
2. 자바 기본 프로그래밍 연습2

### chapter03
3. 객체지향 프로그래밍 수업 정리