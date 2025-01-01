package dev.dnom.services.impl;

import dev.dnom.domain.dto.PostDto;
import dev.dnom.domain.entities.PostEntity;
import dev.dnom.mappers.PostMapper;
import dev.dnom.repositories.PostRepository;
import dev.dnom.services.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<PostDto> getAllPosts() {
        return postRepository.findAll().stream()
                .map(postMapper::toPostDto)
                .collect(Collectors.toList());
    }

}
