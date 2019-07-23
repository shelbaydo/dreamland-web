package wang.dreamland.www.service;

import wang.dreamland.www.entity.LoginLog;

import java.util.List;

/**
 * dreamland-wang.dreamland.www.service
 * created by LI LICHUNYAN at 2019/7/20
 */
public interface LoginLogService {
    /**
     * 添加登录日志
     * @param loginLog
     * @return
     */
    int add(LoginLog loginLog);

    /**
     * 查询所有日志
     * @return
     */
    List<LoginLog> findAll();

    /**
     * 根据用户id查询日志集合
     * @param uid
     * @return
     */
    List<LoginLog> findByUid(Long uid);


}
