package io.code.restaurant.entity;

public class Category {
  private int id;
  private String name;
  private boolean is_menu;
  private boolean is_process;
  private boolean status;

  public Category(int id, String name, boolean is_menu, boolean is_process, boolean status) {
    this.id = id;
    this.name = name;
    this.is_menu = is_menu;
    this.is_process = is_process;
    this.status = status;
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

  public boolean isIs_menu() {
    return is_menu;
  }

  public void setIs_menu(boolean is_menu) {
    this.is_menu = is_menu;
  }

  public boolean isIs_process() {
    return is_process;
  }

  public void setIs_process(boolean is_process) {
    this.is_process = is_process;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
}
