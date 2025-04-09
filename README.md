# Teste Prático - API REST com Autenticação, PostgreSQL e MinIO

## 👤 Dados do Candidato

**Nome completo:** Claudio Toyoshi Onohara

**Email:** claudioonohara@gmail.com

**Cargo:** DESENVOLVEDOR GENEXUS

 1.0 - Projeto Prático: Implementação Back-End

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
   - [x] Genexus (Versao utilizada: Genexus 18 | Update 10 | Propriedada Java Framework: Spring boot | Java 21)
   - [x] MinIO para storage S3 [(link)](https://min.io/)

C. Executar em container um servidor de banco de dados PostgreSQL em sua última versão.
   - [x] PostgreSQL 17.4 (Ultima versao em: 09/04/2025 )

## 1.2 Requisitos Gerais

A. Implementar mecanismo de autorização e autenticação, bem como não permitir acesso ao endpoint a partir de domínios diversos do qual estará hospedado o serviço;
   - [x] Implementar autenticação e autorização
         - A autenticacao realizada de forma simplificada, a aplicacao possui dois usuarios definidos de forma fixa dentro da aplicacao, que se autenticam informando senhas:
            - Usuario: admin | Senha: 123 [`(Clique para ver: Requisicao Admin)`](./requisicoes/loginAdmin.curl)
            - Usuario: guest | Senha: 321 [`(Clique para ver: Requisicao Guest)`](./requisicoes/loginGuest.curl)
         - Quando se autenticam recebem um token e um refreshToken, os tokens carregam o perfil de cada usuario,
         sendo o perfil do admin autorizado a executar acoes CREATE,UPDATE,GET e DELETE e 
         o perfil do guest autorizado apenas a acao GET. O refreshToken gera um novo token de acordo com o perfil que carrega. 
    [x] Restrição de acesso por domínio
         - Foi realizado controle de acesso por dominio, utilizando [(CORS)](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Guides/CORS). A variável de ambiente "GX_CORS_ALLOW_ORIGIN" , da aplicacao qual dominio deve ser permitido. O dominio é validado com informacao de "Origin" do header da requisicao. Caso uma requesicao seja feita com uma "Origin" nao permitida será retornado http status code 403.

B. A solução de autenticação deverá expirar a cada 5 minutos e oferecer a possibilidade de renovação do período;
- [x] Token com expiração de 5 minutos
      - Atraves do metodo "AddCustomTimeValidationClaim" da biblioteca Jwt do Genexus, o token fica valido por 5 minutos a partir do instante que é criado. Todos endpoints (com excecao do /auth e /refresh), validam o token e seu tempo de expiracao, caso tenha expirado a mensagem será The "Token has expired" com http status 401. 

- [x] Mecanismo de renovação de token
      - Ao realizar o login, sao retornados 2 tokens, um token para fazer requisicoes as diversas rotas que checam autorizacao(possui validade
      de 5 minutos) , e refreshToken (possui validade de 2 horas) que pode ser usado somente para solicitar novo token. [`(Clique para ver: Requisicao Refresh Token)`](./requisicoes/refreshToken.curl)

C. Implementar pelo menos os verbos post, put, get;
   - [x] Implementação de CRUD para Servidor Efetivo, Servidor Temporário, Unidade e Lotação
      - Foram criados endpoints para inclusão, edição, exclusão e consulta dos dados das tabelas relacionadas, conforme especificado no item [1.2.1 A](#a-criar-um-crud-para-servidor-efetivo-servidor-temporário-unidade-e-lotação-deverá-ser-contemplado-a-inclusão-e-edição-dos-dados-das-tabelas-relacionadas).

D. Conter recursos de paginação em todas as consultas;
   - [x] Paginação em todas consultas  
      - Implementada paginação no endpoint descrito no item [1.2.1 B](#b-criar-um-endpoint-que-permita-consultar-os-servidores-efetivos-lotados-em-determinada-unidade-parametrizando-a-consulta-pelo-atributo-unid_id-retornar-os-seguintes-campos-nome-idade-unidade-de-lotação-e-fotografia), permitindo limitar e paginar os resultados retornados.

E. Os dados produzidos deverão ser armazenados no servidor de banco de dados previamente criado em container;
   - [x] Persistência em PostgreSQL do container

F. Orquestrar a solução final utilizando Docker Compose de modo que inclua todos os contêineres utilizados.
   - [x] Orquestração via Docker Compose

## 1.2.1 Requisitos Específicos

Implementar uma API Rest para o diagrama de banco de dados acima tomando por base as seguintes orientações:

### A. Criar um CRUD para Servidor Efetivo, Servidor Temporário, Unidade e Lotação. Deverá ser contemplado a inclusão e edição dos dados das tabelas relacionadas;
- [x] Servidor Efetivo
- [x] Servidor Temporário
- [x] Unidade
- [x] Lotação

### B. Criar um endpoint que permita consultar os servidores efetivos lotados em determinada unidade parametrizando a consulta pelo atributo unid_id; Retornar os seguintes campos: Nome, idade, unidade de lotação e fotografia;
- [x] Endpoint para consulta por unid_id
- [x] Retorno com Nome, Idade, Unidade de lotação e  Fotografia

### C. Criar um endpoint que permita consultar o endereço funcional (da unidade onde o servidor é lotado) a partir de uma parte do nome do servidor efetivo. 
- [x] Consulta por parte do nome do servidor
- [x] Retorna endereço da unidade onde o servidor é lotado

### D. Realizar o upload de uma ou mais fotografias enviando-as para o Min.IO. A recuperação das imagens deverá ser através de links temporários gerados pela biblioteca do Min.IO com tempo de expiração de 5 minutos.
- [x] Upload para MinIO
- [x] Links temporários (5 min)


## 1.3 Instruções de Entrega
Instruções:
### A. O projeto deverá estar disponível no Github. 
 - Crie um arquivo README.md contendo seus dados de inscrição bem como orientações de como executar e testar a solução apresentada.
      - [x] Dados de inscricao: 
         - [Dados de inscricao aqui]
 - [x] Decorrido o prazo de entrega, nenhum outro commit deverá ser enviado ao repositório do projeto.
 - [x] Adicione as dependências que considerar necessárias;
 - [x] Deverá estar disponível no repositório de versionamento todos os arquivos e scripts utilizados para a solução.
