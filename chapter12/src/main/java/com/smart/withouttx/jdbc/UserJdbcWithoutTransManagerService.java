package com.smart.withouttx.jdbc;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author jerry
 * @create 17/6/29 22:30
 */
@Service("userService")
public class UserJdbcWithoutTransManagerService {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return this.jdbcTemplate;
    }

    public void addScore(String userName, int toAdd) {
        String sql = "UPDATE t_user u SET u.score = u.score + ? WHERE user_name =?";
        jdbcTemplate.update(sql, toAdd, userName);
    }

    public static void main(String[] args) {
        String configPath = "com/smart/withouttx/jdbc/jdbcWithoutTx.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        UserJdbcWithoutTransManagerService service =
                (UserJdbcWithoutTransManagerService)ctx.getBean("userService");
        //JdbcTemplate jdbcTemplate = (JdbcTemplate)ctx.getBean("jdbcTemplate");
        JdbcTemplate jdbcTemplate = service.getJdbcTemplate();
        BasicDataSource basicDataSource = (BasicDataSource)jdbcTemplate.getDataSource();

        //1.检查数据源自动提交设置
        System.out.println("autoCommmit:" + basicDataSource.getDefaultAutoCommit());

        //2.插入一条记录,初始分0
        jdbcTemplate.execute("INSERT INTO t_user(user_name,password,score,last_logon_time) VALUES('tom','123456',10," + System.currentTimeMillis() +")");

        service.addScore("tom", 20);

        int score = jdbcTemplate.queryForObject(
                "SELECT score FROM t_user WHERE user_name ='tom'", Integer.class);
        System.out.println("score:" + score);
        jdbcTemplate.execute("DELETE FROM t_user WHERE user_name='tom'");
    }
}
