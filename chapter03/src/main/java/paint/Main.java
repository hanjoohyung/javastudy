package paint;

public class Main {
	
	public static void main (String[] args) {
		
		Point point1 = new Point();
		point1.setX(10);
		point1.setY(10);
		
		
		drawPoint(point1);
		//point1.disapear();
		point1.show(false);
		
		Point Point2 = new ColorPoint();
		Point2.setX(100);
		Point2.setY(200);
		((ColorPoint)Point2).setColor("red");
		drawPoint(Point2);
		
		Point2.show(false);
		Point2.show(true);
		
		Triangle triangle = new Triangle();
		drawTriangle(triangle);
	
		
		Rectangle rectangle = new Rectangle();
		drawRectangle(rectangle);
		
		Circle circle = new Circle();
		drawCircle(circle);
	
	
	}
	public static void drawPoint(Point point) {
		point.show();
	}
//	public static void drawColorPoint(ColorPoint colorPoint) {
//		colorPoint.show();
//	}
	public static void drawTriangle(Triangle triangle) {
		triangle.draw();
	}
	public static void drawRectangle(Rectangle rectangle) {
		rectangle.draw();
	}
	public static void drawCircle(Circle circle) {
		circle.draw();
	}
}
