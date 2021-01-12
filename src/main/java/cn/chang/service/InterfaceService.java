package cn.chang.service;

import cn.chang.pojo.Interface;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.awt.*;
import java.util.Map;

public interface InterfaceService {

    public IPage<Map<String,Object>> getAllApi();

    public IPage<Map<String,Object>> getApiWithQueryWrapper(QueryWrapper<Interface> queryWrapper);

    public boolean addApi(Interface anInterface);

    public boolean deleteApi(Interface anInterface);

    public boolean updataApi(Interface anInterface);


}
