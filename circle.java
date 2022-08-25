public class Circle
{
	private static int count;
	float center,radius;
	public Circle(float c,float r){
		this.center=c;
		this.radius=r;
		count++;
	}
	Circle(){
		System.out.println("this is a default constructor");
		count++;
	}
	void display(){
		System.out.println("Center:"+center+""+"radius:"+radius);
	}
	public static void main(String args[]){
		Circle c1=new Circle(2.3f,4.5f);
		Circle c2=new Circle(22.4f,6.2f);
		c1.display();
		c2.display();
		Circle c3=new Circle();
		System.out.println("total number of instance:"+Circle.count);
	}
}