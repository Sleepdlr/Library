-- begin LIBRARY_CUSTOMER
alter table LIBRARY_CUSTOMER add constraint FK_LIBRARY_CUSTOMER_ON_MEMBERSHIP foreign key (MEMBERSHIP_ID) references LIBRARY_MEMBERSHIP(ID)^
create index IDX_LIBRARY_CUSTOMER_ON_MEMBERSHIP on LIBRARY_CUSTOMER (MEMBERSHIP_ID)^
-- end LIBRARY_CUSTOMER

-- begin LIBRARY_RENT
alter table LIBRARY_RENT add constraint FK_LIBRARY_RENT_ON_CUSTOMER foreign key (CUSTOMER_ID) references LIBRARY_CUSTOMER(ID)^
alter table LIBRARY_RENT add constraint FK_LIBRARY_RENT_ON_BOOK foreign key (BOOK_ID) references LIBRARY_BOOK(ID)^
create index IDX_LIBRARY_RENT_ON_CUSTOMER on LIBRARY_RENT (CUSTOMER_ID)^
create index IDX_LIBRARY_RENT_ON_BOOK on LIBRARY_RENT (BOOK_ID)^
-- end LIBRARY_RENT
