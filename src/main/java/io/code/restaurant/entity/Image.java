package io.code.restaurant.entity;

public class Image {
  private int id;
  private String name;
  private int menu_id;
  private int product_id;
  private int staff_id;
  private boolean status;
  private boolean is_avatar;

  public Image(int id, String name, int menu_id, int product_id, int staff_id, boolean status, boolean is_avatar) {
    this.id = id;
    this.name = name;
    this.menu_id = menu_id;
    this.product_id = product_id;
    this.staff_id = staff_id;
    this.status = status;
    this.is_avatar = is_avatar;
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

  public int getMenu_id() {
    return menu_id;
  }

  public void setMenu_id(int menu_id) {
    this.menu_id = menu_id;
  }

  public int getProduct_id() {
    return product_id;
  }

  public void setProduct_id(int product_id) {
    this.product_id = product_id;
  }

  public int getStaff_id() {
    return staff_id;
  }

  public void setStaff_id(int staff_id) {
    this.staff_id = staff_id;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public boolean isIs_avatar() {
    return is_avatar;
  }

  public void setIs_avatar(boolean is_avatar) {
    this.is_avatar = is_avatar;
  }
}
