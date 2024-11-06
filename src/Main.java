import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Projeto> projetos = new ArrayList<>();
        int opcao;
        do {
            System.out.println("\nGERENCIAMENTO DE FUNCIONARIOS E PROJETOS:\n");
            System.out.println("1. Criar novo projeto");
            System.out.println("2. Adicionar funcionário a um projeto");
            System.out.println("3. Remover funcionário de um projeto");
            System.out.println("4. Listar projetos");
            System.out.println("5. Excluir projeto");
            System.out.println("6. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> criarProjeto(scanner, projetos);
                case 2 -> adicionarFuncionarioAoProjeto(scanner, projetos);
                case 3 -> removerFuncionarioDeProjeto(scanner, projetos);
                case 4 -> listarProjetos(projetos);
                case 5 -> excluirProjeto(scanner, projetos);
                case 6 -> System.out.println("Saindo do programa...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
        scanner.close();
    }

    // Métodos separados para cada ação
    private static void criarProjeto(Scanner scanner, List<Projeto> projetos) {
        System.out.print("Digite o nome do projeto: ");
        String nomeProjeto = scanner.nextLine();
        System.out.print("Digite o prazo do projeto (AAAA-MM-DD): ");
        LocalDate prazoProjeto = LocalDate.parse(scanner.nextLine());
        
        Projeto novoProjeto = new Projeto(nomeProjeto, prazoProjeto);
        projetos.add(novoProjeto);
        System.out.println("Projeto criado com sucesso!");
    }

    private static void adicionarFuncionarioAoProjeto(Scanner scanner, List<Projeto> projetos) {
        // Implementação da função
    }

    private static void removerFuncionarioDeProjeto(Scanner scanner, List<Projeto> projetos) {
        // Implementação da função
    }

    private static void listarProjetos(List<Projeto> projetos) {
        projetos.forEach(projeto -> System.out.println(projeto.getNome() + " - Prazo: " + projeto.getPrazo()));
    }

    private static void excluirProjeto(Scanner scanner, List<Projeto> projetos) {
        // Implementação da função
    }
}
