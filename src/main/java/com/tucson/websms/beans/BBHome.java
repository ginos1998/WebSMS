package com.tucson.websms.beans;

import com.sun.nio.sctp.MessageInfo;
import com.tucson.websms.implementation.ImpStudent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.util.stream.Stream;

@ManagedBean(name = "bbhome", eager = true)
@RequestScoped
public class BBHome {
  @ManagedProperty(value = "#{message}")
  private String message;
  private ImpStudent impStudent;

  public BBHome() {
    impStudent = new ImpStudent();
    System.out.println("running");
  }

  public String getStudent() {
    String name = "Miguel";
    String lastname = "Martin";
    int dni = 33027588;
    return impStudent.createStudent(name, lastname, dni).getName();
  }

  
}
