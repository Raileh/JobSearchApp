package com.example.tristam.studentjobsearch;

public class Job {
    public String title;
    public String region;
    public String category;
    public String type;

    public Job(String title, String region, String category, String type) {
        this.title = title;
        this.region = region;
        this.category = category;
        this.type = type;
    }

    public Job(){
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
