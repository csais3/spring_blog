package dev.dnom.mappers;

import dev.dnom.domain.dto.CommentDto;
import dev.dnom.domain.entities.CommentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CommentMapper {

    CommentMapper  mapper = Mappers.getMapper(CommentMapper.class);
    CommentDto toCommentDto(CommentEntity entity);
    CommentEntity toCommentEntity(CommentDto commentDto);
}
