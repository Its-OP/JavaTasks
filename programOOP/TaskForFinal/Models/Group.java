package Models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Group {
	public List<Student> Students;
	private boolean _isStudying = true;

	public Group(Student[] students) {
		this.Students = Arrays.asList(students);
	}

	public void finishStudies() {
		if(!_isStudying){
			return;
		}
		_isStudying = false;
		Students = Collections.unmodifiableList(Students);
	}
}
