package dev.dnom.services.impl;

import dev.dnom.domain.dto.CommentDto;
import dev.dnom.repositories.CommentRepository;
import dev.dnom.services.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public CommentDto createComment(CommentDto comment) {
        return null;
    }
}
