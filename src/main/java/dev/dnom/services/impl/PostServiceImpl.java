package dev.dnom.services.impl;

import dev.dnom.domain.dto.PostDto;
import dev.dnom.repositories.PostRepository;
import dev.dnom.services.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto post) {

        return null;
    }

}
