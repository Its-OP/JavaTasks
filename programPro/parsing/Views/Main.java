package Views;
import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

import Controllers.FileProcessor;

public class Main {
	public static void main(String[] args) throws IOException
	{
		Scanner scanner = new Scanner(System.in);

		//Example of a filepath to enter: ./testText.txt
		System.out.println("Please, enter the filepath");
		String filePath = scanner.nextLine();
		System.out.println("Please, enter the word length");
		String strLength = scanner.nextLine();
		int length = Integer.parseInt(strLength);
		scanner.close();

		FileProcessor.ProcessTextFile(filePath, length);
		System.out.println("Your file was processed successfully");
	}
}