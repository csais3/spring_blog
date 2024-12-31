package dev.dnom.repositories;

import dev.dnom.domain.entities.PostEntity;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<PostEntity, Long> {
}
