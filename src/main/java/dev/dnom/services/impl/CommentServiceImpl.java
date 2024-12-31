package dev.dnom.services.impl;

import dev.dnom.domain.dto.CommentDto;
import dev.dnom.domain.entities.CommentEntity;
import dev.dnom.mappers.CommentMapper;
import dev.dnom.repositories.CommentRepository;
import dev.dnom.services.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final CommentMapper commentMapper;

    public CommentServiceImpl(CommentRepository commentRepository, CommentMapper commentMapper) {
        this.commentRepository = commentRepository;
        this.commentMapper = commentMapper;
    }

    @Override
    public CommentDto createComment(CommentDto comment) {
        CommentEntity entity = commentMapper.toCommentEntity(comment);
        CommentEntity savedEntity = commentRepository.save(entity);
        return commentMapper.toCommentDto(savedEntity);
    }
}
