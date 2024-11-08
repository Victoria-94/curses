CREATE TABLE IF NOT EXISTS curses (
    id SERIAL PRIMARY KEY,
    title VARCHAR (600),
    description VARCHAR (3000),
    modality VARCHAR (100),
    price DECIMAL (9,2),
    inscription BOOLEAN
    );

CREATE TABLE IF NOT EXISTS students (
    id SERIAL PRIMARY KEY,
    nui VARCHAR(12) UNIQUE,
    full_name VARCHAR(200) NOT NULL,
    age SMALLINT CHECK (age > 0),
    email VARCHAR(700) UNIQUE NOT NULL,
    curses_id INT REFERENCES curses(id) ON DELETE SET NULL  -- Eliminamos la restricción de clave foránea
    );
