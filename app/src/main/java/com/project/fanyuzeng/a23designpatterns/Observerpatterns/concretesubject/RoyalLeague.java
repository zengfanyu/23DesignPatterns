package com.project.fanyuzeng.a23designpatterns.Observerpatterns.concretesubject;

import com.project.fanyuzeng.a23designpatterns.Observerpatterns.observer.ILeagueMember;
import com.project.fanyuzeng.a23designpatterns.Observerpatterns.subject.LeagueControllerCenter;

/**
 * @author: fanyuzeng on 2018/7/20 14:38
 */
public class RoyalLeague extends LeagueControllerCenter {

    public RoyalLeague(String leagueName) {
        super(leagueName);
    }

    @Override
    public void notifyLeagueMembers(String beingAttachedMemberName) {

        System.out.println(getLeagueName() + "got it, notify other members to help");

        for (ILeagueMember leagueMember : mILeagueMembers) {
            //通知其他的盟友前来帮助
            if (!leagueMember.getMemberName().equals(beingAttachedMemberName)) {
                leagueMember.help();
            }
        }
    }
}
