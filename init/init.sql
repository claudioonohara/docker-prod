-- TABELA PESSOA
CREATE SEQUENCE pes_id MINVALUE 1 INCREMENT 1;

CREATE TABLE pessoa (
  pes_id              INTEGER    NOT NULL    DEFAULT Nextval('pes_id'),
  pes_nome            VARCHAR(200)    NOT NULL,
  pes_data_nascimento DATE    NOT NULL,
  pes_sexo            VARCHAR(9)    NOT NULL,
  pes_mae             VARCHAR(200)    NOT NULL,
  pes_pai             VARCHAR(200)    NOT NULL,
     PRIMARY KEY ( pes_id ));


-- TABELA UNIDADE
CREATE SEQUENCE unid_id MINVALUE 1 INCREMENT 1;

CREATE TABLE unidade (
  unid_id    INTEGER    NOT NULL    DEFAULT Nextval('unid_id'),
  unid_nome  VARCHAR(200)    NOT NULL,
  unid_sigla VARCHAR(20)    NOT NULL,
     PRIMARY KEY ( unid_id ));

-- TABELA CIDADE
CREATE SEQUENCE cid_id MINVALUE 1 INCREMENT 1;

CREATE TABLE cidade (
  cid_id   INTEGER    NOT NULL    DEFAULT Nextval('cid_id'),
  cid_nome VARCHAR(200)    NOT NULL,
  cid_uf   CHAR(2)    NOT NULL,
     PRIMARY KEY ( cid_id ));

-- TABELA ENDERECO
CREATE SEQUENCE end_id MINVALUE 1 INCREMENT 1;

CREATE TABLE endereco (
  end_id              INTEGER    NOT NULL    DEFAULT Nextval('end_id'),
  end_tipo_logradouro VARCHAR(50)    NOT NULL,
  end_logradouro      VARCHAR(200)    NOT NULL,
  end_numero          INTEGER    NOT NULL,
  end_bairro          VARCHAR(100)    NOT NULL,
  cid_id              INTEGER    NOT NULL,
     PRIMARY KEY ( end_id ));

CREATE INDEX IENDERECO1 ON endereco (
      cid_id);
ALTER TABLE endereco
 ADD CONSTRAINT IENDERECO1 FOREIGN KEY ( cid_id ) REFERENCES cidade(cid_id);


-- TABELA SERVIDOR_TEMPORARIO
CREATE TABLE servidor_temporario (
  pes_id           INTEGER    NOT NULL,
  st_data_admissao DATE    NOT NULL,
  st_data_demissao DATE    NOT NULL,
     PRIMARY KEY ( pes_id,st_data_admissao,st_data_demissao ));

ALTER TABLE servidor_temporario
 ADD CONSTRAINT ISERVIDOR_TEMPORARIO1 FOREIGN KEY ( pes_id ) REFERENCES pessoa(pes_id);


-- TABELA SERVIDOR_EFETIVO
 CREATE TABLE servidor_efetivo (
  pes_id       INTEGER    NOT NULL,
  se_matricula VARCHAR(20)    NOT NULL,
     PRIMARY KEY ( pes_id,se_matricula ));
	 
ALTER TABLE servidor_efetivo
 ADD CONSTRAINT ISERVIDOR_EFETIVO1 FOREIGN KEY ( pes_id ) REFERENCES pessoa(pes_id);


-- TABELA UNIDADE_ENDERECO
CREATE TABLE unidade_endereco (
  unid_id INTEGER    NOT NULL,
  end_id  INTEGER    NOT NULL,
     PRIMARY KEY ( unid_id,end_id ));

CREATE INDEX IUNIDADE_ENDERECO1 ON unidade_endereco (
      end_id);

ALTER TABLE unidade_endereco
 ADD CONSTRAINT IUNIDADE_ENDERECO2 FOREIGN KEY ( unid_id ) REFERENCES unidade(unid_id);
ALTER TABLE unidade_endereco
 ADD CONSTRAINT IUNIDADE_ENDERECO1 FOREIGN KEY ( end_id ) REFERENCES endereco(end_id);

-- TABELA LOTACAO
 CREATE SEQUENCE lot_id MINVALUE 1 INCREMENT 1;

CREATE TABLE lotacao (
  lot_id           INTEGER    NOT NULL    DEFAULT Nextval('lot_id'),
  pes_id           INTEGER    NOT NULL,
  unid_id          INTEGER    NOT NULL,
  lot_data_lotacao DATE    NOT NULL,
  lot_data_remocao DATE    NOT NULL,
  lot_portaria     VARCHAR(100)    NOT NULL,
     PRIMARY KEY ( lot_id ));

CREATE INDEX ILOTACAO1 ON lotacao (
      unid_id);

-- TABELA PESSOA_ENDERECO
CREATE TABLE pessoa_endereco (
  pes_id INTEGER    NOT NULL,
  end_id INTEGER    NOT NULL,
     PRIMARY KEY ( pes_id,end_id ));

CREATE INDEX IPESSOA_ENDERECO1 ON pessoa_endereco (
      end_id);

ALTER TABLE pessoa_endereco
 ADD CONSTRAINT IPESSOA_ENDERECO2 FOREIGN KEY ( pes_id ) REFERENCES pessoa(pes_id);
ALTER TABLE pessoa_endereco
 ADD CONSTRAINT IPESSOA_ENDERECO1 FOREIGN KEY ( end_id ) REFERENCES endereco(end_id);

-- TABELA FOTO_PESSOA
-- A coluna fp_foto , não esta sendo usada para armezenar a foto, ela foi criada para que genexus criasse o controle 
-- de external Storage Provider para envio da foto para o Minio
-- A coluna fp_foto_GXI foi criada automaticamente pelo genexus para armazenar o caminho da foto no Minio
-- A coluna fp_hash foi esta com tamanho 150, o hash gerado pelo algoritmo utilizado pelo Genexus estava gerando um hash com comprimento maior que 50
CREATE SEQUENCE fp_id MINVALUE 1 INCREMENT 1;

CREATE TABLE foto_pessoa (
  fp_id       INTEGER    NOT NULL    DEFAULT Nextval('fp_id'),
  pes_id      INTEGER    NOT NULL,
  fp_data     DATE    NOT NULL,
  fp_bucket   VARCHAR(50)    NOT NULL,
  fp_hash     VARCHAR(150)    NOT NULL,
  fp_foto     BYTEA    NOT NULL,
  fp_foto_GXI VARCHAR(2048)    NOT NULL,
     PRIMARY KEY ( fp_id ));

CREATE INDEX IFOTO_PESSOA1 ON foto_pessoa (
      pes_id);

ALTER TABLE foto_pessoa
 ADD CONSTRAINT IFOTO_PESSOA1 FOREIGN KEY ( pes_id ) REFERENCES pessoa(pes_id);