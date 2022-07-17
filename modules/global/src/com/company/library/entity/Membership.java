package com.company.library.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "LIBRARY_MEMBERSHIP")
@Entity(name = "library_Membership")
@NamePattern("%s|tier")
public class Membership extends StandardEntity {
    private static final long serialVersionUID = -8756841257561833762L;

    @NotNull
    @Column(name = "TIER", nullable = false)
    private String tier;

    @NotNull
    @Column(name = "BORROW_LIMIT", nullable = false)
    private Integer borrowLimit;

    public Integer getBorrowLimit() {
        return borrowLimit;
    }

    public void setBorrowLimit(Integer borrowLimit) {
        this.borrowLimit = borrowLimit;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }
}