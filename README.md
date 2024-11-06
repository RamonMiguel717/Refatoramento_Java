# Documentação do projeto em: https://github.com/RamonMiguel717/Refatoramento_Java/blob/main/Documenta%C3%A7%C3%A3o.md

Documento de Refatoração do Projeto de Gerenciamento de Funcionários e Projetos
# 1. Problemas Encontrados

## 1.1 Uso Excessivo de Métodos Duplicados ou Inúteis

Eu identifiquei métodos e funções que não estavam sendo utilizados ou que duplicavam funcionalidades já presentes em outras partes do código. Por exemplo, a classe GerenciadorDeFuncionarios não estava sendo chamada em nenhum local no código principal (Main.  ), o que indicava que sua presença era desnecessária.

> Ação: Removi GerenciadorDeFuncionarios para simplificar o código e evitar confusões futuras.
## 1.2 Métodos de Adição e Remoção de Funcionários

O método adicionarFuncionario na classe Funcionario apresentava uma lógica confusa para adicionar novos funcionários. Ele instanciava um novo objeto Funcionario e o adicionava a uma lista estática, o que tornava difícil separar a instância de Funcionario da lógica de gerência.

Antes da Refatoração:
 
```
public void adicionarFuncionario(String nome, String cargo, float salario) {
    Funcionario f = new Funcionario(nome, cargo, salario);
    funcionarios.add(f);
    System.out.println("Funcionário " + nome + " adicionado.");
}
```

Depois da Refatoração:

Transferi a lógica de adição e remoção de funcionários para a classe Projeto, que já centralizava a alocação dos funcionários em projetos. A função foi adaptada para permitir a adição de um funcionário a um projeto específico, aumentando a modularidade.
  
 
```
public void adicionarFuncionarioAoProjeto(Funcionario funcionario) {
    this.responsavel = funcionario;
    System.out.println("Funcionário " + funcionario.getNome() + " adicionado ao projeto.");
}
```

## 1.3 Problemas de Nomenclatura

Alguns métodos e variáveis apresentavam nomes confusos ou inconsistentes, como listarProjetos. O nome deste método não deixava claro que ele apenas exibia a lista, sem retornar dados. Padronizei nomes para melhorar a clareza e consistência.

  Antes da Refatoração:
  
 
```
public void listarProjetos() {
    // Lógica para listar os projetos
}
```

Depois da Refatoração

Renomeei o método para exibirListaDeProjetos, deixando claro que sua função é apenas exibir as informações.
  
 
```
public void exibirListaDeProjetos(List<Projeto> projetos) {
    // Lógica para exibir os projetos no console
}
```

## 1.4 Melhoria na Validação de Entrada do Usuário

Identifiquei uma falta de validação para as entradas do usuário, especialmente ao selecionar um projeto pela posição na lista. Caso o usuário inserisse um número inválido, o programa quebrava.

  Antes da Refatoração:
  
 
```
System.out.print("Digite o número do projeto: ");
int numeroProjeto = scanner.nextInt();
Projeto projeto = projetos.get(numeroProjeto - 1);
```

  Depois da Refatoração:

 Implementei uma verificação para garantir que o índice informado pelo usuário seja válido.

  
 
```
System.out.print("Digite o número do projeto: ");
int numeroProjeto = scanner.nextInt();

if (numeroProjeto > 0 && numeroProjeto <= projetos.size()) {
    Projeto projeto = projetos.get(numeroProjeto - 1);
    // Código para manipulação do projeto
} else {
    System.out.println("Número de projeto inválido.");
}
```

## 1.5 Simplificação do Menu

O menu de opções no Main estava com opções que poderiam ser organizadas ou simplificadas. Por exemplo, a função listarProjetos era repetida em diversas opções.

  Antes da Refatoração: 
  
 
```
System.out.println("1. Criar novo projeto");
System.out.println("2. Adicionar funcionário a um projeto");
System.out.println("3. Remover funcionário de um projeto");
System.out.println("4. Listar projetos");
System.out.println("5. Excluir projeto");
System.out.println("6. Sair");
```

  Depois da Refatoração:

Organizei o menu e removi opções redundantes, tornando-o mais conciso e de fácil navegação.
  
 
```
System.out.println("1. Criar novo projeto");
System.out.println("2. Gerenciar funcionários em projetos");
System.out.println("3. Listar e Excluir projetos");
System.out.println("4. Sair");
```
