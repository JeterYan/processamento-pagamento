# API de Processamento de Pagamentos - Mercado de Seguros

API REST robusta desenvolvida em Java e Spring Boot para simular o ecossistema de processamento, validação e gerenciamento de meios de pagamento (Cartões, PIX e Boletos) integrado ao contexto de apólices de seguros. Projeto desenhado com foco em alta performance, arquitetura limpa e boas práticas de mercado.

---

## 🚀 Tecnologias Utilizadas

* **Java 21** (Versão LTS com recursos modernos de performance)
* **Spring Boot 3.x** (Framework ecossistema backend)
    * Spring Data JPA (Persistência e abstração de banco)
    * Spring Web (Construção de endpoints RESTful)
    * Jakarta Bean Validation (Validação de contratos na camada de modelo)
* **PostgreSQL** (Banco de dados relacional para transações financeiras)
* **Lombok** (Produtividade e redução de código boiler-plate)
* **Maven** (Gerenciador de dependências e build)

---

## 🏛️ Arquitetura e Bores Práticas

O projeto segue o padrão de arquitetura em camadas amplamente adotado no mercado corporativo, garantindo o desacoplamento e a testabilidade do código:

1. **Camada de Controle (`Controller`):** Responsável por expor os endpoints HTTP e receber as requisições.
2. **Camada de Serviço (`Service`):** Onde residem as regras de negócio do domínio de seguros e validações complexas.
3. **Camada de Persistência (`Repository`):** Abstração de acesso ao banco de dados com Spring Data JPA.
4. **Camada de Modelo (`Model/Entity`):** Mapeamento das tabelas e validação estrutural de dados via Bean Validation.

### Diferenciais Técnicos Aplicados:
* **Precisão Financeira:** Uso estrito de `BigDecimal` para manipulação de valores monetários, evitando problemas de arredondamento de ponto flutuante.
* **Injeção via Construtor:** Uso de injeção de dependência por construtor com atributos `final`, seguindo as diretrizes de código limpo do Spring para facilitar testes unitários.
* **Bean Validation:** Validação desacoplada de dados de entrada na borda da aplicação (ex: bloqueio de pagamentos zerados ou negativos através de `@DecimalMin`).

---

## 🛣️ Endpoints da API

Atualmente, a API expõe a rota base `/pagamentos` com as seguintes operações:

| Verbo  | Endpoint          | Descrição |
| :---   | :---              | :--- |
| `GET`  | `/pagamentos`     | Retorna todos os pagamentos cadastrados |
| `GET`  | `/pagamentos/{id}`| Busca um pagamento específico por ID |
| `POST` | `/pagamentos`     | Cadastra um novo pagamento (Validações ativas) |
| `DELETE`| `/pagamentos/{id}`| Remove fisicamente um pagamento do banco de dados |

---
*Projeto desenvolvido como portfólio estratégico focado em arquitetura corporativa e sistemas financeiros.*