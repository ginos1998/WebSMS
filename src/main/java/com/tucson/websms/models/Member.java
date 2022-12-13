package com.tucson.websms.models;

public abstract class Member {
  protected String name;
  protected String lastname;
  protected int dni;

  public Member() {
  }

  public Member(String name, String lastname, int dni) {
    this.name = name;
    this.lastname = lastname;
    this.dni = dni;
  }

  public abstract String getName();

  public abstract void setName(String name);

  public abstract String getLastname();

  public abstract void setLastname(String lastname);

  public abstract int getDni();

  public abstract void setDni(int dni);
}
