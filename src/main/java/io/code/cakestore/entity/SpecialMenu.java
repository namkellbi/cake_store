package io.code.cakestore.entity;

public class SpecialMenu {
  private long id;
  private String type;
  private String name;
  private String description;
  private String price;
  private String image;

  public SpecialMenu(long id, String type, String name, String description, String price, String image) {
    this.id = id;
    this.type = type;
    this.name = name;
    this.description = description;
    this.price = price;
    this.image = image;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }
}
