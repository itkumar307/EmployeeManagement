
create table IF NOT EXISTS department
(
    department_id   int         not null AUTO_INCREMENT
    primary key,
    short_Name      varchar(45) null,
    department_Name varchar(45) null,
    constraint department_id_UNIQUE
        unique (department_id)
);

create table IF NOT EXISTS employee
(
    employee_id   int         not null AUTO_INCREMENT
        primary key,
    first_name    varchar(45) null,
    last_name     varchar(45) null,
    phone_no      varchar(45) null,
    email_id      varchar(45) null,
    address       varchar(45) null,
    pincode       varchar(45) null,
    latest_salary int         null,
    dob           date        null,
    doj           date        null,
    department_id int         null,
    constraint department_id
        foreign key (department_id) references department (department_id)
);


