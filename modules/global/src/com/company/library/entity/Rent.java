package com.company.library.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Table(name = "LIBRARY_RENT")
@Entity(name = "library_Rent")
public class Rent extends StandardEntity {
    private static final long serialVersionUID = 5580217152717856721L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    @NotNull
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BOOK_ID")
    @NotNull
    private Book book;

    @NotNull
    @Column(name = "RENT_START", nullable = false)
    private LocalDate rentStart;

    @Column(name = "RENT_END")
    private LocalDate rentEnd;

    public LocalDate getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(LocalDate rentEnd) {
        this.rentEnd = rentEnd;
    }

    public LocalDate getRentStart() {
        return rentStart;
    }

    public void setRentStart(LocalDate rentStart) {
        this.rentStart = rentStart;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}