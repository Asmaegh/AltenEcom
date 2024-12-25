CREATE SEQUENCE USER_SEQ START WITH 1 INCREMENT BY 1;

INSERT INTO users (id, name, email, password, roles)
VALUES (1, 'Admin', 'admin@admin.com', 'admin123', 'ROLE_ADMIN');

-- Reset the sequence to the current maximum ID
ALTER SEQUENCE USER_SEQ RESTART WITH (SELECT MAX(id) FROM users) + 1;
