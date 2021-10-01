package assignment;
public class minmax {
static int arr(int A[])
{
	int max=0 ,min=A[1];
	for(int i=0;i<A.length;i++)
	{
		if(A[i]>max)
		{
			max=A[i];
		}
		if(A[i]<min)
		{
			min=A[i];
		}
	}
	System.out.println(max);
	return min;
}


	public static void main(String args[])
	{
		int A[] = {5,2,3,1,6,7,8,9};
		System.out.println(arr(A));
		
		
	}

}
