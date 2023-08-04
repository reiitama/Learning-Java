-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 27, 2019 at 05:28 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sekolah`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertDTsiswa` (`nisNya` INT(11), `namaNya` VARCHAR(50))  BEGIN
INSERT INTO siswa(nis,nama) VALUES(nisNya, namaNya);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `tampilDatasiswa` ()  BEGIN
SELECT * FROM siswa;

END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `hotel`
--

CREATE TABLE `hotel` (
  `id` int(11) NOT NULL,
  `nama` varchar(113) NOT NULL,
  `kode` varchar(30) NOT NULL,
  `jenis` varchar(11) NOT NULL,
  `biaya` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hotel`
--

INSERT INTO `hotel` (`id`, `nama`, `kode`, `jenis`, `biaya`) VALUES
(232, 'saya', 'D001', 'Double Bed', 1200000),
(233, 'arif', 'D001', 'Double Bed', 1200000),
(234, 'jj', 'S001', 'Single Bed', 1000000);

-- --------------------------------------------------------

--
-- Table structure for table `kereta`
--

CREATE TABLE `kereta` (
  `id` int(11) NOT NULL,
  `jenis` varchar(50) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `biaya` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kereta`
--

INSERT INTO `kereta` (`id`, `jenis`, `jumlah`, `nama`, `biaya`) VALUES
(1, 'AG001', 10, 'Agro Bromo', 10945000),
(2, 'BS001', 2, 'Bima Sakti', 4000000),
(6, 'BS001', 1, 'Bima Sakti', 1122000),
(7, 'BS001', 1, 'Bima Sakti', 1298000),
(9, 'BS001', 2, 'BIMASAKTI', 4000000),
(10, 'BS001', 3, 'BIMASAKTI', 6000000),
(11, 'BS001', 2, 'BIMASAKTI', 4000000),
(12, 'BS001', 4, 'BIMASAKTI', 8000000);

-- --------------------------------------------------------

--
-- Table structure for table `kursus`
--

CREATE TABLE `kursus` (
  `nomorp` int(11) NOT NULL,
  `jenis` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `hari` varchar(30) NOT NULL,
  `total` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kursus`
--

INSERT INTO `kursus` (`nomorp`, `jenis`, `nama`, `hari`, `total`) VALUES
(1, 'U001', 'Umum', '2', '100000'),
(4, 'P001', 'Private', '3', '450000'),
(7, 'U001', 'Umum', '3', '100000'),
(8, 'U001', 'Umum', '3', '170000');

-- --------------------------------------------------------

--
-- Table structure for table `siswa`
--

CREATE TABLE `siswa` (
  `nomor_induk` int(12) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `jenkel` varchar(12) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `kelas` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `siswa`
--

INSERT INTO `siswa` (`nomor_induk`, `nama`, `jenkel`, `alamat`, `kelas`) VALUES
(15, 'Rei', 'Laki - Laki', 'Bogor broh', 'XII'),
(89, 'dg', 'Laki-Laki', 'fgh', '2'),
(123, 'Praja', 'Laki - Laki', 'asd', 'XII'),
(12345, 'udin', 'Laki-Laki', 'depok', '90'),
(16728, 'Rizky', 'Perempuan', 'Jakarta', '11'),
(98765, 'Pra', 'Laki-Laki', 'Ga punya Rumah', '5 SD');

-- --------------------------------------------------------

--
-- Table structure for table `tb_login`
--

CREATE TABLE `tb_login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_login`
--

INSERT INTO `tb_login` (`username`, `password`) VALUES
('admin', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `kereta`
--
ALTER TABLE `kereta`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `kursus`
--
ALTER TABLE `kursus`
  ADD PRIMARY KEY (`nomorp`);

--
-- Indexes for table `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`nomor_induk`);

--
-- Indexes for table `tb_login`
--
ALTER TABLE `tb_login`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `hotel`
--
ALTER TABLE `hotel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=235;

--
-- AUTO_INCREMENT for table `kereta`
--
ALTER TABLE `kereta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `kursus`
--
ALTER TABLE `kursus`
  MODIFY `nomorp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `siswa`
--
ALTER TABLE `siswa`
  MODIFY `nomor_induk` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=98766;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
