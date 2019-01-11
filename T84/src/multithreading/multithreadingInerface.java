package multithreading;

public class multithreadingInerface implements Runnable{

	String name;
	public multithreadingInerface(String name){
		this.name=name;
	}
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(name+"运行了"+i+"次");
		}
	}

}
