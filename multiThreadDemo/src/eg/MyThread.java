package eg;

public class MyThread  extends Thread{
	@Override
	public void run() {
		
		//System.out.println("thread name is"+Thread.currentThread().getName()+"whose  id is "+ Thread.currentThread().getId() +"and priority is "+ Thread.currentThread().getPriority());
	for(int i=0;i<4;i++) {
		System.out.println("from thread"+""+Thread.currentThread().getName()+""+"value of i"+""+i);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	
	}
}
}