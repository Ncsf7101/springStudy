package com.rqiang.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;


public interface LogDao {
    //    @Insert("insert into tb_log (info, createDate) values (#{info}, #{createDate})")
//    public void log(@Param("info") String info, @Param("createDate") Date createDate);
    @Insert("insert into tb_log (info, createDate) values (#{info}, now())")
    public void log(@Param("info") String info);
}
