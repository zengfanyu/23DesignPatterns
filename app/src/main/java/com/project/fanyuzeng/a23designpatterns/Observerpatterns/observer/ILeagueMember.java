package com.project.fanyuzeng.a23designpatterns.Observerpatterns.observer;

import com.project.fanyuzeng.a23designpatterns.Observerpatterns.subject.LeagueControllerCenter;

/**
 * 观察者的基类
 * @author: fanyuzeng on 2018/7/20 14:25
 */
public interface ILeagueMember {

    String getMemberName();

    void help();

    void beAttached(LeagueControllerCenter lcc);
}
