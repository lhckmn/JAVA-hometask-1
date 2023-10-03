package java_hometask_1_problem_2;

public class Primes {

	public static void main(String[] args)
	{
		int nValues = 50;
		start: for (int i = 2; i <= nValues; i++) //Added label 'start'
		{
			for (int j = 2; j <= Math.sqrt(i); j++) //Trying up to the square root of the number under test 
			{
				if (i % j == 0)
				{
					continue start; //Using labeled continue
				}
			}
			System.out.println(i);
		}
	}
}