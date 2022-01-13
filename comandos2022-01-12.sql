select * from notafiscal n ;

select 
sum(n.pesototal) "Peso Total" ,
avg(n.pesototal) "Peso M�dio Total",
max(n.pesototal) "Peso Total M�ximo",
min(n.pesototal) "Peso Total M�nimo",
count(*) "Quantidade de Pesos"
from notafiscal n; 

select * from motorista m;

select
max(m.nommotorista) "maior",
min(m.nommotorista) "menor"
from motorista m ;

select 
to_char(n.dataemissao, 'TMMonth') "Data Emiss�o",
sum(n.pesototal) "Peso Total"
from notafiscal n 
group by 1
order by 1;

select 
to_char(n.dataemissao, 'TMDay') "Dia Semana",
sum(n.pesototal) "Peos Total" 
from notafiscal n 
group by 1
order by 1;

select * from notafiscal n ;

create table logfatura(
msglog varchar(80)
);

insert into logfatura (msglog) values ('Data Emiss�o: 22/12/2021 NF: 456877 Valor Faturado: 25568.50');

select * from logfatura l2;

create table resumofatura (
dataemissao Date,
nrfatura Integer,
vlrfatura decimal(8,2)
);

select 
substring(l2.msglog,15,10) "Data",
substring(l2.msglog,position('NF:' in l2.msglog)+3,6)
from logfatura l2;

insert into resumofatura 
(select
to_date(substr(l2.msglog,15,10),'dd/mm/yyyy'),
to_number(substr(l2.msglog,position('NF:' in l2.msglog)+3,7), '99999'),
to_number(substr(l2.msglog,position('Valor faturado:' in l2.msglog)+15,9), '9g999g999.99')
from logfatura l2);


select dataemissao, count(*)
from resumofatura a
group by a.dataemissao
having count(*) > 1;
 