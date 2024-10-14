package io.codeforall.fanSTATICs_;

import java.util.PriorityQueue;

public class ToDoList {

    private PriorityQueue<Task> tasks;

    public ToDoList(){
        this.tasks = new PriorityQueue<>();
    }

    public void addTask(Importance importance, int priority, String description) {
        tasks.add(new Task(importance, priority, description));
    }

    public boolean isEmpty(){
            if (tasks.isEmpty()){
                return true;
            }
            return false;
    }

    public String remove(){
        Task tasks = this.tasks.poll();
        return tasks.getImportance() + " " + String.valueOf(tasks.getPriority()+ " " + tasks.getDescription());
    }
}
