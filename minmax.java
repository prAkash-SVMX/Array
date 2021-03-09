import java.util.*;

class ArrayTest{


static	int max;
	static int min;


static void findMinMax(int a[],int n){
	min=a[0];
		max=a[0];


	if(n==1)
	{
		min=a[0];
		max=a[0];
	}
	if(n==2){
		min=a[0]<a[1] ? a[0]:a[1];

		max=a[0]>a[1] ? a[0]:a[1];
		}
if(n>2){

		for(int i=0;i<=n-1;i++){
			if(min>a[i]){
				min=a[i];
			}
			if(max<a[i]){
				max=a[i];
			}
		}



}

}



public static void main(String[] args) {
	Scanner in =new Scanner(System.in);

	int n=in.nextInt();


	int []array=new int[n];

	for(int i=0;i<n;i++){
		array[i]=in.nextInt();
	}

	findMinMax(array,n);


	System.out.println(min+"   "+max);





}



}