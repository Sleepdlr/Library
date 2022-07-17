package com.company.library.web.screens.rent;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.entity.Rent;

@UiController("library_Rent.edit")
@UiDescriptor("rent-edit.xml")
@EditedEntityContainer("rentDc")
@LoadDataBeforeShow
public class RentEdit extends StandardEditor<Rent> {

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        // TODO Check borrowLimit
    }

}