package assignment;

public class Sort1 {

	public static void main(String[] args) {
	int A[] = {2,6,7,4,5,1,0};
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
			System.out.println(A[i]);
		}
	

	}

}
