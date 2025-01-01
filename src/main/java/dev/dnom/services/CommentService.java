package dev.dnom.services;

import dev.dnom.domain.dto.CommentDto;

public interface CommentService {
    CommentDto createComment(CommentDto comment);
}
