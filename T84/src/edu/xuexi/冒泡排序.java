package edu.xuexi;

public class ц╟ещеепР {
public static void main(String[] args){
	int a[]={9,8,7,6,5,4,3,2,1};
	int temp=0;
	for(int j=0;j<a.length-1;j++){
	for(int i=0;i<a.length-1-j;i++){
	if(a[i]>a[i+1]){
		temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
	   }
	}
   }
	
  for(int arr:a){
	  System.out.print(arr);
  }
}
}
