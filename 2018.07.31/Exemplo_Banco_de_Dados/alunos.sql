-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 04-Ago-2018 às 01:37
-- Versão do servidor: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `alunos`
--

CREATE TABLE `alunos` (
  `id` int(3) NOT NULL,
  `nome` varchar(80) NOT NULL,
  `endereco` varchar(150) NOT NULL,
  `bairro` varchar(80) NOT NULL,
  `cep` int(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `alunos`
--

INSERT INTO `alunos` (`id`, `nome`, `endereco`, `bairro`, `cep`) VALUES
(1, 'AA', 'Av Águia de Haia, 2600', 'Jd São Nicolau', 3811111),
(2, 'AA', 'Av Águia de Haia, 2600', 'Jd São Nicolau', 3811111),
(3, 'AA', 'Av Águia de Haia, 2600', 'Jd São Nicolau', 3811111),
(4, 'AA', 'Av Águia de Haia, 2600', 'Jd São Nicolau', 3811111),
(5, 'AA', 'Av Águia de Haia, 2600', 'Jd São Nicolau', 3811111),
(6, 'AA', 'Av Águia de Haia, 2600', 'Jd São Nicolau', 3811111),
(7, 'AA', 'Av Águia de Haia, 2600', 'Jd São Nicolau', 3811111),
(8, 'Richard', 'Av Águia de Haia, 2600', 'Jd São Nicolau', 3811111);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alunos`
--
ALTER TABLE `alunos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alunos`
--
ALTER TABLE `alunos`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
