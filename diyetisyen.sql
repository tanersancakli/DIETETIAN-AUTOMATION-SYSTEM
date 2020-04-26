-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Anamakine: localhost
-- Üretim Zamanı: 02 Haz 2016, 12:17:03
-- Sunucu sürümü: 5.6.12-log
-- PHP Sürümü: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Veritabanı: `diyetisyen`
--
CREATE DATABASE IF NOT EXISTS `diyetisyen` DEFAULT CHARACTER SET utf32 COLLATE utf32_turkish_ci;
USE `diyetisyen`;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `hasta_muayene`
--

CREATE TABLE IF NOT EXISTS `hasta_muayene` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uye_id` int(11) DEFAULT NULL,
  `tc_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `adi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `soyadi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  `dtarihi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  `cinsiyeti` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  `dyeri` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  `yas` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  `kilo` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  `boy` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  `sikayet` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  `aciklama` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci AUTO_INCREMENT=12 ;

--
-- Tablo döküm verisi `hasta_muayene`
--

INSERT INTO `hasta_muayene` (`id`, `uye_id`, `tc_no`, `adi`, `soyadi`, `dtarihi`, `cinsiyeti`, `dyeri`, `yas`, `kilo`, `boy`, `sikayet`, `aciklama`) VALUES
(1, 3, '12345678912', 'ilkay', 'aslan', NULL, NULL, 'Niğde', '25', '80', '1,50', 'obezite başlangıcı', 'diyet uygulanacak'),
(2, 8, '1', 'Ali', 'KOÇ', '07 / TEMMUZ / 1955', 'Kadın', '?stanbul', '23', '34', '1,75', 'kilo kaybı', 'kilo alması için diyet uygulanacak'),
(3, 13, '2172555', 'merve', 'kavas', '01 / ŞUBAT / 1966', 'Kadın', 'ankara', '18', '150', '175', 'obezite başlangıcı', 'zdjı<zdzsf'),
(4, 14, '444555', 'tuna', 'yıldız', '04 / NİSAN / 1995', 'Erkek', 'ankara', '18', '85', '150', 'obezite başlangıcı', 'diyet uygulanacak'),
(5, 15, '555666', 'ahmet', 'karakaya', '05 / MAYIS / 1993', 'Erkek', 'kayseri', '18', '87', '160', 'obezite başlangıcı ', 'diyet  bi mitar azaltılacak'),
(6, 17, '777888', 'fatma', 'kurt', '04 / KASIM / 1992', 'Kadın', 'muğla', '18', '70', '150', 'aşırı kilo', 'diyet uygulandı'),
(7, 18, '888999', 'derya', 'han', '05 / NİSAN / 1990', 'Kadın', 'samsun', '19', '80', '150', 'aşırı kilo', 'diyet uygulanacak'),
(8, 16, '666777', 'hasan', 'mert', '05 / HAZİRAN / 1993', 'Erkek', 'adana', '19', '80', '150', 'aşırı kilo', 'diyet uygulanacak'),
(9, 19, '999888', 'hülya', 'güngör', '16 / EYLÜL / 1994', 'Kadın', 'manisa', '20', '80', '155', 'aşırı kilo alma', 'obezite başlangıcı'),
(10, 20, '111', 'kübra', 'deniz', '06 / ARALIK / 1991', 'Kadın', 'antakya', '45', '98', '165', 'aşırı kilo', 'diyet uygula'),
(11, NULL, '11111', 'ddd', 'jjj', 'GÜN / AY / YIL', 'Kadın', 'ggg', '14', '24', '145', 'sdd', 'ffgg');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `muayene_alma`
--

CREATE TABLE IF NOT EXISTS `muayene_alma` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uye_id` int(11) NOT NULL,
  `randevu_saati` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `randevu_tarihi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `kayit` int(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci AUTO_INCREMENT=20 ;

--
-- Tablo döküm verisi `muayene_alma`
--

INSERT INTO `muayene_alma` (`id`, `uye_id`, `randevu_saati`, `randevu_tarihi`, `kayit`) VALUES
(3, 3, 'Ö?LEDEN SONRA', '01 / OCAK / 1950', 1),
(5, 7, 'Ö?LEDEN ÖNCE', '02 / ?UBAT / 1951', 0),
(6, 6, 'Ö?LEDEN ÖNCE', '03 / MART / 1952', 1),
(7, 8, 'Ö?LEDEN SONRA', '03 / NiSAN / 1952', 1),
(8, 11, 'Ö?LEDEN SONRA', '06 / MAYIS / 1954', 1),
(9, 12, 'ÖĞLEDEN SONRA', '05 / MAYIS / 2017', 1),
(10, 13, 'ÖĞLEDEN ÖNCE', '02 / ŞUBAT / 2016', 1),
(11, 14, 'ÖĞLEDEN SONRA', '02 / OCAK / 2016', 1),
(12, 15, 'ÖĞLEDEN ÖNCE', '06 / MAYIS / 2016', 1),
(13, 16, 'ÖĞLEDEN SONRA', '10 / TEMMUZ / 2016', 1),
(14, 17, 'ÖĞLEDEN SONRA', '12 / TEMMUZ / 2016', 1),
(15, 18, 'ÖĞLEDEN ÖNCE', '15 / HAZİRAN / 2016', 1),
(16, 19, 'ÖĞLEDEN ÖNCE', '20 / EKİM / 2016', 1),
(17, 20, 'ÖĞLEDEN ÖNCE', '04 / HAZİRAN / 2016', 1),
(18, 21, 'SEÇİNİZ', '01 / ŞUBAT / 1956', 1),
(19, 8, 'ÖĞLEDEN SONRA', '03 / NİSAN / 1952', 1);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uyeler`
--

