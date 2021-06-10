package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.List;

public class Permission {
    private String id;
    private PersonSpeedFace person;
    private String description;
    private List<String>  daysOfWeek;
    private LocalDateTime from;
    private LocalDateTime to;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
