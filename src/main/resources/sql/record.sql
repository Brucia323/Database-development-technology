-- auto-generated definition
create table record
(
    user_id varchar(255) not null,
    tk_id   varchar(255) not null,
    result  int          not null,
    primary key (user_id, tk_id),
    constraint record_tk_id_fk
        foreign key (tk_id) references tk (id)
);
