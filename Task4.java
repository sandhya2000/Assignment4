package myFirstPro;

public class Task4 {
	public static void main(String[] args) {
		ThreadGroup threadGroup=new ThreadGroup("threadGroup");
		Runnable r = ()-> System.out.println("Hello India");
		
		var t1=new Thread(threadGroup, r, "Thread1");
		var t2=new Thread(threadGroup, r, "Thread2");
		var t3=new Thread(threadGroup, r, "Thread3");
		var t4=new Thread(threadGroup, r, "Thread4");
		var t5=new Thread(threadGroup, r, "Thread5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}