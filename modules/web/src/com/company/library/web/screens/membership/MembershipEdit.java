package com.company.library.web.screens.membership;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.entity.Membership;

@UiController("library_Membership.edit")
@UiDescriptor("membership-edit.xml")
@EditedEntityContainer("membershipDc")
@LoadDataBeforeShow
public class MembershipEdit extends StandardEditor<Membership> {
}