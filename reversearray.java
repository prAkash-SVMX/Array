import java.util.*;

class arraytest{

static void reverse(int arr[],int n){

		int s=0;
		int e=n-1;
		int temp;

		while (s<=e) {
			temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;

			s++;
			e--;
		}




}

public static void main(String[] args) {
	Scanner in =new Scanner(System.in);

	int n=in.nextInt();


	int []array=new int[n];

	for(int i=0;i<n;i++){
		array[i]=in.nextInt();
	}

	reverse(array,n);



	for(int i=0;i<n;i++){
		System.out.print(array[i]+" ");
	}




}



}