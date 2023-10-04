package inheritance_pratice;

class circle{
	final double PI = 3.14;
	protected double radius;
	
	public circle(double r) {
		this.radius = r;
	}
	public double area() {
		return PI*this.radius*this.radius;
	}
}

class cylinder extends circle{
	protected double height;
	
	public cylinder(double r, double h) {
		super(r);
		this.height = h;
	}
	public double surface_area() {
		return PI*this.radius*this.radius*height;
	}
}
public class qno1 {
	public static void main(String[] args) {
		circle c1 = new circle(30);
		System.out.println(c1.area());
		
		cylinder cy1 = new cylinder(10,20);
		System.out.println(cy1.surface_area());
	}
}
