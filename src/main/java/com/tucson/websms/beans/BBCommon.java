package com.tucson.websms.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "bbcommon", eager = true)
public class BBCommon {
  public String moveToSchedule() {
    return "schedule";
  }
  public String moveToContact() {
    return "contact";
  }
  public String moveToHome() {
    return "home";
  }

  public String moveToLogin() { return "login"; }

  public String moveToRegister() { return "registro"; }

}
