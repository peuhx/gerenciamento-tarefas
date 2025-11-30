package service;

import model.Tarefa;
import repository.TarefaRepository;

import java.time.LocalDate;
import java.util.Scanner;

public class TarefaService {

    private final TarefaRepository repository = new TarefaRepository();

    public void cadastrar(Scanner scanner) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Data de conclusão (AAAA-MM-DD): ");
        LocalDate data = LocalDate.parse(scanner.nextLine());

        Tarefa tarefa = new Tarefa(titulo, descricao, data);
        repository.salvar(tarefa);

        System.out.println("Tarefa cadastrada com sucesso!");
    }

    public void listar() {
        repository.listar().forEach(System.out::println);
    }

    public void atualizar(Scanner scanner) {
        System.out.print("ID da tarefa: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Novo título: ");
        String titulo = scanner.nextLine();

        System.out.print("Nova descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Nova data de conclusão (AAAA-MM-DD): ");
        LocalDate data = LocalDate.parse(scanner.nextLine());

        repository.atualizar(id, titulo, descricao, data);
    }

    public void excluir(Scanner scanner) {
        System.out.print("ID da tarefa a excluir: ");
        int id = Integer.parseInt(scanner.nextLine());
        repository.excluir(id);
    }
}
