package multithreading;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multithreading ie =new multithreading("ie");
		multithreading firefox =new multithreading("firefox");
		multithreading google =new multithreading("google");
		multithreading oper =new multithreading("oper");
		ie.start();
		firefox.start();
		google.start();
		oper.start();
		
	}

}
