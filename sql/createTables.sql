CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username varchar(20) NOT NULL
);

CREATE TABLE relations (
    rel_id SERIAL PRIMARY KEY,
    user1_id int4 NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    user2_id int4 NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    type varchar(20) NOT NULL
);