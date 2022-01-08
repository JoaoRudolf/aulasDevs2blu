create table alunos (
codaluno serial,
nomealuno varchar(30) not null,
medaluno decimal(4,2),
primary key (codaluno)
);

create index ix_nome on alunos (nomealuno);

create table notas (
codaluno integer not null,
nravaliacao integer not null,
vlrnota decimal(4,2) not null,
primary key (codaluno, nravaliacao)
);

insert into alunos (codaluno, nomealuno) values (1, 'joao');
insert into alunos (codaluno, nomealuno) values (2, 'vanessa');

select * from alunos;

insert into notas values (1, 1, 8.5);

select * from alunos_notas;

drop table notas2;

select * from notas;

alter table notas 
add constraint fk_alunos_nota
foreign key (codaluno) 
references alunos (codaluno);
