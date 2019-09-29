package array;

import java.util.ArrayList;

public class VectorDemo {
public static void main(String[] args) throws InterruptedException {
	ArrayList<Integer>  vector=new ArrayList<Integer>();
	ThreadDemo td=new ThreadDemo(vector);
	ThreadDemo td2=new ThreadDemo(vector);
	Thread th1=new Thread(td);
	Thread th2=new Thread(td2);
	th1.start();
	//th1.join();
	th2.start();
	Thread.sleep(2000);
	System.out.println(vector.size());
}
	
	
	
}

class ThreadDemo implements Runnable{
       ArrayList<Integer> vect=new ArrayList<>();
       
       public ThreadDemo(ArrayList<Integer> vec) {
    	   this.vect=vec;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Inside run");
		for(int i=0;i<5;i++) {
			vect.add(i);
			System.out.println("Counter: "+i);
			/*
			 * try { //Thread.sleep(2000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}
		
	}
	
}