package repository;

import model.Tarefa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TarefaRepository {

    private final List<Tarefa> tarefas = new ArrayList<>();

    public void salvar(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public List<Tarefa> listar() {
        return tarefas;
    }

    public void atualizar(int id, String novoTitulo, String novaDescricao, LocalDate novaData) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                t.setTitulo(novoTitulo);
                t.setDescricao(novaDescricao);
                t.setDataConclusao(novaData);
                System.out.println("Tarefa atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada!");
    }

    public void excluir(int id) {
        Tarefa removida = null;

        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                removida = t;
                break;
            }
        }

        if (removida != null) {
            tarefas.remove(removida);
            System.out.println("Tarefa excluída com sucesso!");
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }
}

