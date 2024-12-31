package dev.dnom.domain.dto;

import dev.dnom.domain.entities.Category;

import java.time.LocalDateTime;

public record PostDto(
    Long id,
    String title,
   String content,
    Category category,
   LocalDateTime dateCreated,
    LocalDateTime dateUpdated
) {
}
