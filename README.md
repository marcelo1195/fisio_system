Para atender às funcionalidades específicas que você mencionou, precisaremos implementar componentes que permitam a interação entre a secretaria, os profissionais de saúde e o banco de dados. Aqui estão as etapas e componentes detalhados que podemos desenvolver:

### 1. **Modelos de Dados**
- **PreCadastro**: Contém os dados iniciais do paciente coletados pela secretaria.
- **Paciente**: Tabela principal para armazenar todas as informações após a avaliação do profissional.

### 2. **Funcionalidades**
- **Cadastro e Pré-Cadastro de Pacientes**
    - A secretaria cria e gerencia fichas de pré-cadastro.
    - Os profissionais acessam essas fichas para avaliação e, em seguida, confirmam ou ajustam as informações antes de transferi-las para a tabela principal de pacientes.

- **Atualizações de Sessão e Tratamento**
    - Após cada sessão, a secretaria deve registrar a presença do paciente e atualizar a ficha com a data da última sessão e incrementar o número da sessão atual.
    - Os profissionais de saúde atualizam os detalhes do tratamento após cada sessão e podem alterar informações críticas como o valor da sessão e da consulta.

- **Gestão do Histórico Médico**
    - Histórico pregresso ao primeiro tratamento.
    - Histórico do tratamento atual.
    - Histórico total que engloba todos os tratamentos e o histórico pregresso.

### 3. **Controle de Acesso**
- **Perfis de Usuário**
    - Perfis distintos para secretarias e profissionais de saúde, cada um com diferentes níveis de acesso e permissões dentro do sistema.
    - Utilizar Spring Security para implementar essas regras de acesso.

### 4. **Interface de Usuário**
- Desenvolver interfaces claras e distintas para a secretaria e profissionais de saúde, facilitando o uso diário e garantindo que apenas informações pertinentes e autorizadas sejam acessíveis por cada perfil.

### 5. **Backend e API**
- **Endpoints da API**:
    - `POST /preCadastro` para criar pré-cadastros.
    - `GET /preCadastro/{id}` para visualizar um pré-cadastro específico.
    - `POST /pacientes` para criar uma nova ficha de paciente.
    - `PUT /pacientes/{id}` para atualizar a ficha do paciente.
    - `POST /pacientes/{id}/sessoes` para registrar uma nova sessão.
    - `PUT /pacientes/{id}/tratamento` para atualizar detalhes do tratamento.

### 6. **Persistência de Dados**
- Definir esquemas de banco de dados em MariaDB que suportem todas as operações necessárias, incluindo relações entre tabelas para gerenciar históricos e sessões.

### 7. **Documentação e Testes**
- Documentar todos os endpoints da API usando Swagger ou similar.
- Implementar testes automatizados para garantir a funcionalidade e segurança da aplicação.
