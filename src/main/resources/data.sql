INSERT INTO Produto (id, gtin, nome) VALUES (1, '7894900011517', 'REFRIGERANTE COCA-COLA 2LT') ON CONFLICT DO NOTHING;
INSERT INTO Produto (id, gtin, nome) VALUES (2, '7891910000197', 'AÇÚCAR REFINADO UNIÃO 1KG') ON CONFLICT DO NOTHING;
INSERT INTO Produto (id, gtin, nome) VALUES (3, '7892840222949', 'SALGADINHO FANDANGOS QUEIJO') ON CONFLICT DO NOTHING;
INSERT INTO Produto (id, gtin, nome) VALUES (4, '7891910007110', 'AÇÚCAR DE CONFEITEIRO UNIÃO GLAÇÚCAR') ON CONFLICT DO NOTHING;
INSERT INTO Produto (id, gtin, nome) VALUES (5, '7891000053508', 'ACHOCOLATADO NESCAU 2.0') ON CONFLICT DO NOTHING;
INSERT INTO Produto (id, gtin, nome) VALUES (6, '7891000100103', 'LEITE CONDENSADO MOÇA') ON CONFLICT DO NOTHING;
INSERT INTO Produto (id, gtin, nome) VALUES (7, '7891991010856', 'CERVEJA BUDWEISER') ON CONFLICT DO NOTHING;
INSERT INTO Produto (id, gtin, nome) VALUES (8, '7891991010859', 'Coca Cola') ON CONFLICT DO NOTHING;

INSERT INTO fornecedor (id, cnpj, nome) VALUES (1, '56918868000120', 'Fornecedor 1') ON CONFLICT DO NOTHING;
INSERT INTO fornecedor (id, cnpj, nome) VALUES (2, '37563823000135', 'Fornecedor 2') ON CONFLICT DO NOTHING;