# 1.0 - Projeto Prático: Implementação Back-End

O projeto prático deverá ser entregue por todos os candidatos para os respectivos perfis: JAVA(back-end), Full Stack, PHP e GENEXUS. Neste projeto você deverá implementar uma API REST disponibilizando o artefato final conforme orientações deste documento. A solução deverá basear-se no seguinte diagrama de banco de dados:

API REST para o perfil:
- [ ] JAVA (back-end)
- [ ] Full Stack
- [ ] PHP
- [x] GENEXUS

## 1.1 Pré-requisitos

A. Antes de iniciar a realização do teste prático realize a leitura deste documento até o final.
   - [x] Leitura do documento

B. Utilizar linguagem de programação de acordo com o cargo escolhido; Executar em container um servidor Min.io para armazenamento de objetos S3 (https://min.io/);
   - [x] Genexus 
   - [x] MinIO para storage S3 [(link)](https://min.io/)

C. Executar em container um servidor de banco de dados PostgreSQL em sua última versão.
   - [x] PostgreSQL 17.4

## 1.2 Requisitos Gerais

A. Implementar mecanismo de autorização e autenticação, bem como não permitir acesso ao endpoint a partir de domínios diversos do qual estará hospedado o serviço;
   - [x] Implementar autenticação e autorização
   - [x] Restrição de acesso por domínio

B. A solução de autenticação deverá expirar a cada 5 minutos e oferecer a possibilidade de renovação do período;
- [x] Token com expiração de 5 minutos
- [x] Mecanismo de renovação de token

C. Implementar pelo menos os verbos post, put, get;
   - [ ] pessoa
   - [ ] endereco
   - [ ] cidade

D. Conter recursos de paginação em todas as consultas;
   - [ ] Paginação em todas consultas

E. Os dados produzidos deverão ser armazenados no servidor de banco de dados previamente criado em container;
   - [x] Persistência em PostgreSQL do container

F. Orquestrar a solução final utilizando Docker Compose de modo que inclua todos os contêineres utilizados.
   - [x] Orquestração via Docker Compose

## 1.2.1 Requisitos Específicos

Implementar uma API Rest para o diagrama de banco de dados acima tomando por base as seguintes orientações:

A. Criar um CRUD para Servidor Efetivo, Servidor Temporário, Unidade e Lotação. Deverá ser contemplado a inclusão e edição dos dados das tabelas relacionadas;
- [ ] Servidor Efetivo
- [ ] Servidor Temporário
- [ ] Unidade
- [ ] Lotação

B. Criar um endpoint que permita consultar os servidores efetivos lotados em determinada unidade parametrizando a consulta pelo atributo unid_id; Retornar os seguintes campos: Nome, idade, unidade de lotação e fotografia;
- [x] Endpoint para consulta por unid_id
- [x] Retorno com Nome, Idade, Unidade de lotação e  Fotografia

C. Criar um endpoint que permita consultar o endereço funcional (da unidade onde o servidor é lotado) a partir de uma parte do nome do servidor efetivo. 
- [ ] Consulta por parte do nome do servidor
- [ ] Retorna endereço da unidade onde o servidor é lotado

D. Realizar o upload de uma ou mais fotografias enviando-as para o Min.IO. A recuperação das imagens deverá ser através de links temporários gerados pela biblioteca do Min.IO com tempo de expiração de 5 minutos.
- [x] Upload para MinIO
- [x] Links temporários (5 min)


## 1.3 Instruções de Entrega
Instruções:
A. O projeto deverá estar disponível no Github. 
 - Crie um arquivo README.md contendo seus dados de inscrição bem como orientações de como executar e testar a solução apresentada.
      - [x] Dados de inscricao: 
         - [Dados de inscricao aqui]
 - [x] Decorrido o prazo de entrega, nenhum outro commit deverá ser enviado ao repositório do projeto.
 - [x] Adicione as dependências que considerar necessárias;
 - [x] Deverá estar disponível no repositório de versionamento todos os arquivos e scripts utilizados para a solução.
