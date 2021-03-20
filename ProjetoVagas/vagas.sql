-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 03-Jul-2020 às 01:47
-- Versão do servidor: 10.4.11-MariaDB
-- versão do PHP: 7.2.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `vagas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastar`
--

CREATE TABLE `cadastar` (
  `emailc` text NOT NULL,
  `senha` int(11) NOT NULL,
  `endereco` text NOT NULL,
  `enderecop` text NOT NULL,
  `cidadec` text NOT NULL,
  `estadoc` text NOT NULL,
  `cep` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastrarvaga`
--

CREATE TABLE `cadastrarvaga` (
  `nomeare` text NOT NULL,
  `salario` int(11) NOT NULL,
  `cidade` text NOT NULL,
  `estado` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
