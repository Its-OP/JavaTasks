package Controllers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProcessor 
{
	public static void ProcessTextFile(String filePath, int length) throws IOException
	{
		String pattern = String.format("\\b[aeiou]\\w{%s}\\b", length - 1);
		String newFilePath = CreateNewFilePath(filePath, "processed");
		FileWriter fw = new FileWriter(new File(newFilePath));
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner sc = new Scanner(new File(filePath));

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			line = line.replaceAll(pattern.toString(), "");
			line = line.strip();
			bw.write(line);
			if (sc.hasNextLine())
			{
				bw.newLine();
			}
		}

		bw.close();
		fw.close();
		sc.close();
	}

	private static String CreateNewFilePath(String filePath, String prependingString)
	{
		String[] pathFragments = filePath.split("/");
		int count = pathFragments.length;
		String fileName = pathFragments[count - 1];
		pathFragments[count - 1] = String.join("", prependingString, fileName);
		return String.join("/", pathFragments);
	}
}
