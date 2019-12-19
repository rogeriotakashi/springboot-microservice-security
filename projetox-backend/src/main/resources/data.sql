DROP TABLE IF EXISTS Alunos;
 
CREATE TABLE Alunos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(250) NOT NULL,
  sobrenome VARCHAR(250) NOT NULL,
  dat_inscricao DATE NOT NULL,
  dat_manut DATE NOT NULL
);
 
INSERT INTO Alunos (nome, sobrenome,dat_inscricao,dat_manut) VALUES
  ('Rogerio', 'Hirata','2019-12-01',CURRENT_TIMESTAMP()),
  ('Adilson', 'Silva','2019-11-01',CURRENT_TIMESTAMP()),
  ('Haron', 'Teste','2019-10-01',CURRENT_TIMESTAMP());