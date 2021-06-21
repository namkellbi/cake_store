package io.code.cakestore.entity;

public class Chef {
  private long id;
  private String name;
  private String skill;
  private String image;

  public Chef(long id, String name, String skill, String image) {
    this.id = id;
    this.name = name;
    this.skill = skill;
    this.image = image;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
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
