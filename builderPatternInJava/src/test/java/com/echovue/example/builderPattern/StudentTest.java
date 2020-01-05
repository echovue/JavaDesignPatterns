package com.echovue.example.builderPattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void builder() {
        Student student = new Student.StudentBuilder()
                .withFirstName("Thornton")
                .withLastName("Melon")
                .build();
        assertEquals("Thornton", student.getFirstName());
    }
}