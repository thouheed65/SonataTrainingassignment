package Genereicexmaple;
import java.util.ArrayList;

import java.util.Collections;


public class TestStudent {
	public static void main(String args[]) {
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(101,"thouheed",23));
		a1.add(new Student(105,"john",27));
		a1.add(new Student(106,"jay",25));
		
	Collections.sort(a1);;
	for(Student st:a1) {
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	
	}

}
}
