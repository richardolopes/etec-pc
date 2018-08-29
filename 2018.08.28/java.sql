-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 28-Ago-2018 às 17:14
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
(1, '2'),
(2, '2'),
(3, 'Rapida');

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
(1, 'Richard ', 'r@gmail.com', 'masculino'),
(2, 'Caio', 'c@gmail.com', 'masculino'),
(3, 'Hebert', 'h@gmail.com', 'masculino');

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
(6, 2, 2),
(11, 3, 3),
(8, 3, 2);

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
(1, 'Tar 1', '2018-08-08', '2', '2018-08-08', '2018-08-08'),
(2, 'Tar 2 ', '2018-08-08', '2', '2018-08-08', '2018-08-08'),
(3, 'Atividade PC', '2018-08-28', 'Cadastro de varios baguio', '2018-08-10', '2018-08-26');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `metodologia`
--
ALTER TABLE `metodologia`
  ADD PRIMARY KEY (`id`);

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
-- AUTO_INCREMENT for table `metodologia`
--
ALTER TABLE `metodologia`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `rel_tarefa_pessoa`
--
ALTER TABLE `rel_tarefa_pessoa`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `tarefa`
--
ALTER TABLE `tarefa`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
