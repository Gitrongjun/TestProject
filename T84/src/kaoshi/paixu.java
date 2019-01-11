package kaoshi;

public class paixu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={0,9,8,7,6,5,4,3,2,1};
		int temp=0;
		for(int j=0;j<arr.length;j++){
		for(int i=0;i<arr.length-1;i++){
		if(arr[i]>arr[i+1]){
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		}
		}
		for(int out:arr){
			System.out.println(out);
		}
	}

}
