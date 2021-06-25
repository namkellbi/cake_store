package io.code.restaurant.entity;


public class Product {
  private int id;
  private String name;
  private int category_id;
  private int unit_id;
  private String description;
  private int time_table_id;
  private boolean status;

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

  public int getCategory_id() {
    return category_id;
  }

  public void setCategory_id(int category_id) {
    this.category_id = category_id;
  }

  public int getUnit_id() {
    return unit_id;
  }

  public void setUnit_id(int unit_id) {
    this.unit_id = unit_id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getTime_table_id() {
    return time_table_id;
  }

  public void setTime_table_id(int time_table_id) {
    this.time_table_id = time_table_id;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
}
