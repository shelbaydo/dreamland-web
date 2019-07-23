package wang.dreamland.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wang.dreamland.www.dao.RoleUserMapper;
import wang.dreamland.www.entity.RoleUser;
import wang.dreamland.www.entity.User;
import wang.dreamland.www.service.RoleUserService;

import java.util.List;

/**
 * dreamland-wang.dreamland.www.service.impl
 * created by LI LICHUNYAN at 2019/7/20
 */
@Service
public class RoleUserServiceImpl implements RoleUserService {
    @Autowired
    private RoleUserMapper roleUserMapper;

    public List<RoleUser> findByUser(User user) {
        RoleUser roleUser = new RoleUser();
        roleUser.setUserid( user.getId() );
        return roleUserMapper.select( roleUser );
    }
    @Transactional
    public int add(RoleUser roleUser) {
        return roleUserMapper.insert( roleUser );
    }
    @Transactional
    public void deleteByUid(Long uid) {
        RoleUser roleUser = new RoleUser();
        roleUser.setUserid( uid );
        roleUserMapper.delete( roleUser );
    }
}
