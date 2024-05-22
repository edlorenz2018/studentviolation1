-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2024 at 04:38 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentviolation`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_students`
--

CREATE TABLE `tbl_students` (
  `id` int(100) NOT NULL,
  `fname` varchar(500) NOT NULL,
  `lname` varchar(500) NOT NULL,
  `course` varchar(500) NOT NULL,
  `section` varchar(500) NOT NULL,
  `violation` text NOT NULL,
  `sanction` varchar(500) NOT NULL,
  `type` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_students`
--

INSERT INTO `tbl_students` (`id`, `fname`, `lname`, `course`, `section`, `violation`, `sanction`, `type`) VALUES
(1, 'Jose Ralph', 'Quinanola', 'BSIT', 'BSIT-2B', 'NO ID', '1st Warning', 'Minor Offense'),
(2, 'dfsfs', 'sdfsdf', 'BSIT', 'sdfsdf', 'dfdfsdfsdf', 'sdfdsf', 'Major Offense'),
(3, 'asdasd', 'asdasdas', 'BSIT', 'asdsad', 'sadasd', 'asdasd', 'Minor Offense'),
(4, 'dasd', 'adsasd', 'BEED', 'dadas', 'dasdasd', 'asdasd', 'Minor Offense'),
(5, 'Audrey', 'Quinanola', 'BSCRIM', 'BSCRIM-1C', 'NOT WEARING ID', '3RD WARNING', 'Minor Offense');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_users1`
--

CREATE TABLE `tbl_users1` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_position` varchar(50) NOT NULL,
  `u_program` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_users1`
--

INSERT INTO `tbl_users1` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_username`, `u_password`, `u_position`, `u_program`, `u_status`) VALUES
(1, 'EdLorenz', 'Villarasa', 'vil@email.com', 'eddy', 'villarasa', 'SAO', 'N/A', 'Active'),
(5, 'Eddy', 'Villarasaa', 'edy@email.com', 'lorenz', 'lorenz0712', 'DEAN', 'BSHM', 'Active'),
(7, 'JanzelBabon', 'Babon', 'janzel@email.com', 'jojan', 'babonbabon', 'DEAN', 'BSBA', 'Active'),
(9, 'abigail', 'mahelom', 'abi@email.com', 'abigail', 'abigailgwapa', 'DEAN', 'BSIT', 'Active'),
(10, 'Joe Ryan', 'Victorillo', 'asdasd@email.com', 'joeryan', 'ryanryan', 'DEAN', 'BSCRIM', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_violation`
--

CREATE TABLE `tbl_violation` (
  `violation_id` int(100) NOT NULL,
  `violation` text NOT NULL,
  `sanction` varchar(500) NOT NULL,
  `type` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_students`
--
ALTER TABLE `tbl_students`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_users1`
--
ALTER TABLE `tbl_users1`
  ADD PRIMARY KEY (`u_id`);

--
-- Indexes for table `tbl_violation`
--
ALTER TABLE `tbl_violation`
  ADD PRIMARY KEY (`violation_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_students`
--
ALTER TABLE `tbl_students`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_users1`
--
ALTER TABLE `tbl_users1`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tbl_violation`
--
ALTER TABLE `tbl_violation`
  MODIFY `violation_id` int(100) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
