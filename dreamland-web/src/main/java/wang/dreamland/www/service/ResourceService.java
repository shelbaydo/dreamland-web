package wang.dreamland.www.service;

import wang.dreamland.www.entity.Resource;

import java.util.List;

/**
 * dreamland-wang.dreamland.www.service
 * created by LI LICHUNYAN at 2019/7/20
 */
public interface ResourceService {
    /**
     * 添加资源
     * @param resource
     */
    void add(Resource resource);

    /**
     * 根据资源id查询资源
     * @param id
     * @return
     */
    Resource findById(Long id);

    /**
     * 查询所有资源
     * @return
     */
    List<Resource> findAll();

    /**
     * 根据资源id删除资源
     * @param id
     */
    void deleteById(Long id);

    /**
     * 更新资源
     * @param resource
     */
    void update(Resource resource);
}
