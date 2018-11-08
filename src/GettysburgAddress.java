import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GettysburgAddress {

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		
		ArrayList<String> words = new ArrayList<String>();
		
		while(file.hasNext())
		{
			words.add(file.next());
		}
	
		String longestWord = "";
		int totalLength = 0;
		
		for (String a: words)
		{
			totalLength += a.length();
			
			if (a.length() > longestWord.length())
			{
				longestWord = a;
			}
		}
		
		System.out.println("Longest word is \"" + longestWord + "\" and the average length is " + (totalLength/words.size() + "."));
		
	}
		
}

