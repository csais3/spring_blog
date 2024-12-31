package dev.dnom.domain.dto;

import dev.dnom.domain.entities.PostEntity;

public record CommentDto(
        Long id,
        String content,
        PostEntity postId

) { }