CREATE TABLE IF NOT EXISTS `uyeler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tc_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `adi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `soyadi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `cinsiyet` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `dyeri` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `dtarihi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `baba_adi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `anne_adi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `cep_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `adres` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `sifre` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `meslek` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci AUTO_INCREMENT=22 ;

--
-- Tablo döküm verisi `uyeler`
--

INSERT INTO `uyeler` (`id`, `tc_no`, `adi`, `soyadi`, `cinsiyet`, `dyeri`, `dtarihi`, `baba_adi`, `anne_adi`, `cep_no`, `adres`, `email`, `sifre`, `meslek`) VALUES
(3, '11', 'ilkay', 'aslan', 'harun', 'nigde', '', '', 'arzu', 'nigdeyolu', '123456789', 'ilkay@hotmail.com', '12345', NULL),
(6, '12345678998', 'nurcan', 'yildirim', 'yilmaz', 'kayseri', '', '', 'aysegul', 'sivas', '125486', 'nurcan@hotmail.com', '123456', NULL),
(7, '5', 'busra', 'korkmaz', 'aaa', 'k?r?kkale', '', '', 'bbb', 'ccc', '84846456', 'busra@', '12345', NULL),
(8, '1', 'Ali', 'KOÇ', 'Erkek', '?stanbul', '07 / TEMMUZ / 1955', 'dsa', 'asd', 'aaaaa', '0532 333 33 33', 'ali@gmail.com', '1', NULL),
(9, 'doktor', 'admin1', 'a', 'Kad?n', 'ankara', '03 / ?UBAT / 1951', 'a', 'a', 'a', '05076154585', 'admin1@hotmail.com', '1', 'Doktor'),
(10, 'sekreter', 'admin2', 'b', 'Kad?n', 'bursa', '02 / OCAK / 1950', 'b', 'b', 'b', '05051425648', 'admin2@hotmail.com', '2', 'Sekreter'),
(11, '12', 'Ahmet', 'Kara', 'Erkek', 'kırsehir', '04 / MAYIS / 1955', 'ddd', 'dddd', 'dd', 'ddd', 'ahmet@hotmail.com', '1', NULL),
(12, '12547', 'merve', 'kuş', 'Kadın', 'antep', '03 / HAZİRAN / 1956', 'şerife', 'ali', '52478', 'sanayi', 'merve@hotmail.com', '258', NULL),
(13, '2172555', 'merve', 'kavas', 'Kadın', 'ankara', '01 / ŞUBAT / 1966', 'sıdıka', 'yusuf', '055222', 'sanayi', 'merve@hotmail.com', '1234', NULL),
(14, '444555', 'tuna', 'yıldız', 'Erkek', 'ankara', '04 / NİSAN / 1995', 'ayşe', 'ahmet', '0502655986', 'ankara', 'tuna@hotmail.com', '1996', NULL),
(15, '555666', 'ahmet', 'karakaya', 'Erkek', 'kayseri', '05 / MAYIS / 1993', 'fatma', 'ali', '05078969897', 'kayseri', 'ahmet@hotmail.com', '876', NULL),
(16, '666777', 'hasan', 'mert', 'Erkek', 'adana', '05 / HAZİRAN / 1993', 'ayse', 'ahmet', '05078969796', 'adana', 'hasan@hotmail.com', '897', NULL),
(17, '777888', 'fatma', 'kurt', 'Kadın', 'muğla', '04 / KASIM / 1992', 'hayriye', 'veli', '05056789897', 'muğla', 'fatma@hotmail.com', '987', NULL),
(18, '888999', 'derya', 'han', 'Kadın', 'samsun', '05 / NİSAN / 1990', 'serap', 'faruk', '05078678990', 'samsun', 'derya@hotmail.com', '678', NULL),
(19, '999888', 'hülya', 'güngör', 'Kadın', 'manisa', '16 / EYLÜL / 1994', 'serap', 'remzi', '05079800768', 'manisa', 'hülya@hotmail.com', '6789', NULL),
(20, '111', 'kübra', 'deniz', 'Kadın', 'antakya', '06 / ARALIK / 1991', 'derya', 'mehmet', '05074389596', 'antakya', 'kübra@hotmail.com', '123', NULL),
(21, '11111', 'ddd', 'jjj', 'Kadın', 'ggg', 'GÜN / AY / YIL', 'sdsd', 'ff', 'ff', 'ssa', 'sdd', '1', NULL);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `vezne`
--

CREATE TABLE IF NOT EXISTS `vezne` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tc_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `adi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `soyadi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `ucret` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci AUTO_INCREMENT=11 ;

--
-- Tablo döküm verisi `vezne`
--

INSERT INTO `vezne` (`id`, `tc_no`, `adi`, `soyadi`, `ucret`) VALUES
(1, '5', 'busra', 'korkmaz', '55'),
(2, '12547', 'merve', 'kuş', '50'),
(3, '2172555', 'merve', 'kavas', '75'),
(4, '444555', 'tuna', 'yıldız', '50'),
(5, '555666', 'ahmet', 'karakaya', '50'),
(6, '777888', 'fatma', 'kurt', '60'),
(7, '888999', 'derya', 'han', '80'),
(8, '999888', 'hülya', 'güngör', '75'),
(9, '111', 'kübra', 'deniz', '65'),
(10, '1', 'Ali', 'KOÇ', '50');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
