package Models;

import java.util.List;
import java.util.Arrays;

public class Student {
	public final String Name;
	public List<Integer> Marks;

	public Student(String Name, Integer[] marks) {
		this.Name = Name;
		Marks = Arrays.asList(marks);
	}
}