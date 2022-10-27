CREATE DATABASE IF NOT EXISTS estacionamento;
USE estacionamento;


    CREATE TABLE vaga (

        idVaga      int NOT NULL AUTO_INCREMENT,
        numero      int NOT NULL,
        rua         varchar (100) NOT NULL,
        obliqua     boolean NOT NULL,
        PRIMARY KEY (idVaga));



    CREATE TABLE motorista (

        idMotorista     int NOT NULL AUTO_INCREMENT,
        nomecompleto    varchar (100) NOT NULL,
        gênero          boolean NOT NULL,
        RG              int NOT NULL,
        CPF             int NOT NULL,
        celular         int NOT NULL,
        email           varchar (100) NOT NULL,
        senha           varchar (20) NOT NULL,
        PRIMARY KEY     (idMotorista));
