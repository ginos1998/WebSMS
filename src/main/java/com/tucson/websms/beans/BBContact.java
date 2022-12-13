package com.tucson.websms.beans;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean(name = "bbcontact", eager = true)
public class BBContact implements Serializable{

  public String moveToHome() { return "index"; }

}