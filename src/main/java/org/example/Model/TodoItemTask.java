package org.example.Model;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(int id,  TodoItem todoItem, Person assignee) {
        if (id == 0) throw new RuntimeException("id must not be 0");
        this.id = id;
        setAssignee(assignee);
        setTodoItem(todoItem);
        setAssigned();
    }

    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned() {
        if (getAssignee() != null) this.assigned = true;
        else this.assigned = false;

    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {

        this.assignee = assignee;
    }

    public String getSummary(){
        if (isAssigned()){
            return assignee.getFirstName() + " " + assignee.getLastName()
                    + " assign " + todoItem.getTitle();
        }else {
          return todoItem.getTitle() + "are not assigned";
        }
    }
}
