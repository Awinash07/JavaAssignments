package assignment;

public class Third {
	public static void main(String arg[])
	{
		int A[] = {2,6,7,4,5,1,0,67,77,90};
		int temp=0;
		
			for(int i=0;i<A.length;i++)
			{
				for(int j=i+1;j<A.length;j++)
				{
					if(A[i]>A[j])
					{
						temp=A[i];
						A[i]=A[j];
						A[j]=temp;
						
					}
					
				}
				
			}
			System.out.println("3rd Largest"+" "+A[7]);
			System.out.println("3rd Smallest "+A[2]);
		
	}

}
