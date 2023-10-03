package java_hometask_1_problem_3;

public class StringCharacters
{
	public static void main(String[] args)
	{
		String text = "To be or not to be, that is the question;" + "Whether `tis nobler in the mind to suffer"
				+ " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles,"
				+ " and by opposing end them?";
		int spaces = 0, vowels = 0, letters = 0;
		
		for(int i = 0; i < text.length(); i++)
		{
			char character = text.charAt(i); //Getting char at position i
			
			if (Character.isWhitespace(character)) //Checking if the character is a space
			{
				spaces++;
			}
			else if(Character.isLetter(character)) //Checking if cthe character is a letter
			{
				letters++; //Incrementing letter counter
				
				if("aeiouy".indexOf(character) != -1) //Checking if the character is a vowel (y is also sometimes mentioned as a vowel according to oxford dictionary but left out in this code) 
				{
					vowels++;
				}
			}
		}
		
		System.out.println("The text contained vowels: " + vowels + "\n" + "consonants " + (letters - vowels) + "\n"
				+ "spaces: " + spaces);
	}
}
