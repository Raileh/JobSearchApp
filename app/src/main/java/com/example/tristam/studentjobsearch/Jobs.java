package com.example.tristam.studentjobsearch;

public class Jobs {
    public String region;
    public String category;
    public String type;

    public Jobs(String region, String category, String type) {
        this.region = region;
        this.category = category;
        this.type = type;
    }

    public Jobs(){

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
