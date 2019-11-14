package com.lyz.blog.service.impl;

import javax.transaction.Transactional;

import com.lyz.blog.domain.Vote;
import com.lyz.blog.repository.VoteRepository;
import com.lyz.blog.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Vote 服务.
 */
@Service
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteRepository voteRepository;

    /* (non-Javadoc)
     * @see com.waylau.spring.boot.blog.service.VoteService#removeVote(java.lang.Long)
     */
    @Override
    @Transactional
    public void removeVote(Long id) {
        voteRepository.delete(id);
    }

    @Override
    public Vote getVoteById(Long id) {
        return voteRepository.findOne(id);
    }

}
