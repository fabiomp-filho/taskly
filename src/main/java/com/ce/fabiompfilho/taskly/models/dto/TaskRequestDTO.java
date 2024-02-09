package com.ce.fabiompfilho.taskly.models.dto;

import com.ce.fabiompfilho.taskly.enums.StatusEnum;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaskRequestDTO {

    @Size(message = "title must have a max of 50 chars", max = 50)
    @NotEmpty(message = "field title can't be null")
    private String title;
    @NotEmpty(message = "field description can't be null")
    private String description;
    @NotNull(message = "field date can't be null")
    private LocalDate dueDate;
    @NotNull(message = "field status can't be null")
    private StatusEnum status;
    @NotNull(message = "field categoryId can't be null")
    private Long categoryId;
    @NotNull(message = "field userId can't be null")
    private Long userId;
}
