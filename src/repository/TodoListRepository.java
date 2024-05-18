package repository;

import entity.TodoList;

public interface TodoListRepository {

    TodoList[] getAll();

    void add(TodoList list);

    String remove(Integer number);

    String update(Integer number, TodoList list);
}
