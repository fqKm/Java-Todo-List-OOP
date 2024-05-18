package test;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
        showListTest();
    }

    public static void showListTest(){
        TodoListRepository repository = new TodoListRepositoryImpl();
        TodoListService service = new TodoListServiceImpl(repository);
        TodoListView view = new TodoListView(service);

        service.addTodo("Eat");
        service.addTodo("Drink");
        service.addTodo("Sleep");
        service.addTodo("Learning");

        view.viewShowTodoList();
    }

    public static void deleteListTest(){
        TodoListRepository repository = new TodoListRepositoryImpl();
        TodoListService service = new TodoListServiceImpl(repository);
        TodoListView view = new TodoListView(service);

        service.addTodo("Eat");
        service.addTodo("Drink");
        service.addTodo("Sleep");
        service.addTodo("Learning");

        view.viewShowTodoList();
    }
}
