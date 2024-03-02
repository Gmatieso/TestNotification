package com.loanservicenotification.loannotification.dao;

//import org.springframework.stereotype.Component;
//
//@Component
public class LoanRequest {

    private Integer Id;
    private String borrower;

    private Integer amount;

    public LoanRequest(Integer id, String borrower, Integer amount) {
        Id = id;
        this.borrower = borrower;
        this.amount = amount;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "LoanRequest{" +
                "borrower='" + borrower + '\'' +
                ", amount=" + amount +
                '}';
    }
}
