create table cliente(
	id serial primary key,
	nome varchar(50) not null,
	cpf varchar(11) not null unique,
	endereco varchar(50),
	telefone varchar(13)
);

drop table cliente;

select * from cliente;

update cliente set a,a,a,a where id = 10;

delete from cliente
where id = 4;

update cliente
set nome = 'Magalôncia'
where id = 10;

-- melhor usar id próprio, mas pôr cpf como unique 