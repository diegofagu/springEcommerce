package com.ecommerce.model;

import java.util.Date;

public class Order {

    private Integer id;
    private String number;
    private Date creationDate;
    private Date receiptDate;
    private double total;

    private Order(){

    }

    public Order(Integer id, String number, Date creationDate, Date receiptDate, double total) {
        this.id = id;
        this.number = number;
        this.creationDate = creationDate;
        this.receiptDate = receiptDate;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", creationDate=" + creationDate +
                ", receiptDate=" + receiptDate +
                ", total=" + total +
                '}';
    }
}
