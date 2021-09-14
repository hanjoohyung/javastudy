package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Goods[] goods = new Goods[COUNT_GOODS];
		System.out.println("실행 결과 :");
		for(int i=0;i<goods.length;i++) {
			String line = scanner.nextLine(); // String타입으로 이름과 가격, 재고입력
			
			String[] token = line.split(" "); //  공백을 기준으로 잘라 토큰 생성
			String name = token[0];
			int a = Integer.parseInt(token[1]); // Integer.parseInt()은 String타입을 int타입으로 변환
			int b = Integer.parseInt(token[2]);
			
			Goods g = new Goods();
			g.setName(name); // 각자에 맞는 타입의 token을 대입
			g.setPrice(a);
			g.setCount(b);
			
			goods[i] = g; // 각각의 배열에 token을 대입한 값을 저장 
		}
		
		for(Goods g : goods) { // goods에 g의 대입할 것이 다 할때까지 반복
			g.show();
		}
	

		
		
		// 상품 입력

		// 상품출력
		
		// 자원정리
		scanner.close();
	}
}
