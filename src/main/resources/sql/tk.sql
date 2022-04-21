-- auto-generated definition
create table tk
(
    id    varchar(255)              not null
        primary key,
    title varchar(255) charset utf8 null,
    constraint tk_id_uindex
        unique (id)
);
