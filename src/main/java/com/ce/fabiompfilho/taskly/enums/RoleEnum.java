package com.ce.fabiompfilho.taskly.enums;

import lombok.Getter;

@Getter
public enum RoleEnum {

    ADMIN("Administrator"),
    USER("Author");

    private final String description;

    RoleEnum(String description) {
        this.description = description;
    }
}
