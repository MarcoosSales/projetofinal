
--create database cadastro_rest_marcos;


--select * from Aviao;
--select * from Cidade;
--select * from Estado;
--select * from Piloto;
--select * from Voo;

--Insert Pilotos
insert into Piloto (cpf, dataNascimento, nome, telefone) values 
('12345678910','10-12-86','Marcos','55555555555'),
('12345678911','10-12-83','Jeremias','666666666');


--Insere Aviões
insert into Aviao (modelo) values 
('Boeing Top'),
('Boeing Classe Baixa');

--Inserir Estados
insert into Estado (nome, UF, pais) values
( 'Acre', 'AC', 'Brasil'),
( 'Alagoas', 'AL', 'Brasil'),
( 'Amazonas', 'AM', 'Brasil'),
( 'Amapá', 'AP', 'Brasil'),
( 'Bahia', 'BA', 'Brasil'),
( 'Ceará', 'CE', 'Brasil'),
( 'Distrito Federal', 'DF', 'Brasil'),
( 'Espírito Santo', 'ES', 'Brasil'),
( 'Minas Gerais', 'MG', 'Brasil'),
( 'Mato Grosso do Sul', 'MS', 'Brasil'),
('Mato Grosso', 'MT', 'Brasil'),
('Pará', 'PA', 'Brasil'),
('Paraíba', 'PB', 'Brasil'),
('Pernambuco', 'PE', 'Brasil'),
('Piauí', 'PI', 'Brasil'),
('Paraná', 'PR', 'Brasil'),
('Rio de Janeiro', 'RJ', 'Brasil'),
('Rio Grande do Norte', 'RN', 'Brasil'),
('Rondônia', 'RO', 'Brasil'),
('Roraima', 'RR', 'Brasil'),
('Rio Grande do Sul', 'RS', 'Brasil'),
('Santa Catarina', 'SC', 'Brasil'),
('Sergipe', 'SE', 'Brasil'),
('Tocantins', 'TO', 'Brasil'),
('São Paulo', 'SP', 'Brasil'),
('Goiás', 'GO', 'Brasil'),
('Maranhão', 'MA', 'Brasil');


--Inserir Cidades
insert into Cidade (nome, estado_id) values ('Palmas','24');
insert into Cidade (nome, estado_id) values ('Tucuruí','12');
insert into Cidade (nome, estado_id) values ('Brasilia','7');


--Inserir Voos
insert into Voo (horadataChegada, horadataPartida, precoPassagem, aviao_id, cidadeDestino_id, cidadeOrigem_id, piloto_id) values ('2019-05-30','2019-05-30',500,1,1,4,1);