private class Student 
{
		protected String id;
        private String name;
		public int age;
		double grade;
		Student(String name, String id, int age){
			this.name=name;
			this.id=id;
			this.age=age;
		}
		boolean ispassed(float grade){
			return true;
		}
	}
	
}
class UnderGrad extends Student{
	super(name,id,age);
} 
boolean ispassed(float grade){
	if(grade>=70.0){
		return super.isPassed(grade);
	}
	else{
		return false;
	}
}
class Grad extends Student{
	Grad(String name,String id,int Age){
		super(name,id,age);
	}
	boolean isPassed(float grade){
		if(grade>=80){
			return super.isPassed(grade);
		}else{
			return false;
		}
	}
}
public class test{
	public static void main(String args[])
	{
		Grad grad=new Grad("someone","007"25);
		System.out.println("grad is passed:"+grad,isPassed(90));
		UnderGrad underGrad=new UnderGrad("anyone","008",22);
		System.out.println("UnderGrad is passed:"+underGrad.ispassed(50));
	}
}
