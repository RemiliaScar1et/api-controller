package cn.chang.service.impl;

import cn.chang.dto.PageDTO;
import cn.chang.mapper.ProjectDao;
import cn.chang.pojo.Project;
import cn.chang.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ProjectServiceImpl
 * @PackageName cn.chang.service.impl
 * @Description //TODO
 * @Date 2021/1/12 17:15
 * @Author RemiliaScarlet
 * @Version v1.0
 **/
@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectDao projectDao;

    @Override
    public PageDTO getAllProject() {
        PageDTO pageDTO = new PageDTO();
        pageDTO.setSize(-1);
        pageDTO.setCurrent(1);
        pageDTO.setPages(1);
        pageDTO.setTotal(projectDao.selectCount(null));
        pageDTO.setData(projectDao.selectMaps(null));
        return pageDTO;
    }
}
