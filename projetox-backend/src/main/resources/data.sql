DROP TABLE IF EXISTS Alunos;
 
CREATE TABLE Alunos (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nome VARCHAR(250) NOT NULL,
  sobrenome VARCHAR(250) NOT NULL
);
 
INSERT INTO Alunos (first_name, last_name) VALUES
  ('Rogerio', 'Hirata'),
  ('Adilson', 'Silva'),
  ('Haron', 'Teste');