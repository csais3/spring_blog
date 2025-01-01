package dev.dnom.services;

import dev.dnom.domain.dto.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(CommentDto comment);

    List<CommentDto> findAllComments();
}
