package multithreading;

public class multithreadingInterfaceIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		multithreadingInerface f= new multithreadingInerface("firefox");
		Thread fi =new Thread(f);
		multithreadingInerface i= new multithreadingInerface("ie");
		Thread ie =new Thread(i);
		multithreadingInerface o= new multithreadingInerface("oper");
		Thread op =new Thread(o);
		multithreadingInerface g= new multithreadingInerface("google");
		Thread go =new Thread(f);
		fi.start();
		ie.start();
		op.start();
		go.start();
	}

}
