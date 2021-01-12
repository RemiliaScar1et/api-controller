package cn.chang.controller;

import cn.chang.dto.ResultDTO;
import cn.chang.dto.ResultDTOBuilder;
import cn.chang.mapper.InterfaceDao;
import cn.chang.pojo.Interface;
import cn.chang.service.InterfaceService;
import cn.chang.service.ProjectService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class MainController {
    @Autowired
    private InterfaceService interfaceService;

    @Autowired
    private InterfaceDao interfaceDao;

    @Autowired
    private ProjectService projectService;

    /*@RequestMapping(value = "getMsg",method = RequestMethod.GET)
    public ResultDTO getTest(){
        Page<Interface> page = new Page<>(1, 2);

        IPage<Map<String,Object>> interfaceIPage = interfaceDao.selectMapsPage(page,null);

        return ResultDTOBuilder.success(interfaceIPage);
    }*/

    @RequestMapping(value = "")
    public String defultPage(){
        return "Welcome my page";
    }

    @RequestMapping("get")
    public ResultDTO test(){

        return ResultDTOBuilder.success(projectService.getAllProject());
    }
}
