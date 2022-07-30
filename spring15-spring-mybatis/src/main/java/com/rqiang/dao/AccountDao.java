package com.rqiang.dao;

import com.rqiang.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //@Autowired 就这些可以,@Bean有点难装配、一般系统自己装配进去
public interface AccountDao {
    void save(Account account);

    @Select("select * from tb_account where id=#{i}")
    Account findById(int i);

    void update(Account account);

    List<Account> findAll();

    void delete(Integer id);
}
