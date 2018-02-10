package com.project.fanyuzeng.a23designpatterns.proxypatterns.subject;

/**
 * @author: fanyuzeng on 2018/2/10 10:24
 */
public interface Searcher {
    /**
     * 调用查询系统的接口
     *
     * @param userId  用户名
     * @param password 密码
     * @return 查询结果
     */
    String doSeach(String userId, String password);
}
