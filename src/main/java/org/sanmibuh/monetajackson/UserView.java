package org.sanmibuh.monetajackson;

public class UserView {

  private final String name;
  private final String surname;

  public UserView(final String name, final String surname) {
    this.name = name;
    this.surname = surname;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }
}
