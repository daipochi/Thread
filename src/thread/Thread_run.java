package thread;

public class Thread_run extends Thread{
   double a[]= {1.0,2.0,3.0,3.9,4.8,5.2,6.0,8.4,10.0,13.2};
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("スレッドから出力 : "+a[i]);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
