INSERT INTO Professor (nome, cpf, email, senha) VALUES ('Mariana Silva', '123.456.789-09', 'mariana.silva@exemplo.com', 'Senha#2025');
INSERT INTO Professor (nome, cpf, email, senha) VALUES ('Paulo Henrique', '987.654.321-00', 'paulo.henrique@exemplo.com', 'paulo1234');
INSERT INTO Professor (nome, cpf, email, senha) VALUES ('Ana Beatriz Costa', '111.222.333-44', 'ana.beatriz@exemplo.com', 'Abc!2025');
INSERT INTO Professor (nome, cpf, email, senha) VALUES ('Carlos Eduardo', '555.666.777-88', 'carlos.eduardo@exemplo.com', 'cEdu@2025');
INSERT INTO Professor (nome, cpf, email, senha) VALUES ('Fernanda Oliveira', '222.333.444-55', 'fernanda.oliveira@exemplo.com', 'fernanda#1');

INSERT INTO Turma (nome) VALUES ('1º Ano A');
INSERT INTO Turma (nome) VALUES ('1º Ano B');
INSERT INTO Turma (nome) VALUES ('2º Ano A');
INSERT INTO Turma (nome) VALUES ('2º Ano B');
INSERT INTO Turma (nome) VALUES ('3º Ano A');

INSERT INTO Curso (nome, turma_id, disciplina_id) VALUES ('Curso de Matemática Básica', 1, 1);
INSERT INTO Curso (nome, turma_id, disciplina_id) VALUES ('Curso de História Geral', 2, 2);
INSERT INTO Curso (nome, turma_id, disciplina_id) VALUES ('Curso de Geografia do Brasil', 3, 3);
INSERT INTO Curso (nome, turma_id, disciplina_id) VALUES ('Curso de Física Aplicada', 4, 4);
INSERT INTO Curso (nome, turma_id, disciplina_id) VALUES ('Curso de Língua Portuguesa', 5, 5);

INSERT INTO VideoAulas (titulo, curso_id, turma_id, professor_id) VALUES ('Aula 1 de Cálculo', 1, 1, 1);
INSERT INTO VideoAulas (titulo, curso_id, turma_id, professor_id) VALUES ('Introdução à Física', 4, 4, 2);
INSERT INTO VideoAulas (titulo, curso_id, turma_id, professor_id) VALUES ('Literatura Clássica', 5, 5, 3);
INSERT INTO VideoAulas (titulo, curso_id, turma_id, professor_id) VALUES ('História Moderna', 2, 2, 4);
INSERT INTO VideoAulas (titulo, curso_id, turma_id, professor_id) VALUES ('Biologia Celular', 3, 3, 5);

INSERT INTO Aluno (nome, cpf, email, senha, curso_id, turma_id) VALUES ('João Silva', '123.456.789-00', 'joao.silva@gmail.com', 'senha123', 1, 1);
INSERT INTO Aluno (nome, cpf, email, senha, curso_id, turma_id) VALUES ('Maria Oliveira', '987.654.321-00', 'maria.oliveira@gmail.com', 'senha456', 2, 2);
INSERT INTO Aluno (nome, cpf, email, senha, curso_id, turma_id) VALUES ('Carlos Souza', '111.222.333-44', 'carlos.souza@hotmail.com', 'senha789', 3, 3);
INSERT INTO Aluno (nome, cpf, email, senha, curso_id, turma_id) VALUES ('Ana Costa', '555.666.777-88', 'ana.costa@yahoo.com', 'senha321', 4, 4);
INSERT INTO Aluno (nome, cpf, email, senha, curso_id, turma_id) VALUES ('Lucas Pereira', '444.555.666-77', 'lucas.pereira@gmail.com', 'senha654', 5, 5);

INSERT INTO Progresso (disciplina_id, aluno_id) VALUES (1, 1); 
INSERT INTO Progresso (disciplina_id, aluno_id) VALUES (2, 2);
INSERT INTO Progresso (disciplina_id, aluno_id) VALUES (3, 3);
INSERT INTO Progresso (disciplina_id, aluno_id) VALUES (4, 4);
INSERT INTO Progresso (disciplina_id, aluno_id) VALUES (5, 5); 

INSERT INTO Planner (aluno_id, prioridades, agenda, tarefas) VALUES (1, 'Alta', '2025-09-20 09:00:00', 'Estudar para a prova de Cálculo e entregar o resumo de História.');
INSERT INTO Planner (aluno_id, prioridades, agenda, tarefas) VALUES (2, 'Média', '2025-09-22 14:30:00', 'Fazer os exercícios da lista de História Geral.');
INSERT INTO Planner (aluno_id, prioridades, agenda, tarefas) VALUES (3, 'Baixa', '2025-09-25 18:00:00', 'Ler o capítulo 5 do livro de Geografia.');
INSERT INTO Planner (aluno_id, prioridades, agenda, tarefas) VALUES (4, 'Urgente', '2025-09-19 10:00:00', 'Finalizar e submeter o projeto de Física Experimental.');
INSERT INTO Planner (aluno_id, prioridades, agenda, tarefas) VALUES (5, 'Alta', '2025-10-01 11:00:00', 'Preparar a apresentação do seminário de Língua Portuguesa.');

INSERT INTO Resumos (aluno_id, nome) VALUES (1, 'Resumo de Cálculo Diferencial');
INSERT INTO Resumos (aluno_id, nome) VALUES (2, 'Resumo sobre a Revolução Francesa');
INSERT INTO Resumos (aluno_id, nome) VALUES (3, 'Resumo de Geografia Política');
INSERT INTO Resumos (aluno_id, nome) VALUES (4, 'Resumo de Física Aplicada');
INSERT INTO Resumos (aluno_id, nome) VALUES (5, 'Resumo de Literatura Clássica');

INSERT INTO Disciplina (id, nome) VALUES (1, 'Matemática');
INSERT INTO Disciplina (id, nome) VALUES (2, 'História');
INSERT INTO Disciplina (id, nome) VALUES (3, 'Geografia');
INSERT INTO Disciplina (id, nome) VALUES (4, 'Física');
INSERT INTO Disciplina (id, nome) VALUES (5, 'Língua Portuguesa');
