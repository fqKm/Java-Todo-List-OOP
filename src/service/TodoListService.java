package service;

public interface TodoListService {

    void showTodoList();

    void addTodo(String todo);

    void deleteTodo(Integer number);

    void updateTodo(Integer number, String todo);
}
