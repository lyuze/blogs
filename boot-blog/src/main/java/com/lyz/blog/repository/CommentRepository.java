package com.lyz.blog.repository;

import com.lyz.blog.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Comment 仓库.
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
