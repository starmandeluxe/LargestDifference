/*
 *  In array A, find the largest difference between  
 *  A[Q] and A[P] such that Q > P.
 * 
 * 
 */
public class LargestDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int solution(int[] A)
	{
		int N = A.length;
		if (N < 1)
		{
			return 0;
		}
		//update the max difference if the subtraction is greater
		
		int highest = 0;
		int maxdiff = 0;
		
		for (int i = N-1; i >= 0; --i)
		{
			//keep track of the largest value
			if (A[i] > highest)
				highest = A[i];
			
			//keep subtracting it to each element
			int temp = highest - A[i];
			
			if (temp > maxdiff)
				maxdiff = temp;
		}
		
		return maxdiff;
	}

}
