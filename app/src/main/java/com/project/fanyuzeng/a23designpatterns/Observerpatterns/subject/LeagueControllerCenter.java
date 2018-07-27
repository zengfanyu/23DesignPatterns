package com.project.fanyuzeng.a23designpatterns.Observerpatterns.subject;

import com.project.fanyuzeng.a23designpatterns.Observerpatterns.observer.ILeagueMember;

import java.util.ArrayList;

/**
 * 被观察者的基类
 *
 * @author: fanyuzeng on 2018/7/20 14:22
 */
public abstract class LeagueControllerCenter {
    //联盟名
    private String mLeagueName;
    //联盟中的成员
    protected ArrayList<ILeagueMember> mILeagueMembers = new ArrayList<>();

    public LeagueControllerCenter(String leagueName) {
        mLeagueName = leagueName;
    }

    public String getLeagueName() {
        return mLeagueName;
    }

    public void joinLeague(ILeagueMember member) {
        mILeagueMembers.add(member);
    }

    public boolean quitLeague(ILeagueMember member) {
        return mILeagueMembers.remove(member);
    }

    /**
     * 通知盟友前来帮助的方法
     *
     * @param beingAttachedMemberName 发起这个通知的盟友
     */
    public abstract void notifyLeagueMembers(String beingAttachedMemberName);
}
