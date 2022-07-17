package com.company.library.web.screens.membership;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.entity.Membership;

@UiController("library_Membership.browse")
@UiDescriptor("membership-browse.xml")
@LookupComponent("membershipsTable")
@LoadDataBeforeShow
public class MembershipBrowse extends StandardLookup<Membership> {
}