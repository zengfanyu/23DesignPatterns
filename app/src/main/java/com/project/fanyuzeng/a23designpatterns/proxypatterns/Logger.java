package com.project.fanyuzeng.a23designpatterns.proxypatterns;

/**
 * 用于记录查询次数
 *
 * @author: fanyuzeng on 2018/2/10 10:37
 */
public class Logger {
    private static final String TAG = "==Logger==";

    /**
     * 模拟记录查询次数
     *
     * @param userId
     */
    public void searchLog(String userId) {
        System.out.println("更新数据库，用户:" + userId + " 查询次数+1！");

    }
}
