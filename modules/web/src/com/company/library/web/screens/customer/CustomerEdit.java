package com.company.library.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.entity.Customer;

@UiController("library_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}