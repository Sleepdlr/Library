package com.company.library.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Table(name = "LIBRARY_CUSTOMER")
@Entity(name = "library_Customer")
@NamePattern("%s|name")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -5782140715791412351L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Column(name = "ZIP_CODE")
    private String zipCode;

    @Column(name = "CITY")
    private String city;

    @Column(name = "ADDRESS")
    private String address;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MEMBERSHIP_ID")
    @NotNull
    private Membership membership;

    @OneToMany(mappedBy = "customer")
    private List<Rent> rents;

    public List<Rent> getRents() {
        return rents;
    }

    public void setRents(List<Rent> rents) {
        this.rents = rents;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}