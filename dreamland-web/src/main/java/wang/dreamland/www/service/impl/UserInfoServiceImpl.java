package wang.dreamland.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wang.dreamland.www.dao.UserInfoMapper;
import wang.dreamland.www.entity.UserInfo;
import wang.dreamland.www.service.UserInfoService;

/**
 * dreamland-wang.dreamland.www.service.impl
 * created by LI LICHUNYAN at 2019/7/20
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;


    public UserInfo findByUid(Long id) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserid(id);
        return userInfoMapper.selectOne(userInfo);
    }
    @Transactional
    public void update(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKey(userInfo);
    }
    @Transactional
    public void add(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
    }
}
