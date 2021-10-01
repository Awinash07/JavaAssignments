package assignment;

public class reverse {
	static void  rev(int A[],int n)
	{
		int b[] =new int[n];
		int j=n;
		for(int i=0;i<n;i++)
		{
			b[j-1]=A[i];
			j=j-1;
		}
		System.out.println("reversed array is");
		for(int k=0;k<b.length;k++)
		{
			System.out.println(b[k]);
		}
		
	}


	public static void main(String[] args) {
		int A[] = {1,2,3,4,5,6,7};
		rev(A,A.length);
		
}
}
