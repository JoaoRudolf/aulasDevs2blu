DROP TABLE Caminhão CASCADE;
DROP TABLE Motorista cascade;
DROP TABLE NotaFiscal CASCADE;
DROP TABLE ManifestoCarga cascade;
DROP TABLE Balanca CASCADE;

CREATE TABLE Caminhão (
    placa varchar(09) NOT NULL,
    dataManut Date NOT NULL,
    dataUltManut Date NOT NULL,
    PRIMARY KEY (placa)
);

CREATE TABLE Motorista (
    ncnh integer NOT NULL,
    nommotorista varchar(30) NOT NULL,
    PRIMARY KEY (ncnh)
);

CREATE TABLE NotaFiscal (
    nnota integer NOT NULL,
    dataemissao Date NOT NULL,
    pesototal decimal(7,2) NOT NULL,
    valortotal decimal(8,2) NOT NULL,
    PRIMARY KEY (nnota)
);

CREATE TABLE ManifestoCarga (
    nmanifesto integer NOT NULL,
    nnota integer NOT NULL,
    pesototal decimal(7,2) NOT NULL,
    qtdVolumes Integer NOT NULL,
    vlrtotal decimal(10,2) NOT NULL,
    indSituacao char(01) NOT NULL,
    dataEmbarque Date NOT NULL,
    dataSaida Date NOT NULL,
    PRIMARY KEY (nmanifesto, nnota)
);

CREATE TABLE Balanca (
    placa varchar NOT NULL,
    nrcnh integer NOT NULL,
    datahrentrada timestamp NOT NULL,
    datahrsaida timestamp NOT NULL,
    pesoentrada integer NOT NULL,
    pesosaida integer NOT NULL,
    pesodifere integer NOT NULL,
    PRIMARY KEY (placa, nrcnh, datahrentrada, datahrsaida)
);

ALTER TABLE ManifestoCarga ADD FOREIGN KEY (nnota) REFERENCES NotaFiscal(nnota);
ALTER TABLE Balanca ADD FOREIGN KEY (placa) REFERENCES Caminhão(placa);
ALTER TABLE Balanca ADD FOREIGN KEY (nrcnh) REFERENCES Motorista(ncnh);