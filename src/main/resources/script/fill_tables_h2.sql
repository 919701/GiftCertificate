INSERT INTO gift_certificate (name, description, price, duration, create_date, last_update_date)
VALUES ('Golden_Coffee', 'Taste our best coffee.', 30.00, 30, '2022-08-31T03:12:15.156Z', '2022-08-31T03:12:15.156Z'),
       ('Bate', 'You can visit all home matches in season ', 100, 270, '2022-08-30T03:12:15.156Z',
        '2022-08-30T03:12:15.156Z');


insert into tag(name)
values ('Relax'),
       ('Music');



INSERT INTO gift_certificate_tag (gift_certificate_id, tag_id)
VALUES (1, 1),
       (1, 2),
       (2, 1);
