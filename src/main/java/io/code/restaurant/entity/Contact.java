package io.code.restaurant.entity;

public class Contact {
  private int id;
  private Long phone;
  private String email;

  public Contact(int id, Long phone, String email) {
    this.id = id;
    this.phone = phone;
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Long getPhone() {
    return phone;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
