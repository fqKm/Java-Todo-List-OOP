package entity;

public class TodoList {
    private String list;

    public TodoList() {
    }

    public TodoList(String list){
        this.list=list;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }
}
