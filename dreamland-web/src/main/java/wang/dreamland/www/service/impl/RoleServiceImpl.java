package wang.dreamland.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wang.dreamland.www.dao.RoleMapper;
import wang.dreamland.www.entity.Role;
import wang.dreamland.www.service.RoleService;

/**
 * dreamland-wang.dreamland.www.service.impl
 * created by LI LICHUNYAN at 2019/7/20
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public Role findById(long id) {
        Role role = new Role();
        role.setRoleid( id );
        return roleMapper.selectOne( role );
    }

    @Override
    @Transactional
    public int add(Role role) {
        return roleMapper.insert(role);
    }
}
