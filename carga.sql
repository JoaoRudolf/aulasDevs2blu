insert into caminhao (placa,datamanut,dataproxmanut) values ('PCK-5458','2020-12-22','2022-03-22');
insert into caminhao (placa,datamanut,dataproxmanut) values ('ABC-1234','2020-10-15','2022-01-15');
insert into caminhao (placa,datamanut,dataproxmanut) values ('WKK-2789','2020-11-08','2022-02-08');
insert into caminhao (placa,datamanut,dataproxmanut) values ('CKK-7524','2020-11-04','2022-02-04');

insert into motorista (nrcnh,nommotorista) values (1992882,'Brenda R. Winder');
insert into motorista (nrcnh,nommotorista) values (1734336,'José Castro Alves');
insert into motorista (nrcnh,nommotorista) values (0749800,'Júlio Almeida Barbosa');
insert into motorista (nrcnh,nommotorista) values (7744654,'Fernanda Gomes Lima');

insert into notafiscal (nrnota,dataemissao,pesototal,vlrtotal)
values (1,'2021-12-22',300.00,3254.60);
insert into notafiscal (nrnota,dataemissao,pesototal,vlrtotal)
values (2,'2021-12-22',675.00,4525.80);
insert into notafiscal (nrnota,dataemissao,pesototal,vlrtotal)
values (3,'2021-12-22',450.00,3683.60);

insert into notafiscal (nrnota,dataemissao,pesototal,vlrtotal)
values (4,'2021-11-14',250.00,1680.35);
insert into notafiscal (nrnota,dataemissao,pesototal,vlrtotal)
values (5,'2021-11-14',252.00,1700.00);
insert into notafiscal (nrnota,dataemissao,pesototal,vlrtotal)
values (6,'2021-11-16',12800.00,25680.00);

insert into notafiscal (nrnota,dataemissao,pesototal,vlrtotal)
values (7,'2021-10-02',14600.00,11645.00);
insert into notafiscal (nrnota,dataemissao,pesototal,vlrtotal)
values (8,'2021-10-02',1252.00,868.00);
insert into notafiscal (nrnota,dataemissao,pesototal,vlrtotal)
values (9,'2021-10-02',864.00,1985.45);

select sum(a.pesototal), sum(a.vlrtotal)
from notafiscal a
where a.nrnota  in (7,8,9);

-- Situacao manifesto (E = Embarcado  P = Pendente  S = SAIDA)
-- manifesto 1

INSERT INTO public.manifestocarga
(nrmanifesto, nrnota, pesototal, qtdvolumes, vlrtotal, indsituacao, dataembarque, datasaida)
VALUES(1, 1, 1425.00, 80, 11464.00, 'E', '2021-12-22', null);
INSERT INTO public.manifestocarga
(nrmanifesto, nrnota, pesototal, qtdvolumes, vlrtotal, indsituacao, dataembarque, datasaida)
VALUES(1, 2, 1425.00, 80, 11464.00, 'E', '2021-12-22', null);
INSERT INTO public.manifestocarga
(nrmanifesto, nrnota, pesototal, qtdvolumes, vlrtotal, indsituacao, dataembarque, datasaida)
VALUES(1, 3, 1425.00, 80, 11464.00, 'E', '2021-12-22', null);

-- manifesto 2
INSERT INTO public.manifestocarga
(nrmanifesto, nrnota, pesototal, qtdvolumes, vlrtotal, indsituacao, dataembarque, datasaida)
VALUES(2, 4, 13302.00, 120, 29060.35,'S', '2021-11-16','2021-11-17');
INSERT INTO public.manifestocarga
(nrmanifesto, nrnota, pesototal, qtdvolumes, vlrtotal, indsituacao, dataembarque, datasaida)
VALUES(2, 5, 13302.00, 120, 29060.35,'S','2021-11-16','2021-11-17');
INSERT INTO public.manifestocarga
(nrmanifesto, nrnota, pesototal, qtdvolumes, vlrtotal, indsituacao, dataembarque, datasaida)
VALUES(2, 6, 13302.00, 120, 29060.35,'S','2021-11-16','2021-11-17');

-- manifesto 3
INSERT INTO public.manifestocarga
(nrmanifesto, nrnota, pesototal, qtdvolumes, vlrtotal, indsituacao, dataembarque, datasaida)
VALUES(3, 7, 18716.00, 14498.45,185, 'P', null, null);
INSERT INTO public.manifestocarga
(nrmanifesto, nrnota, pesototal, qtdvolumes, vlrtotal, indsituacao, dataembarque, datasaida)
VALUES(3, 8,  18716.00, 14498.45,185,'P', null, null);
INSERT INTO public.manifestocarga
(nrmanifesto, nrnota, pesototal, qtdvolumes, vlrtotal, indsituacao, dataembarque, datasaida)
VALUES(3, 9,  18716.00, 14498.45,185,'P', null, null);


INSERT INTO public.balanca
(placa, nrcnh, datahrentrada, datahrsaida, pesoentrada, pesosaida)
VALUES('WKK-2789', 1992882, '2021-12-22 17:45:25', '1900-01-01 00:00:00', 12500, 0);

INSERT INTO public.balanca
(placa, nrcnh, datahrentrada, datahrsaida, pesoentrada, pesosaida)
VALUES('ABC-1234', 0749800, '2021-11-17 08:25:05', '1900-01-01 00:00:00', 16850, 0);



select * from caminhao;
select * from motorista;
select * from notafiscal;
select * from manifestocarga;
select * from balanca;

select 
c.placa "Placa",
to_char(c.datamanut, 'dd/mm/yyyy') as "Data da Manutenção",
c.dataproxmanut "Data da Próxima Manutenção"
from caminhao c
order by 3;

select c.placa, c.datamanut 
from caminhao c
where c.datamanut = (select max (datamanut) from caminhao);

select
m.nrmanifesto,
m.nrnota ,
m.pesototal ,
m.qtdvolumes ,
to_char( m.dataembarque, 'dd/mm/yyyy' ) as "Data Embarque",
m.indsituacao "Situação",
to_char(coalesce(m.datasaida, '01/01/1914'), 'dd/mm/yyyy' )"Data Saída"
from manifestocarga m 
where m.nrmanifesto = 1;