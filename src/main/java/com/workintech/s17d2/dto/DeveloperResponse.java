package com.workintech.s17d2.dto;

import com.workintech.s17d2.model.Developer;

public class DeveloperResponse {

    private Developer developer;
    private String message;
    private Integer Status;

    public DeveloperResponse(Developer developer, String message, Integer status) {
        this.developer = developer;
        this.message = message;
        Status = status;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }
}
