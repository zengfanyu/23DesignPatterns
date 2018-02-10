package com.project.fanyuzeng.a23designpatterns.proxypatterns;

/**
 * 身份验证类
 *
 * @author: fanyuzeng on 2018/2/10 10:33
 */
public class AccessValidator {
    private static final String TAG = "==AccessValidator==";

    /**
     * 模拟实现登录验证
     *
     * @param userId
     * @return
     */
    public boolean Validate(String userId) {
        System.out.println("在数据库中验证用户" + userId + "是否是合法用户？");
        if (userId.equals("ZFY")) {
            System.out.println("登录成功！" + userId);
            return true;
        } else {
            System.out.println("登录失败！" + userId);
            return false;
        }
    }
}
