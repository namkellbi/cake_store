package io.code.restaurant.entity;

import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "phone")
  private Long phone;
  @Column(name = "email")
  private String email;

  public Contact(int id, Long phone, String email) {
    this.id = id;
    this.phone = phone;
    this.email = email;
  }

  public Contact() {

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
