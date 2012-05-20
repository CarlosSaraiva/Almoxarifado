---Autor: Diego Neves Isidoro, Carlos Saraiva
---Turma: 3�ADS Per�odo: Tarde
---E que come�e a baga�a...
---Primeiro deletando tabelas que tenham o mesmo nome da que v�o ser criadas
drop table Fornecedor cascade constraints;
---Agora come�o a criar as tabelas 
---Criando a tabela Fornecedor
create table Fornecedor
(
  forCodigo int not null,
  forNome varchar2(25) not null,
  forEndereco varchar2(25)not null,
  forTelefone varchar2(10),
---Criando uma restri��o para fornecedor com sua chave primaria
  constraint pkForCodigo primary key (forCodigo)
);
---Criando uma sequencia para chave primaria de Fornecedor
create sequence forCodigo start with 1 increment by 1;
select * from Fornecedor;
delete from Fornecedor;