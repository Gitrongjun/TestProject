
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
		/*for(int j=1;j<=4;j++){//�žų˷���
		for(int i=1;i<=j;i++){
		System.out.print("��"+j+"��"+"||��"+i+"��   ");
		}
		System.out.println();
		}*/
		/*for(int row=1;row<=5;row++){
		for(int col=1;col<=(5-row);col++){
		System.out.print("* ");//��
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
