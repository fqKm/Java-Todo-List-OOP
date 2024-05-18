package test;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        testUpdateTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();

    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodo("Learn OOP with Java");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        todoListService.addTodo("Learn OOP with Java");
        todoListService.addTodo("Learn OOP with C++");
        todoListService.addTodo("Learn OOP with C#");
        todoListService.addTodo("Learn OOP with JavaScript");
        todoListService.deleteTodo(5);
        todoListService.showTodoList();
    }

    public static void testUpdateTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        todoListService.addTodo("Learn OOP with Java");
        todoListService.addTodo("Learn OOP with C++");
        todoListService.addTodo("Learn OOP with C#");
        todoListService.addTodo("Learn OOP with JavaScript");
        todoListService.updateTodo(2,null);
        todoListService.showTodoList();
    }
}
