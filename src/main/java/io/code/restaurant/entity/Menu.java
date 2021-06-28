package io.code.restaurant.entity;

import javax.persistence.*;

@Entity
@Table(name = "menu")
public class Menu {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "category_id")
  private int categoryId;
  @Column(name = "unit_id")
  private int unitId;
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
  @Column(name = "time_table_id")
  private int time_table_id;



  public Menu() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }

  public int getUnitId() {
    return unitId;
  }

  public void setUnitId(int unitId) {
    this.unitId = unitId;
  }

  public int getTime_table_id() {
    return time_table_id;
  }

  public void setTime_table_id(int time_table_id) {
    this.time_table_id = time_table_id;
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
