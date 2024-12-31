package dev.dnom.domain.dto;

public record CommentDto(
        Long id,
        String content,
        Long postId

) { }
