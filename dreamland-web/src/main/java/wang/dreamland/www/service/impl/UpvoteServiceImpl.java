package wang.dreamland.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wang.dreamland.www.dao.UpvoteMapper;
import wang.dreamland.www.entity.Upvote;
import wang.dreamland.www.service.UpvoteService;

/**
 * dreamland-wang.dreamland.www.service.impl
 * created by LI LICHUNYAN at 2019/7/20
 */
@Service
public class UpvoteServiceImpl implements UpvoteService {
    @Autowired
    private UpvoteMapper upvoteMapper;


    public Upvote findByUidAndConId(Upvote upvote) {
      return  upvoteMapper.selectOne( upvote);
    }
    @Transactional
    public int add(Upvote upvote) {
        return upvoteMapper.insert( upvote );
    }

    public Upvote getByUid(Upvote upvote) {
        return null;
    }
    @Transactional
    public void update(Upvote upvote) {
        upvoteMapper.updateByPrimaryKey( upvote );
    }
}
