package java_hometask_1_problem_4;

public class SortingWords
{

	public static void main(String[] args)
	{
		String text = "To be or not to be, that is the question;" + "Whether `tis nobler in the mind to suffer"
				+ " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles,"
				+ " and by opposing end them?";
		
		/*
		* Splitting the text into individual words.
		* A word is here defined as a letter or a group of letters separated by a whitespace or punctuation marks.
		*/
		String words[] = text.split("\\W+");
		
		//Sorting the array by bubble-sort algorithm
		boolean switchedElements;
		do
		{
			switchedElements = false; //Resetting the flag that words were swapped
			for(int i = 0; i < words.length - 1; i++) //Iterating over the whole array
			{
				if(words[i].compareToIgnoreCase(words[i + 1]) > 0) //Checking if the word at index i should be lexicographically located after the word at index i+1
				{
					//Swapping words at index i and i+1
					String temp = words[i];
					words[i] = words[i + 1];
					words[i + 1] = temp;
					
					switchedElements = true; //Setting the flag that words were swapped
				}
			}
		}while(switchedElements); //Repeating if words were swapped (sorting has not finished)
		
		//Printing the sorted array line by line
		for(int i = 0; i < words.length; i++)
		{
			System.out.println(words[i]);
		}
	}
}
