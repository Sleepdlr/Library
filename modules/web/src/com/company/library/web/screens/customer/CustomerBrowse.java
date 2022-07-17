package com.company.library.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.entity.Customer;

@UiController("library_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}