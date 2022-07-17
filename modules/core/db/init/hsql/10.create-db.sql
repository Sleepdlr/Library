-- begin LIBRARY_CUSTOMER
create table LIBRARY_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    BIRTH_DATE date,
    ZIP_CODE varchar(255),
    CITY varchar(255),
    ADDRESS varchar(255),
    MEMBERSHIP_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end LIBRARY_CUSTOMER

-- begin LIBRARY_MEMBERSHIP
create table LIBRARY_MEMBERSHIP (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TIER varchar(255) not null,
    BORROW_LIMIT integer not null,
    --
    primary key (ID)
)^
-- end LIBRARY_MEMBERSHIP
-- begin LIBRARY_RENT
create table LIBRARY_RENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(36) not null,
    BOOK_ID varchar(36) not null,
    RENT_START date not null,
    RENT_END date,
    --
    primary key (ID)
)^
-- end LIBRARY_RENT
-- begin LIBRARY_BOOK
create table LIBRARY_BOOK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255) not null,
    AUTHOR varchar(255) not null,
    --
    primary key (ID)
)^
-- end LIBRARY_BOOK
