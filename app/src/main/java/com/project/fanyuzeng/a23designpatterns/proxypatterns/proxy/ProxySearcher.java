package com.project.fanyuzeng.a23designpatterns.proxypatterns.proxy;

import com.project.fanyuzeng.a23designpatterns.proxypatterns.AccessValidator;
import com.project.fanyuzeng.a23designpatterns.proxypatterns.Logger;
import com.project.fanyuzeng.a23designpatterns.proxypatterns.realsubject.RealSearcher;
import com.project.fanyuzeng.a23designpatterns.proxypatterns.subject.Searcher;

import dagger.Module;

/**
 * @author: fanyuzeng on 2018/2/10 10:33
 */
@Module
public class ProxySearcher implements Searcher {
    private static final String TAG = "==ProxySearcher==";
    //持有真正进行查询过程对象的引用
    private RealSearcher mRealSearcher;
    private AccessValidator mAccessValidator;
    private Logger mLogger;

    private static ProxySearcher sProxySearcher;

    private ProxySearcher() {
        mRealSearcher = new RealSearcher();
        mAccessValidator = new AccessValidator();
        mLogger = new Logger();
    }

    public static ProxySearcher getInstance() {
        if (sProxySearcher == null) {
            sProxySearcher = new ProxySearcher();
        }
        return sProxySearcher;
    }

    @Override
    public String doSeach(String userId, String password) {
        if (userId == null || password == null)
            return "params empty";

        String result = "search fail";
        if (mAccessValidator != null) {
            if (isVertify(userId)) {
                if (mRealSearcher != null) {
                    result = mRealSearcher.doSeach(userId, password);
                }
            } else {
                System.out.println("Access deny");
            }
        }
        if (!result.equals("search fail")) {
            logSearchCount(userId);
        }

        return result;
    }


    private boolean isVertify(String userId) {
        return mAccessValidator.Validate(userId);
    }

    private void logSearchCount(String userId) {
        mLogger.searchLog(userId);
    }
}
