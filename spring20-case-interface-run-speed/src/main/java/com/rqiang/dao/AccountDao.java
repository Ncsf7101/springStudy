package com.rqiang.dao;

import com.rqiang.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //@Autowired 就这些可以,@Bean有点难装配、一般系统自己装配进去
public interface AccountDao {
    @Insert("insert into tb_account (name, money) values (#{name}, #{money})")
    void save(Account account);

    @Select("select * from tb_account where id=#{i}")
    Account findById(int i);

    @Update("update tb_account set name = #{name}, money = #{money} where id=#{id}")
    void update(Account account);

    @Select("select * from tb_account")
    List<Account> findAll();

    @Select("select * from tb_account where id = #{id}")
    void delete(Integer id);
}
