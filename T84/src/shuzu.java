
public class shuzu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e[]={1,2,3,9,5,6,7,8};
		int tmp=0;
		for(int i=0;i<e.length;i++){
			System.out.println(e[i]);
		
		if(e[i]>tmp){
			tmp=e[i];	
		}
		}
		System.out.println("最大数为"+tmp);
	}

}
