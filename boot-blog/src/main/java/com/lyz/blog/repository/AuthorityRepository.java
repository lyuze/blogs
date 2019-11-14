package com.lyz.blog.repository;

import com.lyz.blog.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Authority 仓库.
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
