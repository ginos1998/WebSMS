package com.tucson.websms.models;

public class Student extends Member{

  public Student() {
    super();
  }

  public Student(String name, String lastname, int dni, String bornDate, String address, String user, String password) {
    super(name, lastname, dni, bornDate, address, user, password);
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

  /**
   * @return 
   */
  @Override
  public String getBornDate() {
    return this.bornDate;
  }

  /**
   * @param bornDate 
   */
  @Override
  public void setBornDate(String bornDate) {
    this.bornDate = bornDate;
  }

  /**
   * @return 
   */
  @Override
  public String getAddress() {
    return this.address;
  }

  /**
   * @param address 
   */
  @Override
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * @return 
   */
  @Override
  public String getUser() {
    return this.user;
  }

  /**
   * @param user 
   */
  @Override
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * @return 
   */
  @Override
  public String getPassword() {
    return this.password;
  }

  /**
   * @param password 
   */
  @Override
  public void setPassword(String password) {
    this.password = password;
  }
}
