package com.project.fanyuzeng.a23designpatterns.Observerpatterns.concreteobserver;

import com.project.fanyuzeng.a23designpatterns.Observerpatterns.observer.ILeagueMember;
import com.project.fanyuzeng.a23designpatterns.Observerpatterns.subject.LeagueControllerCenter;

/**
 * @author: fanyuzeng on 2018/7/20 14:34
 */
public class LeagueMember implements ILeagueMember {
    private String mMemberName;

    public LeagueMember(String memberName) {
        mMemberName = memberName;
    }

    @Override
    public String getMemberName() {
        return mMemberName;
    }

    @Override
    public void help() {
        System.out.println(mMemberName + " coming to help");
    }

    @Override
    public void beAttached(LeagueControllerCenter lcc) {
        System.out.println(mMemberName + " being attached");
        lcc.notifyLeagueMembers(mMemberName);
    }
}
