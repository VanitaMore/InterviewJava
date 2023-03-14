
public class ThreadEx implements Runnable{
	@Override
	public void run() {
		System.out.println("run");
	}

	public static void main(String[] args) {
		ThreadEx t=new ThreadEx();
		Thread th=new Thread(t);
		th.start();
		th.start();
         System.out.println("start");
	}

}
