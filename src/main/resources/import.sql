INSERT INTO tb_categoria (descricao) VALUES ('Curso');
INSERT INTO tb_categoria (descricao) VALUES ('Oficina');

INSERT INTO tb_atividades (name, descricao, preco, categoria_id) VALUES ('Curso de HTML', 'Aprenda HTML de forma prática', 80.00, 1);
INSERT INTO tb_atividades (name, descricao, preco, categoria_id) VALUES ('Oficina de GitHub', 'Controle versões de seus projetos', 50.00, 2);

INSERT INTO tb_bloco (inicio, fim, atividades_id) VALUES ('2017-09-25T08:00:00', '2017-09-25T11:00:00', 1);
INSERT INTO tb_bloco (inicio, fim, atividades_id) VALUES ('2017-09-25T14:00:00', '2017-09-25T18:00:00', 2);
INSERT INTO tb_bloco (inicio, fim, atividades_id) VALUES ('2017-09-26T08:00:00', '2017-09-26T11:00:00', 2);

INSERT INTO tb_participantes (name, email) VALUES ('José Silva', 'jose@gmail.com');
INSERT INTO tb_participantes (name, email) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participantes (name, email) VALUES ('Maria do Rosário', 'maria@gmail.com');
INSERT INTO tb_participantes (name, email) VALUES ('Teresa Silva', 'teresa@gmail.com');


INSERT INTO tb_participante_atividade (participantes_id, atividades_id) VALUES (1, 1);
INSERT INTO tb_participante_atividade (participantes_id, atividades_id) VALUES (1, 2);
INSERT INTO tb_participante_atividade (participantes_id, atividades_id) VALUES (2, 1);
INSERT INTO tb_participante_atividade (participantes_id, atividades_id) VALUES (3, 1);
INSERT INTO tb_participante_atividade (participantes_id, atividades_id) VALUES (3, 2);
INSERT INTO tb_participante_atividade (participantes_id, atividades_id) VALUES (4, 2);

