package com.ce.fabiompfilho.taskly.enums;


import lombok.Getter;

@Getter
public enum StatusEnum {
    PENDING("Pending"),
    IN_PROGRESS("In Progress"),
    COMPLETED("Completed");

    private final String description;

    StatusEnum(String description) {
        this.description = description;
    }

}
