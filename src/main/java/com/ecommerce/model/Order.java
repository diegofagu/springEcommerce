package com.ecommerce.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name ="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;
    private Date creationDate;
    private Date receiptDate;
    private double total;

    @ManyToOne //asi declaramos que la relacion de usuarios con order es de uno a muchos ya que un usuario puede tener muchas ordenes
    private User user;

    @OneToOne(mappedBy = "order")
    private DetailOrder detailOrder;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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
