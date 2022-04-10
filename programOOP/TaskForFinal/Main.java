import java.io.Console;
import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.Attributes.Name;

import Models.*;
public class Main {
	public static void main(String[] args) {
		//Generating some data
		Student Ann = new Student("Ann", new Integer[] { 60, 70, 80, 90, 100 });
		Student John = new Student("John", new Integer[] { 65, 73, 99, 75, 80 });
		Student Hadrien = new Student("Hadrien", new Integer[] { 85, 88, 92, 90, 98 });
		Group group = new Group(new Student[] { Ann, John, Hadrien });

		//Getting a list of students before the studies were finished
		List<Student> students1 = group.Students;

		//Finishing the studies
		group.finishStudies();

		//Getting a list of students after the studies were finished
		List<Student> students2 = group.Students;

		//Generating a bit more data
		Student Alex = new Student("Alex", new Integer[] { 73, 72, 75, 80, 84 });
		
		//Printing all the lists
		System.out.println("The lists at the moment are:");
		System.out.println(String.format("List from the group: %s", group.Students));
		System.out.println(String.format("The first list: %s", students1));
		System.out.println(String.format("The second list: %s", students2));

		//Trying to modify the first list.
		System.out.println("Attempting modifications...");
		try{
			students1.add(Alex);
		}
		catch (Exception e) {
			System.out.println("The first list has become immutable.");
		}

		//Trying to modify the second list.
		try{
			students2.add(Alex);
		}
		catch (Exception e) {
			System.out.println("The second list is immutable.");
		}

		//Trying to modify the group.
		try{
			group.Students.add(Alex);
		}
		catch (Exception e) {
			System.out.println("The list of the group is immutable, as it should be.");
		}

		//Trying to modify the marks of an individual student from the first list
		System.out.println("Attempting modifications...");
		try{
			students1.get(0).Marks.add(999);
		}
		catch (Exception e) {
			System.out.println("The students of the first list have become immutable.");
		}

		//Trying to modify the marks of an individual student from the second list
		try{
			students1.get(0).Marks.add(999);
		}
		catch (Exception e) {
			System.out.println("The students of the second list are immutable.");
		}

		//Trying to modify the marks of an individual student from the list of the group
		try{
			group.Students.get(0).Marks.add(999);
		}
		catch (Exception e) {
			System.out.println("The students of the group are immutable, as they should be.");
		}
	}
}
