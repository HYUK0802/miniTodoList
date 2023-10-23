package com.example.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoRequest {

    private String title;
    private Long order;
    private Boolean completed;
}
