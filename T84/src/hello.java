
public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h="hello world";
		String c="demaxiya";
		h=h.concat(c);
		boolean d =h.contains("dema");
		boolean e=h.endsWith("ya");
		System.out.println(d);System.out.println(e);
		int f=h.compareTo("hello");
		System.out.println(f);
		
		
		for(int i=0;i<10;i++){
			System.out.println(h+"*"+i);
		}
		

	}

}
