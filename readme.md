## Java study

### chapter01 - practice01
1. 자바 기본 프로그래밍 연습 

①번 문제

```
package prob1;

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

```
package prob2;

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

③번 문제

```
```

④번 문제

```
```

⑤번 문제

```
```

### practice02
1. 자바 기본 프로그래밍 연습2

### chapter02
1. 객체지향 프로그래밍 수업 정리

UML(Unified Modeling Language) - 설계자와 설계도를 보며 구현하는 사람이 알아야 한다.

has a 관계 - 가지는(포함하는) 관계

 공통적인 것을 모아놓거나, 중요한 것은 남기고, 불필요한 것을 없애는 것을 객체 지향에서는 "추상화"라고 한다.

 객체들이 가지고 있는 속성들과 기능들 중 공통적인 것이나, 중요한 것들만 남기고 불필요한 것을 없애게 되는 과정을
 '추성화 한다'라고 한다.
 
 객체의 데이터는 메소드를 통해 접근이 가능하다.
 
 배열에서 데이터 삽입은 pop을 사용한다. 
 
 stack - FILO(123입력, 321출력), queue - FIFO(123입력, 123출력)




