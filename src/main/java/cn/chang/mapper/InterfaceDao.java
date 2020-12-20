package cn.chang.mapper;

import cn.chang.pojo.Interface;
import cn.chang.pojo.InterfaceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public interface InterfaceDao {
    long countByExample(InterfaceExample example);

    int deleteByExample(InterfaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Interface record);

    int insertSelective(Interface record);

    List<Interface> selectByExample(InterfaceExample example);

    Interface selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Interface record, @Param("example") InterfaceExample example);

    int updateByExample(@Param("record") Interface record, @Param("example") InterfaceExample example);

    int updateByPrimaryKeySelective(Interface record);

    int updateByPrimaryKey(Interface record);
}