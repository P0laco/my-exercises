package io.codeforall.fanSTATICs_;

public class Main {
    public static void main(String[] args) {

    ToDoList todoList= new ToDoList();

    todoList.addTask(Importance.HIGH,1,"Task 1");
    todoList.addTask(Importance.LOW,2,"Task 2");
    todoList.addTask(Importance.HIGH,1,"Task 3");
    todoList.addTask(Importance.MEDIUM,2,"Task 4");


    while(!todoList.isEmpty()){
        System.out.println(todoList.remove());
    }
    }
}
