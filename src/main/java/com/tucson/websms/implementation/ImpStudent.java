package com.tucson.websms.implementation;

import com.tucson.websms.models.Student;

import java.util.ArrayList;
import java.util.List;

public class ImpStudent {

  private Student student;
  private List<Student> studentList;

  public ImpStudent() {
    super();
    student = new Student();
  }

  public void addStudent(Student newStudent) {
    if (this.studentList == null) {
      this.studentList = new ArrayList<>();
    }
    this.studentList.add(newStudent);
  }

  public List<Student> getStudentList() {
    if (this.studentList == null) {
      System.out.println("Student list is empty");
    }
    return this.studentList;
  }

  public Student createStudent(String name, String lastname, int dni) {
    Student newStudent = new Student();
    newStudent.setName(name);
    newStudent.setLastname(lastname);
    newStudent.setDni(dni);
    return newStudent;
  }
}
