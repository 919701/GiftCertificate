CREATE TABLE if not exists gift_certificate
(
    id               bigserial,
    name             VARCHAR(100)   NOT NULL,
    description      text           NOT NULL,
    price            numeric(10, 2) NOT NULL,
    duration         int            NOT NULL,
    create_date      timestamp      NOT NULL,
    last_update_date timestamp      NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE if not exists tag
(
    id   bigserial,
    name VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE if not exists gift_certificate_tag
(
    id                  bigserial NOT NULL,
    gift_certificate_id bigint    NOT NULL,
    tag_id              bigint    NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_gift_certificate_id FOREIGN KEY (gift_certificate_id) references gift_certificate (id) on delete cascade,
    CONSTRAINT fk_tag_id FOREIGN KEY (tag_id) references tag (id) on delete cascade
);