package service;

import entity.TodoList;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {

    private TodoListRepository repository;
    public TodoListServiceImpl(TodoListRepository repository) {
        this.repository = repository;
    }
    @Override
    public void showTodoList() {
        System.out.println("Todo List");
        TodoList[] model = repository.getAll();
        for (int i = 0; i < model.length; i++) {
            var list = model[i];
            var no = i+1;

            if (list != null ){
                System.out.println(no + ". " + list.getList());
            }
        }

    }

    @Override
    public void addTodo(String todo) {
        TodoList todoList = new TodoList(todo);
        repository.add(todoList);
    }

    @Override
    public void deleteTodo(Integer number) {
        var result = repository.remove(number);
        System.out.println(result);
    }

    @Override
    public void updateTodo(Integer number, String todo) {
        var result = repository.update(number, new TodoList(todo));
        System.out.println(result);
    }
}
