package view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import util.*;

public class TodoListView {
    private TodoListService listService;
    public TodoListView(TodoListService listService) {
        this.listService = listService;
    }

    public void viewShowTodoList(){
        listService.showTodoList();
        var input = InputUtil.input(MenuChoice.showChoice());
        switch (input){
            case "A", "a" : viewAddTodoList();
            case "D", "d" : viewDeleteTodoList();
            case "U", "u" : viewUpdateTodoList();
            case "X", "x" : System.exit(0);
        }
    }

    public void viewAddTodoList(){
        System.out.println("Your List : ");
        listService.showTodoList();
        var list = InputUtil.input("Add List");
        listService.addTodo(list);
        listService.showTodoList();
        var input = InputUtil.input(MenuChoice.addChoice());
        switch (input){
            case "B", "b" : viewShowTodoList();
            case "A", "a" : viewAddTodoList();
        }
    }

    public void viewDeleteTodoList(){
        listService.showTodoList();
        var number = InputUtil.inputInt(Params.number("Delete"));
        listService.deleteTodo(number);
        listService.showTodoList();
        var input = InputUtil.input(MenuChoice.deleteChoice());
        switch (input){
            case "B", "b" : viewShowTodoList();
            case "D", "d" : viewDeleteTodoList();
            default: viewDeleteTodoList();
        }

    }

    public void viewUpdateTodoList(){
        listService.showTodoList();
        var number = InputUtil.inputInt(Params.number(" Update"));
        var list = InputUtil.input(Params.list());
        listService.updateTodo(number, list);
        listService.showTodoList();
        var input = InputUtil.input(MenuChoice.updateChoice());
        switch (input){
            case "B", "b" : viewShowTodoList();
            case "U", "u" : viewUpdateTodoList();
            default: viewUpdateTodoList();
        }
    }
}
