-- auto-generated definition
create table user
(
    id     varchar(255)              not null
        primary key,
    name   varchar(255) charset utf8 null,
    gender int                       null,
    phone  varchar(255) charset utf8 null,
    constraint user_id_uindex
        unique (id)
);
