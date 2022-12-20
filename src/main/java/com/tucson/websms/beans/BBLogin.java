package com.tucson.websms.beans;

import com.tucson.websms.models.Student;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean(name = "bblogin", eager = true)
public class BBLogin implements Serializable {
  private String user;
  private String psw;


  public void setStudentName(String name) {
    user = name;
  }

  public String getStudentName() {
    return user;
  }

  public void setStudentPsw(String pass) {
    psw = pass;
  }

  public String getStudentPsw() {
    return psw;
  }

  public String checkInputLogin() {
    if (checkUser() && checkPswd()) {
      return "Contacto";
    }
    return null;
  }

  public String loginButton() {
    return (user != null && psw != null) ? "schedule" : "retry";
  }

  public String showInput() {
    System.out.println("showinput ****************************");
    return (user != null && psw != null) ? user + " & " + psw : "none";
  }
  private boolean checkUser() {
    return false;
  }

  private boolean checkPswd() {
    return false;
  }
}
