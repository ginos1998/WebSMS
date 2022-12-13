package com.tucson.websms.models;

public class Student extends Member{

  public Student() {
    super();
  }

  public Student(String name, String lastname, int dni) {
    super(name, lastname, dni);
  }

  /**
   * @return 
   */
  @Override
  public String getName() {
    return this.name;
  }

  /**
   * @param name 
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return 
   */
  @Override
  public String getLastname() {
    return this.lastname;
  }

  /**
   * @param lastname 
   */
  @Override
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  /**
   * @return 
   */
  @Override
  public int getDni() {
    return this.dni;
  }

  /**
   * @param dni 
   */
  @Override
  public void setDni(int dni) {
    this.dni = dni;
  }
}
