package chapter03;

import mypackage.Goods2;

public class GoodsApp2 {
	public static void main(String[] args) {
		Goods2 g = new Goods2();
		
		
		g.name = "camera"; // public은 접근 제한이 없다.
		//g.price = 1000;    // protected는 같은 패키지에서 접근이 가능하다.
						   // 더 중요한 것은 자식클래스에서도 접근이 가능하다.
		//g.countStock = 10; // default는 같은 패키지에서만 접근이 가능하다.
		//g.countSold = 10; // private는 같은 클래스에서만 접근이 가능하다.
	}

}