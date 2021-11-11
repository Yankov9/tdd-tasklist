package edu.uaslp.objetos.taskslist;

import java.time.LocalDateTime;

public class Task {

    private String title;
    private String description;
    private LocalDateTime dueDate;
    private Boolean done;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        LocalDateTime now=LocalDateTime.now();

        if(dueDate.isBefore(now)){
            throw new TaskListException("Due date is set in the past");
        }
        this.dueDate = dueDate;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public boolean isDone() {
        return false;
    }
}
