package com.tucson.websms.beans;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean(name = "bbschedule", eager = true)
public class BBSchedule implements Serializable {
  public String moveToHome() { return "index"; }
}
