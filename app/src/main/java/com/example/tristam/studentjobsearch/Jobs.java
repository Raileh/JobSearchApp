package com.example.tristam.studentjobsearch;

public class Jobs {
    public String location;
    public int salary;
    public String title;

    public Jobs(String location, int salary, String title) {
        this.location = location;
        this.salary = salary;
        this.title = title;
    }

    public Jobs(){

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
