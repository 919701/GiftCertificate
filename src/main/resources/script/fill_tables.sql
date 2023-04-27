INSERT INTO gift_certificate (name, description, price, duration, create_date, last_update_date)
VALUES ('Golden_Coffee', 'Taste our best coffee.', 30.00, 30, '2022-08-31T03:12:15.156Z', '2021-08-31T03:12:15.156Z'),
       ('Bate', 'You can visit all home matches in season ', 100, 270, '2022-08-30T03:12:15.156Z',
        '2022-08-30T03:12:15.156Z'),
       ('Friends_bar', 'You can celebrate your birthday in our bar', 1000.00, 10, '2022-08-29T03:12:15.156Z',
        '2022-08-29T03:12:15.156Z'),
       ('Silver_screen', 'You can watch new movies in our cinema', 20.00, 45, '2022-08-28T03:12:15.156Z',
        '2022-08-28T03:12:15.156Z'),
       ('Bershka', 'This certificate for buying our new collection', 100.00, 90, '2022-08-29T03:12:15.156Z',
        '2022-08-29T03:12:15.156Z'),
       ('Yandex_music', 'You can gift a subscription for 6 months', 50.00, 180, '2022-08-30T03:12:15.156Z',
        '2022-08-30T03:12:15.156Z'),
       ('iTunes_gift_card',
        'Apple Gift Cards are solely for the purchase of goods and services from the Apple Store, located in iTunes.',
        70.00, 50, '2022-08-31T03:12:15.156Z', '2022-08-31T03:12:15.156Z');



INSERT INTO tag(name)
VALUES ('Relax'),
       ('Music'),
       ('Movie'),
       ('Shopping'),
       ('Coffee'),
       ('Sport');


insert into gift_certificate_tag (gift_certificate_id, tag_id)
VALUES (1, 1),
       (1, 5),
       (2, 1),
       (2, 6),
       (3, 1),
       (3, 2),
       (3, 5),
       (4, 1),
       (4, 3),
       (5, 1),
       (5, 4),
       (6, 2),
       (6, 4),
       (7, 2),
       (7, 4);