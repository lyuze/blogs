package com.lyz.blog.service;


import com.lyz.blog.domain.Authority;

/**
 * Authority 服务接口.
 */
public interface AuthorityService {


    /**
     * 根据id获取 Authority
     *
     * @return
     */
    Authority getAuthorityById(Long id);
}
