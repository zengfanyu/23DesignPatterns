package com.project.fanyuzeng.a23designpatterns.Observerpatterns;

import com.project.fanyuzeng.a23designpatterns.Observerpatterns.concreteobserver.LeagueMember;
import com.project.fanyuzeng.a23designpatterns.Observerpatterns.concretesubject.RoyalLeague;
import com.project.fanyuzeng.a23designpatterns.Observerpatterns.observer.ILeagueMember;
import com.project.fanyuzeng.a23designpatterns.Observerpatterns.subject.LeagueControllerCenter;

/**
 * @author: fanyuzeng on 2018/7/20 14:13
 */
public class Test {
    public static void main(String[] args) {
        //一个联盟
        LeagueControllerCenter royalLCC = new RoyalLeague("royal");

        //五个成员
        ILeagueMember member1 = new LeagueMember("member1");
        ILeagueMember member2 = new LeagueMember("member2");
        ILeagueMember member3 = new LeagueMember("member3");
        ILeagueMember member4 = new LeagueMember("member4");
        ILeagueMember member5 = new LeagueMember("member5");

        //五个成员都加入同一个联盟
        royalLCC.joinLeague(member1);
        royalLCC.joinLeague(member2);
        royalLCC.joinLeague(member3);
        royalLCC.joinLeague(member4);
        royalLCC.joinLeague(member5);

        //假设此时 member1 遭受到攻击
        member1.beAttached(royalLCC);

        //看日志



    }
}
