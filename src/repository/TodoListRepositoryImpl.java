package repository;

import entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {
    private TodoList[] datas = new TodoList[10];
    @Override
    public TodoList[] getAll() {
        return datas;
    }

    public boolean isFull(){
        boolean full = true;
        for (int i = 0; i < datas.length; i++) {
            if (datas[i] == null) {
                full = false;
            }
        }
        return full;
    }

    public void resize(){
        if(isFull()){
            var temp = datas;
            datas = new TodoList[temp.length + 10];

            for (int i = 0; i < temp.length; i++) {
                datas[i] = temp[i];
            }
        }
    }

    @Override
    public void add(TodoList list) {
        resize();
        for (int i = 0; i < datas.length; i++) {
            if (datas[i] == null){
                datas[i] = list;
                break;
            }
        }


    }

    @Override
    public String remove(Integer number) {
        if((number -1) >= datas.length || datas[number -1] == null ){
            return "No such element";
        } else {
            for (int i = (number -1); i < datas.length; i ++){
                if (i == (datas.length -1)){
                    datas[i] = null;
                } else{
                    datas[i] = datas[i+1];
                }
            }
            return "List successfully deleted";
        }

    }

    @Override
    public String update(Integer number, TodoList list) {
        if((number -1) >= datas.length || datas[number -1] == null ){
            return "No such element";
        } else if (list == null) {
            return "New Element can't be null";
        } else {
            datas[number -1] = list;
            return "List successfully updated";
        }
    }

}
