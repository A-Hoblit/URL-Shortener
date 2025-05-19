INSERT INTO users (email, password, name, role)
VALUES ('admin@gmail.com', 'admin', 'Administrator', 'ROLE_ADMIN'),
       ('user@gmail.com', 'secret', 'ahoblit', 'ROLE_USER');

INSERT INTO short_urls (short_key, original_url, created_by, created_at, expires_at, is_private, click_count)
VALUES ('rs1Aed', 'https://www.reddit.com/', 1, TIMESTAMP '2025-01-05',
        NULL, FALSE,     0),
       ('hujfDf', 'https://www.youtube.com/', 1,TIMESTAMP '2024-07-16',
        NULL, FALSE, 0),
       ('ertcbn', 'https://www.google.com/', 1, TIMESTAMP '2025-02-10',
        NULL, FALSE,   0),
       ('edfrtg', 'https://www.docker.com/', 1, TIMESTAMP '2025-03-18',
        NULL, TRUE, 0),
       ('vbgtyh', 'https://github.com/', 1, TIMESTAMP '2025-04-19',
        NULL, FALSE, 0),
       ('rtyfgb', 'https://www.andrewhoblit.com/', 1, TIMESTAMP '2025-05-25',
        NULL, TRUE, 0),
       ('rtvbop', 'https://github.com/A-Hoblit', 1,TIMESTAMP '2024-06-26',
        NULL, TRUE, 0),
       ('2wedfg', 'https://www.linkedin.com/in/andrew-hoblit/', 1, TIMESTAMP '2024-11-27',
        NULL,TRUE, 0)
;