package dev.dnom.services.impl;

import dev.dnom.domain.dto.PostDto;
import dev.dnom.domain.entities.PostEntity;
import dev.dnom.mappers.PostMapper;
import dev.dnom.repositories.PostRepository;
import dev.dnom.services.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public PostServiceImpl(PostRepository postRepository, PostMapper postMapper) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
    }

    @Override
    public PostDto createPost(PostDto post) {
        PostEntity entity = postMapper.toPostEntity(post);
        PostEntity savedPostEntity = postRepository.save(entity);
        return postMapper.toPostDto(savedPostEntity);

    }

}
