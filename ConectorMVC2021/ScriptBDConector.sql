CREATE DATABASE bd_java_con1;
USE bd_java_con1;
CREATE TABLE tbl_pais(
	id_pais INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre_pais VARCHAR(35) NOT NULL,
	capital_pais VARCHAR(35) NOT NULL,
	poblacion_pais BIGINT
);
SELECT * FROM tbl_pais;

INSERT INTO tbl_pais (nombre_pais, capital_pais, poblacion_pais) VALUES
('Guatemala', 'Guatemala', 15423789);



SELECT 
id_pais ID,
nomre_pais  Nombre_del_Pais,
capital_pais  Capital_del_Pais,
poblacion_pais  Poblacion_del_Pais
FROM
tbl_pais;