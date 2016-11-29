-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2016-11-24 17:25:03.083

-- tables
-- Table: afiliaciones
CREATE TABLE afiliaciones (
    id int NOT NULL,
    fecha_inicio date NOT NULL,
    fecha_final date NOT NULL,
    estado char(1) NOT NULL,
    pago int NOT NULL,
    CONSTRAINT afiliaciones_pk PRIMARY KEY (id)
);

-- Table: egresados
CREATE TABLE egresados (
    identificacion int NOT NULL,
    direccion varchar(50) NOT NULL,
    promocion int NOT NULL,
    CONSTRAINT egresados_pk PRIMARY KEY (identificacion)
);

-- Table: estudiantes
CREATE TABLE estudiantes (
    identificacion int NOT NULL,
    carrera varchar(50) NOT NULL,
    codigo int NOT NULL,
    semestre int NOT NULL,
    CONSTRAINT estudiantes_pk PRIMARY KEY (identificacion)
);

-- Table: solicitantes
CREATE TABLE solicitantes (
    nombre varchar(50) NOT NULL,
    edad int NOT NULL,
    celular int NOT NULL,
    id int NOT NULL,
    tipo varchar(50) NOT NULL,
    CONSTRAINT solicitantes_pk PRIMARY KEY (id)
);

-- Table: solicitudes
CREATE TABLE solicitudes (
    fecha date NOT NULL,
    estado char(1) NOT NULL,
    id int NOT NULL,
    solicitantes_id int NOT NULL,
    CONSTRAINT solicitudes_pk PRIMARY KEY (id)
);

-- Table: usuarios
CREATE TABLE usuarios (
    clave varchar(30) NOT NULL,
    solicitantes_id int NOT NULL,
    afiliaciones_id int NOT NULL,
    CONSTRAINT usuarios_pk PRIMARY KEY (solicitantes_id)
);

-- foreign keys
-- Reference: egresados_solicitantes (table: egresados)
ALTER TABLE egresados ADD CONSTRAINT egresados_solicitantes FOREIGN KEY egresados_solicitantes (identificacion)
    REFERENCES solicitantes (id);

-- Reference: estudiantes_solicitantes (table: estudiantes)
ALTER TABLE estudiantes ADD CONSTRAINT estudiantes_solicitantes FOREIGN KEY estudiantes_solicitantes (identificacion)
    REFERENCES solicitantes (id);

-- Reference: solicitudes_solicitantes (table: solicitudes)
ALTER TABLE solicitudes ADD CONSTRAINT solicitudes_solicitantes FOREIGN KEY solicitudes_solicitantes (solicitantes_id)
    REFERENCES solicitantes (id);

-- Reference: usuarios_afiliaciones (table: usuarios)
ALTER TABLE usuarios ADD CONSTRAINT usuarios_afiliaciones FOREIGN KEY usuarios_afiliaciones (afiliaciones_id)
    REFERENCES afiliaciones (id);

-- Reference: usuarios_solicitantes (table: usuarios)
ALTER TABLE usuarios ADD CONSTRAINT usuarios_solicitantes FOREIGN KEY usuarios_solicitantes (solicitantes_id)
    REFERENCES solicitantes (id);

-- End of file.

