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
   - [x] Genexus (Versao utilizada: Genexus 18 | Update 10 | Propriedada Java Framework: Spring boot | Java 21 Microsoft SQL Server 2022 (RTM) - 16.0.1000.6 (X64)  Edição: Express Edition (64-bit))
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
      - Servidor Efetivo é identificado pelo pes_id e se_matricula, esses atributos sao utilziados nas acoes de buscar, deletar e autalizar
      como parametros da url 
      - Criar um servidor efetivo com suas tabelas relacionadas: [`ServidorEfetivoCreate.curl`](./requisicoes/ServidorEfetivoCreate.curl) .
      - Atualizar um servidor efetivo com suas tabelas relacionadas: [`ServidorEfetivoUpdate.curl`](./requisicoes/ServidorEfetivoUpdate.curl) .
      - Deletar um servidor efetivo com suas tabelas relacionadas: [`ServidorEfetivoDelete.curl`](./requisicoes/ServidorEfetivoDelete.curl) .
      - Buscar um servidor efetivo com suas tabelas relacionadas: [`ServidorEfetivoGet.curl`](./requisicoes/ServidorEfetivoGet.curl) .
- [x] Servidor Temporário
      - Servidor Temporario é identificado pelo pes_id, st_data_admissao e st_data_demissao , esses atributos sao utilziados nas acoes de buscar, deletar e autalizar  como parametros da url 
      - Criar um servidor temporario com suas tabelas relacionadas: [`ServidorTemporarioCreate.curl`](./requisicoes/ServidorTemporarioCreate.curl) .
      - Atualizar um servidor temporario com suas tabelas relacionadas: [`ServidorTemporarioUpdate.curl`](./requisicoes/ServidorTemporarioUpdate.curl) .
      - Deletar um servidor temporario com suas tabelas relacionadas: [`ServidorTemporarioDelete.curl`](./requisicoes/ServidorTemporarioDelete.curl) .
      - Buscar um servidor temporario com suas tabelas relacionadas: [`ServidorTemporarioGet.curl`](./requisicoes/ServidorTemporarioGet.curl) .
- [x] Unidade
      - A unidade é identificada pela unid_id esse atributo é utilziados nas acoes de buscar, deletar e autalizar  como parametro da url 
      - Criar uma unidade com suas tabelas relacionadas: [`UnidadeCreate.curl`](./requisicoes/UnidadeCreate.curl) .
      - Atualizar uma unidade com suas tabelas relacionadas: [`UnidadeUpdate.curl`](./requisicoes/UnidadeUpdate.curl) .
      - Deletar uma unidade com suas tabelas relacionadas: [`UnidadeDelete.curl`](./requisicoes/UnidadeDelete.curl) .
      - Buscar uma unidade com suas tabelas relacionadas: [`UnidadeGet.curl`](./requisicoes/UnidadeGet.curl) .
- [x] Lotação
      - A lotacao é identificada pela lot_id esse atributo é utilziados nas acoes de buscar, deletar e autalizar  como parametro da url 
      - Criar uma lotacao com suas tabelas relacionadas: [`lotacaoCreate.curl`](./requisicoes/lotacaoCreate.curl) .
      - Atualizar uma lotacao com suas tabelas relacionadas: [`lotacaoUpdate.curl`](./requisicoes/lotacaoUpdate.curl) .
      - Deletar uma lotacao com suas tabelas relacionadas: [`lotacaoDelete.curl`](./requisicoes/lotacaoDelete.curl) .
      - Buscar uma lotacao com suas tabelas relacionadas: [`lotacaoGet.curl`](./requisicoes/lotacaoGet.curl) .

### B. Criar um endpoint que permita consultar os servidores efetivos lotados em determinada unidade parametrizando a consulta pelo atributo unid_id; Retornar os seguintes campos: Nome, idade, unidade de lotação e fotografia;
- [x] Recebe na url a unid_id, pagina atual e o numero de registros por pagina: [`consultaUnidadeEfetivo.curl`](./requisicoes/consultaUnidadeEfetivo.curl) .

### C. Criar um endpoint que permita consultar o endereço funcional (da unidade onde o servidor é lotado) a partir de uma parte do nome do servidor efetivo. 
- [x] Recebe na url parte do nome, pagina atual e o numero de registros por pagina: [`consultaLotacaoEfetivo.curl`](./requisicoes/consultaLotacaoEfetivo.curl) .

### D. Realizar o upload de uma ou mais fotografias enviando-as para o Min.IO. A recuperação das imagens deverá ser através de links temporários gerados pela biblioteca do Min.IO com tempo de expiração de 5 minutos.
- [x] Para enviar arquivos para um armazenamento de objetos, a ferramenta Genexus utiliza-se de uma objeto Storage Provider, essa funcao cria um fluxo de duas etapas. A primeira etapa é o envio do arquivo(no caso a foto) em sua forma binaria, sendo possivel enviar somente um arquivo por vez, esta etapa é feita pela requisicao [`uploadMinioGx.curl`](./requisicoes/uploadMinioGx.curl) , esta primeira requiscao ira retornar um identifcador do objeto que foi armazenado no armazenamento de objetos. Com o id que foi retornado deve-se fazer uma segunda requisicao, que vincula o id do objeto no armazenamento externo com um cadastro (no caso foto da pessoa), o vinculo é feito pela requisicao [`uploadMinioFoto.curl`](./requisicoes/uploadMinioFoto.curl), apos a vinculacao o objeto replicado de uma pasta temporaria para uma pasta permanente. 


## 1.3 Instruções de Entrega
### A. O projeto deverá estar disponível no Github. 
 - Crie um arquivo README.md contendo seus dados de inscrição bem como orientações de como executar e testar a solução apresentada.
      - Para iniciar o projeto: docker compose up
      - Para testar utilizar os arquivos da pasta requisicoes, cada arquivo esta ligado aos requisitos solicitados no edital. Cada um dos arquivos foi referenciado neste README.md, indicando qual item do edital esta atendendo. Para executar a requisicao é necessario ter a ferramenta [(curl)](https://curl.se/) curl  instalada, na maquina onde sera executado o comando docker compose up.
      - [x] Dados de inscricao: NUMERO INSCRICAO 10230
 - [x] Decorrido o prazo de entrega, nenhum outro commit deverá ser enviado ao repositório do projeto.
 - [x] Adicione as dependências que considerar necessárias;
 - [x] Deverá estar disponível no repositório de versionamento todos os arquivos e scripts utilizados para a solução.
