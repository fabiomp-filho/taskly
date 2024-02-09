package com.ce.fabiompfilho.taskly.models.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryRequestDTO {

    @Size(message = "name must have a max of 50 chars", max = 20)
    @NotEmpty(message = "field name can't be null")
    private String name;
    @Size(message = "description must have a max of 50 chars", max = 50)
    @NotEmpty(message = "field description can't be null")
    private String description;
    @NotNull(message = "field userId can't be null")
    private Long userid;
    @NotNull(message = "list taskIds can't be null")
    private List<Long> taskIds;

}
