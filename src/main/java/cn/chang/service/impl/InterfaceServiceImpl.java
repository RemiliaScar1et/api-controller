package cn.chang.service.impl;

import cn.chang.mapper.InterfaceDao;
import cn.chang.pojo.Interface;
import cn.chang.service.InterfaceService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class InterfaceServiceImpl implements InterfaceService {
    @Autowired
    private InterfaceDao interfaceDao;

    @Override
    public IPage<Map<String, Object>> getAllApi() {
        return (IPage<Map<String, Object>>) interfaceDao.selectMaps(null);
    }

    @Override
    public IPage<Map<String, Object>> getApiWithQueryWrapper(QueryWrapper<Interface> queryWrapper) {
        return null;
    }

    @Override
    public boolean addApi(Interface anInterface) {
        return false;
    }

    @Override
    public boolean deleteApi(Interface anInterface) {
        return false;
    }

    @Override
    public boolean updataApi(Interface anInterface) {
        return false;
    }
}
