insert into caminhão (placa, datamanut, dataultmanut)
values ('MAV-5526', '2021-08-10', '2022-03-16');

insert into caminhão (placa, datamanut, dataultmanut)
values 
('MOC-1324', '2021-08-11', '2022-03-19'),
('JML-3437', '2021-08-12', '2022-03-15');

-- public.caminhão definition

-- Drop table

-- DROP TABLE public.caminhão;

select * from caminhão c;

insert into motorista 
values 
(12345, 'lala'),
(98321, 'motora');

insert into motorista 
values 
(555555555, 'Nome Sobrenome'),
(666666666, 'Fulano da Silva'),
(777777777, 'Walt Disney');

select * from motorista m ;

select m.nommotorista, lpad(cast(m.ncnh as varchar),7,'0')
from motorista m;

insert into notafiscal (nnota ,dataemissao,pesototal,valortotal)
values
(1, '2021-12-24',250.00,4999.98),
(2, '2021-12-24',450.00,4545.00),
(3, '2021-12-24',300.00, 6662.24);

insert into notafiscal (nnota ,dataemissao,pesototal,valortotal)
values
(4, '2021-11-14',250.00,1680.35),
(5, '2021-11-14',252.00,1700.01),
(6, '2021-11-14',280.00,1690.34),
(7, '2021-11-14',320.00,1650.88),
(8, '2021-11-14',290.00,4480.30),
(9, '2021-11-14',220.00,6580.05);


select sum(a.pesototal), sum(a.valortotal)
from notafiscal a
where a.nnota in (4,5,6);

insert into manifestocarga values
(1, 1, 0, 0, 0, '', '', ''),



select * from notafiscal n ;