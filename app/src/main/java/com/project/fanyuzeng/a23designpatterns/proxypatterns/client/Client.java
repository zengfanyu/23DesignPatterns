package com.project.fanyuzeng.a23designpatterns.proxypatterns.client;

import com.project.fanyuzeng.a23designpatterns.proxypatterns.proxy.ProxySearcher;
import com.project.fanyuzeng.a23designpatterns.proxypatterns.subject.Searcher;

/**
 * @author: fanyuzeng on 2018/2/10 10:53
 */
public class Client {
    private static Searcher mSearcher;


    public static void main(String[] args) {

        if (mSearcher == null) {
            mSearcher = getSearchInstance();
        }

        mSearcher.doSeach("ZFY", "blabala");

    }

    private static Searcher getSearchInstance() {

        return ProxySearcher.getInstance();

    }
}
