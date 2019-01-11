
public class jiaohuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*int a[]={2,4};
	int b = 0;
	System.out.println("交换之前"+a[0]+a[1]);
	b = a[0];
	a[0]=a[1];
	a[1]=b;
	System.out.println("交换之后"+a[0]+a[1]);
	*/
		
	int a[]={1,2,3,4,5,6,78,9,0};
	int b=0;
	for(int j=0;j<a.length-1;j++){
	for(int i=0;i<a.length-1-j;i++){
		if(a[i]<a[i+1]){
			b=a[i];//b=1
			a[i]=a[i+1];//a[i]=2
			a[i+1]=b;//a[i+1]=1
			System.out.println(a[i]);
		}
	}
	}
	for(int k=0;k<a.length;k++){
	System.out.println("a["+k+"]的值为："+a[k]);
	}
	}

}
