package za.ac.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class ArraysOfObjectsTest {

    /** Testing for Timeouts
     */
    @Test(timeout = 500)
    public void test() throws InterruptedException{
        List<Student> studentList = new ArrayList<>();

        TimeUnit.SECONDS.sleep(100);

        for (int i = 0; i < 4; i++) {
            Student student = new Student("Thabiso", 99);
            studentList.add(student);

        }


    }
}