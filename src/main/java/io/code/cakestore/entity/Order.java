package io.code.cakestore.entity;

public class Order {
  private long id;
  private String name;
  private String description;
  private String price;
  private String image;
  private long orderTime;

  public Order(long id, String name, String description, String price, String image, long orderTime) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.image = image;
    this.orderTime = orderTime;
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

  public long getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(long orderTime) {
    this.orderTime = orderTime;
  }
}
