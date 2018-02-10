package com.project.fanyuzeng.a23designpatterns.proxypatterns.realsubject;

import com.project.fanyuzeng.a23designpatterns.proxypatterns.subject.Searcher;

/**
 * @author: fanyuzeng on 2018/2/10 10:30
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSeach(String userId, String password) {
        //模拟查询信息
        return "userName:"+ userId +"success some info:........";
    }
}
