package com.lyz.blog.service.impl;

import javax.transaction.Transactional;

import com.lyz.blog.domain.Comment;
import com.lyz.blog.repository.CommentRepository;
import com.lyz.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Comment 服务.
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    /* (non-Javadoc)
     * @see com.waylau.spring.boot.blog.service.CommentService#removeComment(java.lang.Long)
     */
    @Override
    @Transactional
    public void removeComment(Long id) {
        commentRepository.delete(id);
    }

    @Override
    public Comment getCommentById(Long id) {
        return commentRepository.findOne(id);
    }

}
