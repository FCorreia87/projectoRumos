DROP TABLE IF EXISTS `gestao_produtos`.`facturas_linhas`;
DROP TABLE IF EXISTS `gestao_produtos`.`facturas`;
DROP TABLE IF EXISTS `gestao_produtos`.`produtos`;
DROP TABLE IF EXISTS `gestao_produtos`.`subCategorias`;
DROP TABLE IF EXISTS `gestao_produtos`.`categorias`;
DROP TABLE IF EXISTS `gestao_produtos`.`empregados`;

CREATE TABLE `gestao_produtos`.`categorias` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` text NOT NULL,
  `descricao` mediumtext,
  PRIMARY KEY (`id`)
);

CREATE TABLE `gestao_produtos`.`subCategorias` (
  `categorias_id` int NOT NULL,
  `id` int NOT NULL,
  `descricao` mediumtext,
  PRIMARY KEY (`categorias_id`,`id`),
  FOREIGN KEY (`categorias_id`) REFERENCES gestao_produtos.categorias(`id`)
) ;

CREATE TABLE `gestao_produtos`.`empregados` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` text NOT NULL,
  `e_admin` BIT,
  PRIMARY KEY (`id`)
);

CREATE TABLE `gestao_produtos`.`produtos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` mediumtext,
  `iva` TINYINT NOT NULL,
  `precoUnitario` DECIMAL(13, 3) NOT NULL,
  `gestor` int NOT NULL,
  `categorias_id` int NOT NULL,
  `subcategorias_id` int NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`gestor`) REFERENCES gestao_produtos.empregados(`id`),
  FOREIGN KEY (`categorias_id`, `subcategorias_id`) REFERENCES gestao_produtos.subCategorias(`categorias_id`,`id`)
) ;

CREATE TABLE `gestao_produtos`.`facturas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `data` DATETIME NOT NULL,
  `nome` mediumtext,
  `morada` mediumtext,
  `nif` mediumtext,
  `empregados_id` int NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`empregados_id`) REFERENCES gestao_produtos.empregados(`id`)
);

CREATE TABLE `gestao_produtos`.`facturas_linhas` (
  `facturas_id` int NOT NULL,
  `id` int NOT NULL ,
  `quantidade` int NOT NULL,
  `produtos_id` int NOT NULL,
  `iva` TINYINT NOT NULL,
  `precoUnitario` DECIMAL(13, 3) NOT NULL,
  PRIMARY KEY (`facturas_id`, `id`),
  FOREIGN KEY (`facturas_id`) REFERENCES gestao_produtos.facturas(`id`),
  FOREIGN KEY (`produtos_id`) REFERENCES gestao_produtos.produtos(`id`)
);