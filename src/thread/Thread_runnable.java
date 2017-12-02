package thread;

public class Thread_runnable implements Runnable{
    double b[]= {0.2,0.8,2.1,3.3,4.2,4.9,7.3,9.9,10.1,13.2};
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.println("スレッド2から出力 : "+b[i]);
	}
}


}