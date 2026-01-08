package basics;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class ComparatorTest5 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(new Student("Rakesh", 90), new Student("Bablu", 100), new Student("Ankita", 70)));
        students.sort(new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                return Integer.compare(s1.getMarks(),s2.getMarks());
            }
        });
        students.sort((s1,s2)->Integer.compare(s1.getMarks(),s2.getMarks()));
        students.sort(Comparator.comparing(Student::getMarks));
        
        // Just like Arrays.sort, we have Comparator.sort(obj,new Comparator<T>{...});
        Collections.sort(students,Comparator.comparing(Student::getMarks));
    }
}
