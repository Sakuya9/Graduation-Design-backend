package com.neusoft.zywlzl.mapper;

import com.neusoft.zywlzl.model.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    /**
     * delete by primary key
     *
     * @param roleId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer roleId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Role record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Role record);

    /**
     * select by primary key
     *
     * @param roleId primary key
     * @return object by primary key
     */
    Role selectByPrimaryKey(Integer roleId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Role record);

    List<Role> selectAll();
}