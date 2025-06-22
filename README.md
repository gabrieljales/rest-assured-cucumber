# Projeto de Testes Automatizados de API com Rest Assured + Cucumber

Este projeto é uma suíte de testes automatizados para a API JSONPlaceholder, utilizando as ferramentas **Java**, **Gradle**, **Rest Assured** e **Cucumber**.

---

## 🔧 Tecnologias Utilizadas
- Java 17+
- Gradle
- Rest Assured
- Cucumber
- JUnit Platform
- Lombok
- Hamcrest (assertions)
---

## 📁 Estrutura do Projeto
```
src/
├── test/
│ ├── java/
│ │ └── api/
│ │ └── jsonplaceholder/
│ │ ├── features/ ⬅️ Step Definitions do Cucumber
│ │ ├── domain/ ⬅️ Camadas de apoio ao teste
│ │ │ ├── models/ ⬅️ Representação de entidades de dados da aplicação
│ │ │ ├── steps/ ⬅️ Métodos utilitários de execução 
│ │ │ ├── utils/ ⬅️ Utilitários
│ │ │ │ └── factories/ ⬅️ Encapsula a lógica de criação de objetos
│ │ │ └── shared/ ⬅️ Configurações globais (hooks, Constantes, etc.)
│ └── resources/
│ └── features/ ⬅️ Arquivos .feature do Cucumber
│ └── api/
│ └── jsonplaceholder/
│ └── posts/
│ └── create_post.feature
```

---

## 🚀 Como Executar os Testes

> É necessário ter o Java 17+ e o Gradle instalados na máquina.

### 1. Clonar o repositório

```bash
git clone <url-do-repo>
cd <pasta-do-projeto>
```
### 2. Executar os testes com Gradle
```bash
./gradlew test
```

Isso executará os testes Cucumber e gerará um relatório em HTML na pasta build/.

### 3. Ver o relatório de execução

Após a execução, acesse o relatório em:

build/cucumber-reports.html

## 📚 Convenções e Organização
- Arquivo .feature → descreve o comportamento em Gherkin.
- Step Definitions → conecta os passos escritos no .feature com código Java.
- Steps (domain/steps) → contém a lógica reutilizável das chamadas de API.
- Factories (utils/factories) → fornece objetos prontos para uso nos testes.
- Models → representam os dados da API (ex: Post).
- Hooks (shared) → configurações globais como baseURI.