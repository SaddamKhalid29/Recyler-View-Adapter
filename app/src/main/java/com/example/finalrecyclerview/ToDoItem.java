package com.example.finalrecyclerview;

public class ToDoItem {
    //Variables Declaring
    private String title;
    private String description;
    private boolean IsActive;

    //Generate Getter and Setter

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

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }

    //Constructors
    public ToDoItem(){
        title="No Title";
        description="There's nothing in the description";
        IsActive=false;
    }

    public ToDoItem(String Title, String Desc,Boolean isActive){
        this.title=Title;
        this.description=Desc;
        this.IsActive=isActive;
    }

    //toString Method

    @Override
    public String toString() {
        return "ToDoItem{" + "title='" + title + ", description='" + description + ", IsActive=" + IsActive + '}';
    }
}
