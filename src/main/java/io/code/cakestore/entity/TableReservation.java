package io.code.cakestore.entity;

public class TableReservation {
  private long id;
  private String name;
  private String email;
  private Long phone;
  private Long numberOfGuest;
  private Long dateTable;
  private Long timeTable;
  private String message;

  public TableReservation(long id, String name, String email, Long phone, Long numberOfGuest, Long dateTable,
    Long timeTable, String message) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.numberOfGuest = numberOfGuest;
    this.dateTable = dateTable;
    this.timeTable = timeTable;
    this.message = message;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getPhone() {
    return phone;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }

  public Long getNumberOfGuest() {
    return numberOfGuest;
  }

  public void setNumberOfGuest(Long numberOfGuest) {
    this.numberOfGuest = numberOfGuest;
  }

  public Long getDateTable() {
    return dateTable;
  }

  public void setDateTable(Long dateTable) {
    this.dateTable = dateTable;
  }

  public Long getTimeTable() {
    return timeTable;
  }

  public void setTimeTable(Long timeTable) {
    this.timeTable = timeTable;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
