package com.tucson.websms.models;

public abstract class Member {
  protected String name;
  protected String lastname;
  protected int dni;

  protected String bornDate;
  protected String address;
  protected String user;
  protected String password;

  public Member() {
  }

  public Member(String name, String lastname, int dni, String bornDate, String address, String user, String password) {
    this.name = name;
    this.lastname = lastname;
    this.dni = dni;
    this.bornDate = bornDate;
    this.address = address;
    this.user = user;
    this.password = password;
  }

  public abstract String getName();

  public abstract void setName(String name);

  public abstract String getLastname();

  public abstract void setLastname(String lastname);

  public abstract int getDni();

  public abstract void setDni(int dni);

  public abstract String getBornDate();

  public abstract void setBornDate(String bornDate);

  public abstract String getAddress();

  public abstract void setAddress(String address);

  public abstract String getUser();

  public abstract void setUser(String user);

  public abstract String getPassword();

  public abstract void setPassword(String password);
}
