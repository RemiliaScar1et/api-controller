package cn.chang.controller;

import cn.chang.dto.ResultDTO;
import cn.chang.dto.ResultDTOBuilder;
import cn.chang.mapper.InterfaceDao;
import cn.chang.pojo.Interface;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private InterfaceDao interfaceDao;

    @RequestMapping(value = "getMsg",method = RequestMethod.GET)
    public ResultDTO getTest(){

        IPage<Interface> interfaceIPage = new Page<>(1,2);

        interfaceDao.selectPage(interfaceIPage,null);
        return ResultDTOBuilder.success(interfaceIPage.getRecords());
    }
}
