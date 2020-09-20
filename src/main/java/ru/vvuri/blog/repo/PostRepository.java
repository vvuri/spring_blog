package ru.vvuri.blog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.vvuri.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
