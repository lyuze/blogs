package com.lyz.blog.repository;

import com.lyz.blog.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Vote 仓库.
 */
public interface VoteRepository extends JpaRepository<Vote, Long> {

}
