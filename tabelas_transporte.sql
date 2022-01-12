CREATE TABLE Caminhao (
    placa varchar(09) NOT NULL,
    dataManut Date NOT NULL,
    dataproxmanut Date NOT NULL,
    PRIMARY KEY (placa)
);


CREATE TABLE Motorista (
    nrcnh integer NOT NULL,
    nommotorista varchar(30) NOT NULL,
    PRIMARY KEY (nrcnh)
);

CREATE TABLE NotaFiscal (
    nrnota integer NOT NULL,
    dataemissao date NOT NULL,
    pesototal decimal(7,2) NOT NULL,
    vlrtotal decimal(9,2) NOT NULL,
    PRIMARY KEY (nrnota)
);

CREATE TABLE ManifestoCarga (
    nrmanifesto integer NOT NULL,
    nrnota integer NOT NULL,
    pesototal decimal(7,2) NOT NULL,
    qtdvolumes integer NOT NULL,
    vlrtotal decimal(10,2) NOT NULL,
    indsituacao char(01) NOT NULL,
    dataembarque Date,
    datasaida Date,
    PRIMARY KEY (nrmanifesto, nrnota)
);


CREATE TABLE Balanca (
    regbalanca serial NOT NULL,
    placa varchar(09) NOT NULL,
    nrcnh integer NOT NULL,
    datahrentrada timestamp NOT NULL,
    datahrsaida timestamp,
    pesoentrada integer NOT NULL,
    pesosaida integer,
    PRIMARY KEY (regbalanca, placa, nrcnh, datahrentrada, datahrsaida)
);

ALTER TABLE ManifestoCarga ADD FOREIGN KEY (nrnota) REFERENCES NotaFiscal(nrnota);
ALTER TABLE Balanca ADD FOREIGN KEY (nrcnh) REFERENCES Motorista(nrcnh);
ALTER TABLE Balanca ADD FOREIGN KEY (placa) REFERENCES Caminhao(placa);
ALTER TABLE ManifestoSaida ADD FOREIGN KEY (regbalanca) REFERENCES Balanca(regbalanca);
ALTER TABLE ManifestoSaida ADD FOREIGN KEY (nrmanifesto) REFERENCES ManifestoCarga(nrmanifesto);