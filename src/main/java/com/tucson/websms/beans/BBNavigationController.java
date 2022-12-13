package com.tucson.websms.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name = "bbnavigationcontroller", eager = true)
@RequestScoped
public class BBNavigationController implements Serializable {
  public String moveToSchedule() { return "schedule"; }
  public String movToContact() { return "contact"; }
}
