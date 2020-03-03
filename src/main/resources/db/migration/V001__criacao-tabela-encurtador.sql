
CREATE TABLE tb_url_encurtada (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  sUrlOriginal VARCHAR(250) NOT NULL,
  sUrlCodificada VARCHAR(250) NOT NULL,
  dtCriado DATE NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT UC_UrlCodificada UNIQUE(sUrlCodificada)
);