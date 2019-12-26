DROP TABLE IF EXISTS Usuario;
 
CREATE TABLE Usuario (
  id INT AUTO_INCREMENT PRIMARY KEY,
  usuario VARCHAR(250) NOT NULL,
  senha VARCHAR(250) NOT NULL,
  nome VARCHAR(250) NOT NULL,
  sobrenome VARCHAR(250) NOT NULL,
  dat_inscricao DATE NOT NULL,
  dat_manut DATE NOT NULL
);
 
INSERT INTO Usuario (usuario,senha,nome,sobrenome,dat_inscricao,dat_manut) VALUES
  ('rogerioh','senha','Rogerio','Hirata','2019-12-01',CURRENT_TIMESTAMP()),
  ('adilsons','senha','Adilson','Silva','2019-11-01',CURRENT_TIMESTAMP()),
  ('haront','senha','Haron','Teste','2019-10-01',CURRENT_TIMESTAMP());