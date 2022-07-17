package com.company.library.service;

import com.company.library.entity.Customer;

public interface RentService {
    String NAME = "library_RentService";

    boolean checkBorrowLimit(Customer customer);
}