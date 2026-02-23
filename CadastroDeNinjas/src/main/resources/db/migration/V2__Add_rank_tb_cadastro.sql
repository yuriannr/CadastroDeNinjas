--Migration, serve para maior controle de versão do DB

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);