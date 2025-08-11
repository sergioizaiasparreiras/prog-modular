<p align="center">
  <img src="img/java.jpg" alt="Java Programming" width="400">
</p>

# **Exercícios de Revisão - Programação Modular (Java)**

<p align="center">
  <img src="https://img.shields.io/badge/Linguagem-Java-blue?style=for-the-badge&logo=java" alt="Linguagem Java">
  <img src="https://img.shields.io/badge/Status-Em%20Andamento-orange?style=for-the-badge" alt="Status Em Andamento">
  <img src="https://img.shields.io/badge/Licença-MIT-lightgrey?style=for-the-badge" alt="Licença MIT">
</p>

## 📖 Sobre

Este repositório contém as soluções para a lista de **"Exercício de Revisão e Nivelamento"** da disciplina de **Programação Modular**. A disciplina é parte do curso de **Bacharelado em Engenharia de Software da Pontifícia Universidade Católica de Minas Gerais (PUC Minas) - Campus Lourdes** e foi ministrada pelo **Prof. João Caram**.

O objetivo desta atividade é revisar conceitos de Algoritmos e Estruturas de Dados (AED), servindo como um autodiagnóstico na criação de algoritmos básicos. As soluções aqui presentes foram implementadas em **Java**.

## 📝 Exercícios Resolvidos

Aqui está a lista de problemas abordados neste repositório:

* **Exercício 1: Menu de Ações**
    * Um sistema em menu que permite: dividir dois números, ler e encontrar o maior entre três números, armazenar uma quantidade N de números, somar os números guardados e, por fim, contar quantos deles são pares e ímpares.

* **Exercício 2: Retângulo na Tela**
    * Um programa que lê do usuário valores de largura, altura e deslocamento para imprimir um retângulo na tela.

* **Exercício 3: Cálculo de Nota Final**
    * Um programa que calcula a nota final de um aluno com base em quatro notas de exercício (peso de 20%), duas notas de prova (peso de 60%) e um trabalho prático de 20 pontos, aplicando os devidos pesos.

* **Exercício 4: Criptografia de String**
    * Um programa que embaralha ("criptografa") uma string reescrevendo-a em blocos de 5 caracteres e lendo o resultado por colunas.

* **Exercício 5: Descriptografia de String**
    * Expansão do exercício anterior, adicionando a funcionalidade de reverter o processo de criptografia para obter a mensagem original.

* **Exercício 6: Validação de Data**
    * Um método que verifica se uma data no formato `DD/MM/AAAA` é válida, informando o erro específico (dia, mês ou ano) caso não seja.

* **Exercício 7: Leitura de Arquivos**
    * Refatoração dos exercícios 4, 5 e 6 para ler os dados de entrada a partir de um arquivo-texto, onde a primeira linha indica a quantidade de execuções.

## 📂 Estrutura do Repositório

O repositório está organizado em múltiplos projetos Java independentes, um para cada exercício, facilitando a navegação e execução individual de cada solução.

```
prog-modular/
├── codigos/
│   ├── exercicio-01/
│   │   ├── src/
│   │   │   └── App.java
│   │   └── README.md
│   ├── exercicio-02/
│   │   ├── src/
│   │   │   └── App.java
│   │   └── README.md
│   ├── exercicio-03/
│   │   ├── src/
│   │   │   └── App.java
│   │   └── README.md
│   ├── exercicio-04/
│   │   ├── src/
│   │   │   └── App.java
│   │   └── README.md
│   ├── exercicio-05/
│   │   ├── src/
│   │   │   └── App.java
│   │   └── README.md
│   ├── exercicio-06/
│   │   ├── src/
│   │   │   └── App.java
│   │   └── README.md
│   └── exercicio-07/
│       ├── src/
│       │   └── App.java
│       └── README.md
├── docs/
│   └── PM_Exerc_Rev_Diagnostico-2025-2.pdf
├── img/
│   └── java.jpg
├── .gitignore
└── README.md
```


## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- Git

### Execução
1. **Clone o repositório:**
   ```bash
   git clone https://github.com/sergioizaiasparreiras/prog-modular.git
   ```

2. **Navegue até um exercício:**
   ```bash
   cd prog-modular/codigos/exercicio-01
   ```

3. **Compile e execute:**
   ```bash
   javac src/App.java
   java -cp src App
   ```

## 📄 Licença

Este projeto está sob a licença MIT.
