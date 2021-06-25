package io.code.restaurant.entity;

import javax.persistence.*;

@Entity
@Table(name = "menu")
public class Menu {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "product_id")
  private int product_id;
  @Column(name = "name")
  private String name;
  @Column(name = "price")
  private long price;
  @Column(name = "status")
  private boolean status;
  @Column(name = "description")
  private String description;
  @Column(name = "sold_quantity")
  private int sold_quantity;
  @Column(name = "best_seller")
  private boolean best_seller;

  public Menu(int id, int product_id, String name, long price, boolean status,
    String description, int sold_quantity, boolean best_seller) {
    this.id = id;
    this.product_id = product_id;
    this.name = name;
    this.price = price;
    this.status = status;
    this.description = description;
    this.sold_quantity = sold_quantity;
    this.best_seller = best_seller;
  }

  public Menu() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getProduct_id() {
    return product_id;
  }

  public void setProduct_id(int product_id) {
    this.product_id = product_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getSold_quantity() {
    return sold_quantity;
  }

  public void setSold_quantity(int sold_quantity) {
    this.sold_quantity = sold_quantity;
  }

  public boolean isBest_seller() {
    return best_seller;
  }

  public void setBest_seller(boolean best_seller) {
    this.best_seller = best_seller;
  }
}
