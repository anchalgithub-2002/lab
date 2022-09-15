//progra to create multithread class, then creating,initializing and starting two thread from class....
import java.lang.Thread;
class MyThread extends Thread{
	String message[]={"java","is","hot,","aromatic,","and","invigorating."};
	public void run()
	{
		String name=getName();
		for(int i=0; i<message.length; i++){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(name + message[i]);
		}
	}
}
public class CurrentThread{
	public static void main(String args[]){
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
}