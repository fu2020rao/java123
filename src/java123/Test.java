package java123;

public class Test extends Thread {

@Override
	public void run() {
		//TODO Auto-generated method stub
		// super.run();
		for (int i=0;i<2000;i++) {
			System.out.println(i+ "+++多线程+++");
		}
	}

	public static void main(String[] args) {
		Test thread =new Test();
		thread.start();
		// TODO Auto-generated method stub
for (int i=0; i<=2000; i++) {
	System.out.println(i + "---主线方程---");
}

}
}
