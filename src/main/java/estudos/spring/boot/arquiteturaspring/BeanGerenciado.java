package estudos.spring.boot.arquiteturaspring;

import estudos.spring.boot.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanGerenciado {

    // Uma maneira de injetar dependencias
    // Forma mais simples e mais rigida.
    @Autowired
    private TodoValidator todoValidator;

    // Outra maneira de injetar dependencias
    // @Autowired é opcional
    // Forma mais correta de executar a injeção de dependencias
    public BeanGerenciado(TodoValidator todoValidator) {
        this.todoValidator = todoValidator;
    }

    // Mais uma maneira de injetar dependencias
    // @Autowired é obrigatórios
    // Forma mais maleavel
    public void setValidator(TodoValidator todoValidator) {
        this.todoValidator = todoValidator;
    }
}
