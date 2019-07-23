package wang.dreamland.www.service;

import wang.dreamland.www.entity.Role;

/**
 * dreamland-wang.dreamland.www.service
 * created by LI LICHUNYAN at 2019/7/20
 */
public interface RoleService {
    /**
     * 根据id查询角色
     * @param id
     * @return
     */
    Role findById(long id);

    /**
     * 添加角色
     * @param role
     * @return
     */
    int add(Role role);
}
