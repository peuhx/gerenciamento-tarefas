package app;

import service.TarefaService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TarefaService service = new TarefaService();

        int opcao;

        do {
            System.out.println("\n===== GERENCIAMENTO DE TAREFAS =====");
            System.out.println("1. Cadastrar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Atualizar tarefa");
            System.out.println("4. Excluir tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> service.cadastrar(scanner);
                case 2 -> service.listar();
                case 3 -> service.atualizar(scanner);
                case 4 -> service.excluir(scanner);
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
