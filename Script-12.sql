select *
from balanca b
where exists (select * from motorista m where m.nrcnh = b.nrcnh);

select *
from balanca b
where in (select * from motorista m where m.nrcnh = b.nrcnh);

select *
from manifestocarga m 
where m.indsituacao in (select distinct m.indsituacao 
						from  manifestocarga m
						where m.indsituacao  = 'E');

select m.indsituacao 
from  manifestocarga m
where m.indsituacao  = 'E'

select *
from manifestocarga m 
where m.indsituacao  = 'E'
and m.qtdvolumes = 75;

select *
from manifestocarga m 
where m.qtdvolumes in (80,185);

select nrnota 
from manifestocarga m 
where m.indsituacao in('E','P','S')
and m.dataembarque between '2021-11-01' and '2021-11-30'
and m.nrnota > 4;

select *
from manifestocarga m 
where m.indsituacao  in ('E','P', 'S')
and to_char(m.dataembarque, 'dd') in ('16', '11'); 


select count(*) from manifestocarga m ;

select * from manifestocarga;
