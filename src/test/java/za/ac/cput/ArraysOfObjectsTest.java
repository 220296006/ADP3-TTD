package za.ac.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArraysOfObjectsTest {

    /** Testing for Object Equality
     */
    @Test
    public void test() {
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Student student = new Student("Thabiso", 99);
            studentList.add(student);

        }
        assertEquals(4, studentList.size());

    }
}