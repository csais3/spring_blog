package dev.dnom.services.impl;

import dev.dnom.domain.dto.CommentDto;
import dev.dnom.domain.entities.CommentEntity;
import dev.dnom.mappers.CommentMapper;
import dev.dnom.repositories.CommentRepository;
import dev.dnom.services.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<CommentDto> findAllComments() {
        return commentRepository.findAll().stream()
                .map(commentMapper::toCommentDto)
                .collect(Collectors.toList());
    }
}
