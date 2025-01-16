CREATE DATABASE mibasededatos;
USE mibasededatos;

CREATE TABLE empleados(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50)
);

-- Insertar algunos datos de prueba
INSERT INTO empleados (nombre) VALUES ('Ana');
INSERT INTO empleados (nombre) VALUES ('Carlos');

USE mibasededatos;
SELECT * FROM clientes;