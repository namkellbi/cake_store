package io.code.cakestore.entity;

public class Contact {
  private long id;
  private Long phone;
  private String email;

  public Contact(long id, Long phone, String email) {
    this.id = id;
    this.phone = phone;
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
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
