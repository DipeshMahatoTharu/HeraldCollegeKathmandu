-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 11:54 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `weatherapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `weather_details`
--

CREATE TABLE `weather_details` (
  `Id` int(11) NOT NULL,
  `city_name` varchar(255) NOT NULL,
  `temperature` decimal(6,2) NOT NULL,
  `description` varchar(255) NOT NULL,
  `main` varchar(255) NOT NULL,
  `humidity` int(11) NOT NULL,
  `wind` decimal(6,2) NOT NULL,
  `pressure` decimal(6,2) NOT NULL,
  `icon` varchar(50) NOT NULL,
  `weather_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `weather_details`
--

INSERT INTO `weather_details` (`Id`, `city_name`, `temperature`, `description`, `main`, `humidity`, `wind`, `pressure`, `icon`, `weather_date`) VALUES
(161, 'Sambhal', 19.93, 'scattered clouds', 'Clouds', 32, 5.37, 1015.00, '03d', '2024-02-19'),
(162, 'Sambhal', 20.00, 'Partly cloudy', 'Clouds', 70, 3.00, 1015.00, '03d', '2024-02-16'),
(163, 'Sambhal', 22.00, 'Clear sky', 'Clear', 65, 2.00, 1018.00, '01d', '2024-02-17'),
(164, 'Sambhal', 18.58, 'Overcast clouds', 'Clouds', 31, 2.31, 1013.00, '04d', '2024-02-18'),
(165, 'Sambhal', 19.93, 'scattered clouds', 'Clouds', 32, 5.37, 1015.00, '03d', '2024-02-19'),
(166, 'Sambhal', 19.93, 'scattered clouds', 'Clouds', 32, 5.37, 1015.00, '03d', '2024-02-19'),
(167, 'Sambhal', 19.93, 'scattered clouds', 'Clouds', 32, 5.37, 1015.00, '03d', '2024-02-19'),
(168, 'Sambhal', 19.93, 'scattered clouds', 'Clouds', 32, 5.37, 1015.00, '03d', '2024-02-19'),
(169, 'Kathmandu', 14.12, 'haze', 'Haze', 67, 0.00, 1022.00, '50d', '2024-02-19'),
(170, 'Kathmandu', 20.12, 'few clouds', 'Clouds', 45, 4.63, 1016.00, '02d', '2024-02-19'),
(171, 'Kathmandu', 20.12, 'few clouds', 'Clouds', 45, 4.63, 1016.00, '02d', '2024-02-19'),
(172, 'Kathmandu', 20.12, 'few clouds', 'Clouds', 45, 4.63, 1016.00, '02d', '2024-02-19'),
(173, 'Sambhal', 26.78, 'broken clouds', 'Clouds', 28, 5.51, 1008.00, '04d', '2024-02-19'),
(174, 'Kathmandu', 20.12, 'few clouds', 'Clouds', 45, 4.63, 1016.00, '02d', '2024-02-19'),
(175, 'Tokyo', 15.69, 'broken clouds', 'Clouds', 80, 8.23, 1017.00, '04n', '2024-02-19'),
(176, 'Sambhal', 26.78, 'broken clouds', 'Clouds', 28, 5.51, 1008.00, '04d', '2024-02-19');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `weather_details`
--
ALTER TABLE `weather_details`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `weather_details`
--
ALTER TABLE `weather_details`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=177;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
