package dev.dnom.services;

import dev.dnom.domain.dto.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto post);
    List<PostDto> getAllPosts();

}
