create table country (
    id serial primary key,
    name varchar(255) not null
);

create table city (
    id serial primary key,
    name varchar(255) not null,
    country_id int not null,
    constraint city_country_id_fk foreign key (country_id) references country (id)
);

create table users (
    id serial primary key,
    username varchar(255) not null,
    email varchar(255) not null,
    password varchar(255) not null,
    city_id int not null,
    constraint user_city_id_fk foreign key (city_id) references city (id)
);
