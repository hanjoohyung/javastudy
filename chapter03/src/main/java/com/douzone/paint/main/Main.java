package com.douzone.paint.main;

import com.douzone.paint.i.Drawable;
import com.douzone.paint.point.ColorPoint;
import com.douzone.paint.point.Point;
import com.douzone.paint.shape.Circle;
import com.douzone.paint.shape.Rectangle;
import com.douzone.paint.shape.Shape;
import com.douzone.paint.shape.Triangle;
import com.douzone.paint.text.GraphicText;

public class Main {
	
	public static void main (String[] args) { // setter로 생성하는 방법 생성자로 생성하는 방법을 알아야 한다.
		
		Point point1 = new Point(10,10);
		//point1.setX(10);
		//point1.setY(10);
		//drawPoint(point1);
		//point1.disapear();
		//point1.show(false);
		draw(point1);
		
		Point Point2 = new ColorPoint(100,200,"red");
		//Point2.setX(100);
		//Point2.setY(200);
		//((ColorPoint)Point2).setColor("red");
		//drawPoint(Point2);'
		draw(Point2);
		
		Triangle triangle = new Triangle();
		//drawTriangle(triangle;)
		//drawShape(triangle);'
		draw(triangle);
	
		Rectangle rectangle = new Rectangle();
		//drawRectangle(rectangle);
		//drawShape(rectangle);
		draw(rectangle);
		
		Circle circle = new Circle();
		//drawCircle(circle);
		//drawShape(circle);
		draw(circle);
		
		GraphicText text = new GraphicText("Hello World");
		draw(text);
		
		//instanceof test
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		//System.out.println(circle instanceof Rectangle); interface는 hierachy와 상관없이 instanceof 연산자를 사용할 수 있따.
		//System.out.println(circle instanceof Triangle);  class는 hierachy(계층) 상위와 하위만 instanceof 연산자를 사용할 수 있다.
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable);
	}
	public static void draw(Drawable drawable) {
		drawable.draw();	
	}
	public static void drawPoint(Point point) {
		point.show();
	}
//	public static void drawColorPoint(ColorPoint colorPoint) {
//		colorPoint.show();
//	}
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
//	public static void drawRectangle(Rectangle rectangle) {
//		rectangle.draw();
//	}
//	public static void drawCircle(Circle circle) {
//		circle.draw();
//	}
	
	
}
