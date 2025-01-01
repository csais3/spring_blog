package dev.dnom.mappers;

import dev.dnom.domain.dto.PostDto;
import dev.dnom.domain.entities.PostEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PostMapper {

    PostMapper mapper = Mappers.getMapper(PostMapper.class);
    PostDto toPostDto(PostEntity entity);
    PostEntity toPostEntity(PostDto postDto);
}
