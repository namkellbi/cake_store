package io.code.restaurant.entity;

import javax.persistence.*;

@Entity
@Table(name = "staff")
public class Staff {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "name")
  private String name;
  @Column(name = "skill")
  private String skill;
  @Column(name = "image")
  private String image;

  public Staff(int id, String name, String skill, String image) {
    this.id = id;
    this.name = name;
    this.skill = skill;
    this.image = image;
  }

  public Staff() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }
}
