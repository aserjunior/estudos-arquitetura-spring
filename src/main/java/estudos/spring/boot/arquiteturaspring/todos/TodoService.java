package estudos.spring.boot.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository todoRepository) {
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity todoNovo) {
        return repository.save(todoNovo);
    }

    public void atualizarStatus(TodoEntity todo) {
        repository.save(todo);
    }

    public TodoEntity buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
