-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 15-Ago-2018 às 03:34
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
-- Estrutura da tabela `metodologia`
--

CREATE TABLE `metodologia` (
  `id` int(5) NOT NULL,
  `titulo` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `metodologia`
--

INSERT INTO `metodologia` (`id`, `titulo`) VALUES
(1, 'Teste'),
(2, 'Teste'),
(3, 'AAA'),
(4, 'ABC');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `id` int(5) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `email` varchar(150) NOT NULL,
  `sexo` varchar(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `pessoa`
--

INSERT INTO `pessoa` (`id`, `nome`, `email`, `sexo`) VALUES
(1, 'Juliana', 'pessoa1@gmail.com', 'feminino'),
(2, 'Vanessa', 'pessoa2@gmail.com', 'feminino'),
(3, 'Mariana', 'pessoa3@gmail.com', 'feminino'),
(4, 'Hebert', 'pessoa4@gmail.com', 'masculino'),
(5, 'Richard', 'pessoa5@gmail.com', 'masculino'),
(6, 'Caio', 'pessoa6@gmail.com', 'masculino');

-- --------------------------------------------------------

--
-- Estrutura da tabela `rel_tarefa_pessoa`
--

CREATE TABLE `rel_tarefa_pessoa` (
  `id` int(5) NOT NULL,
  `id_tarefa` int(11) NOT NULL,
  `id_pessoa` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `rel_tarefa_pessoa`
--

INSERT INTO `rel_tarefa_pessoa` (`id`, `id_tarefa`, `id_pessoa`) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 2, 3),
(4, 3, 4),
(5, 4, 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tarefa`
--

CREATE TABLE `tarefa` (
  `id` int(5) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `prazo_estimado` date DEFAULT NULL,
  `descricao` varchar(400) DEFAULT NULL,
  `data_inicio` date NOT NULL,
  `data_termino` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tarefa`
--

INSERT INTO `tarefa` (`id`, `titulo`, `prazo_estimado`, `descricao`, `data_inicio`, `data_termino`) VALUES
(1, 'Tarefa 1', '2018-08-14', 'Descricao tarefa 1', '2018-08-10', '2018-08-11'),
(2, 'Tarefa 2', '2018-07-08', 'Descricao tarefa 2', '2018-07-08', '2018-07-08'),
(3, 'Tarefa 3', '2018-07-08', 'Descricao tarefa 3', '2018-07-08', '2018-07-09'),
(4, 'Tarefa 4', '2018-07-08', 'Descricao tarefa 4', '2018-07-05', '2018-07-09'),
(5, 'Tarefa 5', '2018-07-09', 'Descricao tarefa 5', '2018-07-06', '2018-07-09'),
(6, 'Tarefa 6', '2018-07-09', 'Descricao tarefa 6', '2018-07-06', '2018-07-09'),
(7, 'Tarefa 7', '2018-07-09', 'Descricao tarefa 7', '2018-07-06', '2018-07-09');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pessoa`
--
ALTER TABLE `pessoa`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rel_tarefa_pessoa`
--
ALTER TABLE `rel_tarefa_pessoa`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tarefa`
--
ALTER TABLE `tarefa`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `rel_tarefa_pessoa`
--
ALTER TABLE `rel_tarefa_pessoa`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `tarefa`
--
ALTER TABLE `tarefa`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
