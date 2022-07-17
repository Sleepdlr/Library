package com.company.library.service;

import com.company.library.entity.Customer;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(RentService.NAME)
public class RentServiceBean implements RentService {

    @Inject
    private DataManager dataManager;

    public boolean checkBorrowLimit(Customer customer) {
        // dataManager.reload(customer,"customer-extended-view");
        // TODO Check borrowLimit
        return true;
    }

}