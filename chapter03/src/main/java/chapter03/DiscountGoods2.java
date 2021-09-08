package chapter03;

import mypackage.Goods2;

public class DiscountGoods2 extends Goods2 {
	private float discountRate = 0.5f;
	
	public float getDiscountPrice(){
		return discountRate * price; //protected는 자식클래스에서 접근이 가능하다. (price)
	}
}
