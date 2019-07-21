-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 21/07/2019 às 02:56
-- Versão do servidor: 10.1.36-MariaDB
-- Versão do PHP: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `byui_leadsystem`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `LEADS_TABLE`
--

CREATE TABLE `LEADS_TABLE` (
  `id` double NOT NULL,
  `firstName` varchar(45) NOT NULL DEFAULT '',
  `phonenumber` varchar(45) NOT NULL DEFAULT '',
  `lastName` varchar(45) NOT NULL DEFAULT '',
  `email` varchar(45) NOT NULL DEFAULT '',
  `country` varchar(255) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `LEADS_TABLE`
--

INSERT INTO `LEADS_TABLE` (`id`, `firstName`, `phonenumber`, `lastName`, `email`, `country`) VALUES
(22, 'Ramon', '(200)123456789', 'Andrade', 'ramon@yahoo.com', 'Brasil'),
(23, 'Ramon', '(200)123456789', 'Andrade', 'ramon1@yahoo.com', 'Brasil'),
(24, 'Jessica', '604149115', 'Andrade', 'ramondandrade@yahoo.com', 'BR'),
(25, 'Test', '123456', 'Test', 'test@test.com', 'USA'),
(26, 'Ramon', '(200)123456789', 'Andrade', 'ramon123@yahoo.com', 'Brasil');

-- --------------------------------------------------------

--
-- Estrutura para tabela `USER_TABLE`
--

CREATE TABLE `USER_TABLE` (
  `id` double NOT NULL,
  `firstName` varchar(45) NOT NULL DEFAULT '',
  `lastName` varchar(45) NOT NULL DEFAULT '',
  `userId` varchar(45) NOT NULL DEFAULT '',
  `password` varchar(45) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `USER_TABLE`
--

INSERT INTO `USER_TABLE` (`id`, `firstName`, `lastName`, `userId`, `password`) VALUES
(1, 'Ramon', 'Andrade', 'admin', 'admin');

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `LEADS_TABLE`
--
ALTER TABLE `LEADS_TABLE`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `USER_TABLE`
--
ALTER TABLE `USER_TABLE`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `LEADS_TABLE`
--
ALTER TABLE `LEADS_TABLE`
  MODIFY `id` double NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT de tabela `USER_TABLE`
--
ALTER TABLE `USER_TABLE`
  MODIFY `id` double NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
