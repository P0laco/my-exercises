package io.codeforall.fanSTATICs_;


public class Task implements Comparable<Task> {
    private String description;
    private Importance importance;
    private int priority;

    public Task(Importance importance, int priority, String description) {

        this.importance = importance;
        this.priority = priority;
        this.description = description;

    }

    public Importance getImportance() {
        return importance;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Task o) {
        if (this.getImportance().getLevel() < o.getImportance().getLevel()) {
            return 1;
        }
        if (this.getImportance().getLevel() == o.getImportance().getLevel()) {
            return comparePriority(o);
        }
        return -1;
    }

    public int comparePriority(Task o) {
        if (this.getPriority() < o.getPriority()) {
            return 1;
        }
        if (this.getPriority() == o.getPriority()) {
            return 0;
        }
        return -1;
    }
}
