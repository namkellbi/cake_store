package io.code.restaurant.model.response;

import javax.persistence.Column;

public class MenuResponse {
  private String name;
  private long price;
  private boolean status;
  private String description;
  private int sold_quantity;
  private boolean best_seller;

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
