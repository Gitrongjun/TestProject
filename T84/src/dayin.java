
public class dayin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int j=0;j<3;j++){
		for(int i=0;i<5;i++){
		System.out.print("* ");
		}
		System.out.println();
		for(int k=0;k<5;k++){
		System.out.print("# ");
		}
		System.out.println();
		}*/
		/*for(int j=1;j<=4;j++){//九九乘法表
		for(int i=1;i<=j;i++){
		System.out.print("第"+j+"行"+"||第"+i+"列   ");
		}
		System.out.println();
		}*/
		/*for(int row=1;row<=5;row++){
		for(int col=1;col<=(5-row);col++){
		System.out.print("* ");//列
		}
		System.out.println();
		}*/
		/*for(int row=1;row<=6;row++){
		for(int col=1;col<=6-row;col++){
		System.out.print(col+" ");
		}
		for(int i=1;i<=row;i++){
		System.out.print(i+" ");
		}
		System.out.println();
		}*/
		for(int row=1;row<=6;row++){
		for(int col=1;col<=6-row;col++);{
		System.out.print("* ");
		}
		for(int cola=1;cola<=6-row;cola++);{
			System.out.print("* ");
		}
		System.out.println();
		}
	}
}
