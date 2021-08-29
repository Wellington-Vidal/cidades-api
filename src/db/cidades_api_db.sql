
DROP TABLE IF EXISTS `pais`;
CREATE TABLE `pais` (
  `id` int(11) NOT NULL,
  `nome` varchar(60) DEFAULT NULL,
  `nome_pt` varchar(60) DEFAULT NULL,
  `sigla` varchar(2) DEFAULT NULL,
  `bacen` int(5) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Países e Nações';

CREATE TABLE `estado` (
  `id` int(11) NOT NULL,
  `nome` varchar(75) DEFAULT NULL,
  `uf` varchar(2) DEFAULT NULL,
  `ibge` int(2) DEFAULT NULL,
  `pais` int(3) DEFAULT NULL,
  `ddd` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Unidades Federativas';

DROP TABLE IF EXISTS `cidade`;
CREATE TABLE `cidade` (
  `id` int(11) NOT NULL,
  `nome` varchar(120) DEFAULT NULL,
  `uf` int(2) DEFAULT NULL,
  `ibge` int(7) DEFAULT NULL,
  `lat_lon` varchar(60) DEFAULT NULL,
  `lat` float DEFAULT NULL,
  `lon` float DEFAULT NULL,
  `cod_tom` int(7) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Municipios das Unidades Federativas';