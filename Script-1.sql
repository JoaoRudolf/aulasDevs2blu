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

insert into alunos (nomealuno, medaluno) values ('jacare', null);
insert into alunos (codaluno, nomealuno) values (2, 'vanessa');

insert into notas values (1, 1, 8.5);
insert into notas values (2, 1, 6.5);
insert into notas (codaluno, nravaliacao, vlrnota) values (3, 1, 5.5);
insert into notas values (4, 1, 9.5);
insert into notas values (5, 1, 10.0);
insert into notas values (6, 1, 7.0);

insert into notas values (1, 2, 9.5);
insert into notas values (2, 2, 6.5);
insert into notas (codaluno, nravaliacao, vlrnota) values (3, 2, 6.5);
insert into notas values (4, 2, 2);
insert into notas values (5, 2, 9.0);
insert into notas values (6, 2, 10);

insert into notas values (1, 3, 6.5);
insert into notas values (2, 3, 9.5);
insert into notas (codaluno, nravaliacao, vlrnota) values (3, 3, 5.5);
insert into notas values (4, 3, 4);
insert into notas values (5, 3, 7.0);
insert into notas values (6, 3, 8);

alter table notas 
add constraint fk_alunos_nota
foreign key (codaluno) 
references alunos (codaluno);

select * from alunos;
select * from notas where vlrnota = 10;
select * from notas;

delete nomealuno 
where codaluno = 5
from alunos;


delete from alunos;

select 
n.codaluno,
n.nravaliacao,
n. vlrnota 
from notas n
where n.vlrnota between 6 and 8
order by vlrnota;

update notas 
set vlrnota = 8
where codaluno = 1
and nravaliacao = 2;


create table notas_bkp as (select * from notas);

select * from notas_bkp;

alter table notas_bkp add column nomaluno varchar(30);

update notas_bkp n
set n.nomaluno = (select a.nomaluno from alunos a where codaluno);

select nomealuno from alunos;