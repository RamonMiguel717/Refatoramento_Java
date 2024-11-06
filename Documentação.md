# Documentação Técnica do Projeto de Gerenciamento de Funcionários e Projetos

## Sumário
1. [Introdução](#introdução)
2. [Estrutura do Projeto](#estrutura-do-projeto)
3. [Descrição das Classes](#descrição-das-classes)
   - [Classe Funcionario](#classe-funcionario)
   - [Classe Projeto](#classe-projeto)
4. [Fluxo do Programa](#fluxo-do-programa)
5. [Estrutura do Menu Principal](#estrutura-do-menu-principal)
6. [Principais Modificações na Refatoração](#principais-modificações-na-refatoração)
7. [Exemplo de Uso](#exemplo-de-uso)

---

## Introdução
Este projeto foi desenvolvido para gerenciar funcionários e projetos de uma organização, permitindo criar, listar, adicionar e remover funcionários de projetos e gerenciar informações básicas de cada funcionário e projeto.

O objetivo da refatoração foi simplificar e modularizar o código, melhorar a clareza e o uso de recursos do sistema, e remover métodos e classes redundantes.

---

## Estrutura do Projeto
O projeto está estruturado em duas principais classes: `Funcionario` e `Projeto`. Cada classe possui métodos para a criação, modificação e exibição de dados.

### Arquivos Principais
1. **Funcionario.java**: Define a classe `Funcionario`.
2. **Projeto.java**: Define a classe `Projeto`.
3. **Main.java**: Contém o fluxo principal do programa e o menu de interação com o usuário.

---

## Descrição das Classes

### Classe Funcionario
A classe `Funcionario` é responsável por armazenar e manipular as informações dos funcionários. Cada objeto `Funcionario` possui as seguintes propriedades e métodos:

#### Propriedades
- `String nome`: Armazena o nome do funcionário.
- `String cargo`: Armazena o cargo do funcionário.
- `float salario`: Armazena o salário do funcionário.

#### Métodos
- `Funcionario(String nome, String cargo, float salario)`: Construtor que inicializa o funcionário com nome, cargo e salário.
- `getNome()`: Retorna o nome do funcionário.
- `getCargo()`: Retorna o cargo do funcionário.
- `getSalario()`: Retorna o salário do funcionário.
- `setNome(String nome)`: Define o nome do funcionário.
- `setCargo(String cargo)`: Define o cargo do funcionário.
- `setSalario(float salario)`: Define o salário do funcionário.

### Classe Projeto
A classe `Projeto` representa um projeto e armazena dados sobre o responsável pelo projeto (um `Funcionario`) e o título do projeto.

#### Propriedades
- `String titulo`: Armazena o título do projeto.
- `Funcionario responsavel`: Armazena o funcionário responsável pelo projeto.

#### Métodos
- `Projeto(String titulo)`: Construtor que inicializa o projeto com um título.
- `getTitulo()`: Retorna o título do projeto.
- `getResponsavel()`: Retorna o funcionário responsável pelo projeto.
- `setResponsavel(Funcionario responsavel)`: Define o responsável pelo projeto.
- `adicionarFuncionarioAoProjeto(Funcionario funcionario)`: Adiciona um funcionário como responsável pelo projeto.

---

## Fluxo do Programa
O programa inicia com a execução do `Main.java`, que exibe um menu principal com as seguintes opções:

1. Criar novo projeto
2. Gerenciar funcionários em projetos
3. Listar e excluir projetos
4. Sair

O usuário escolhe as opções e o programa executa os métodos correspondentes para cada funcionalidade.

---

## Estrutura do Menu Principal

### Opções do Menu
1. **Criar Novo Projeto**: Solicita ao usuário o título do projeto e cria uma instância da classe `Projeto`.
2. **Gerenciar Funcionários em Projetos**: Permite adicionar ou remover funcionários de projetos existentes.
3. **Listar e Excluir Projetos**: Exibe todos os projetos existentes e permite excluir algum projeto específico.
4. **Sair**: Encerra a execução do programa.

### Exemplo de Código para o Menu
```java
while (true) {
    System.out.println("1. Criar novo projeto");
    System.out.println("2. Gerenciar funcionários em projetos");
    System.out.println("3. Listar e Excluir projetos");
    System.out.println("4. Sair");
    
    int opcao = scanner.nextInt();
    scanner.nextLine(); // Consumir nova linha

    switch(opcao) {
        case 1:
            criarNovoProjeto();
            break;
        case 2:
            gerenciarFuncionariosEmProjetos();
            break;
        case 3:
            listarEExcluirProjetos();
            break;
        case 4:
            System.exit(0);
            break;
        default:
            System.out.println("Opção inválida. Tente novamente.");
    }
}
