package estudos.spring.boot.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private final TodoService service;

    public TodoValidator(TodoService service) {
        this.service = service;
    }

    public void validar(TodoEntity todo) {
        if(existeTodoComDescricao(todo.getDescricao())) {
            throw new IllegalArgumentException("Já existe um TODO com essa descrição.");
        }
    }

    public boolean existeTodoComDescricao(String descricao) {
        return service.existePorDescricao(descricao);
    }
}
