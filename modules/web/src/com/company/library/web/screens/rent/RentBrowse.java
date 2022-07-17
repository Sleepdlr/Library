package com.company.library.web.screens.rent;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.entity.Rent;

@UiController("library_Rent.browse")
@UiDescriptor("rent-browse.xml")
@LookupComponent("rentsTable")
@LoadDataBeforeShow
public class RentBrowse extends StandardLookup<Rent> {
}