package assignment;

public class occurance {

	public static void main(String[] args) {
		int A[] = {1,2,33,4,45,20,20,20,20,40};
		int count=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==20)
				count++;
		}
		System.out.println("no of times 20 occured in an array is : "+count);

	}

}
