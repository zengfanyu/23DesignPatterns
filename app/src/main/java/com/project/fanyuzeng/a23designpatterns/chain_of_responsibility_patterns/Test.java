package com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns;

import com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.concrete_handler.BoardOfDirectors;
import com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.concrete_handler.Chairman;
import com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.concrete_handler.Director;
import com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.concrete_handler.Intern;
import com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.handler.Approver;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: fanyuzeng on 2018/2/24 11:23
 */
public class Test {

    private static ExecutorService mExecutorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {
        final PurchaseRequest purchaseRequest1 = new PurchaseRequest(10000000, 12580, "98K");
        final PurchaseRequest purchaseRequest2 = new PurchaseRequest(8000, 12581, "M16");
        final PurchaseRequest purchaseRequest3 = new PurchaseRequest(70000, 12582, "AUG");
        final PurchaseRequest purchaseRequest4 = new PurchaseRequest(500, 12583, "止痛药");


        final Approver intern = new Intern("Rose");
        Approver director = new Director("Jack");
        Approver chairmain = new Chairman("Tom");
        Approver boardOfDirectors = new BoardOfDirectors("NiubilityBoardOfDirectors");

        intern.mSuccessor = director;
        director.mSuccessor = chairmain;
        chairmain.mSuccessor = boardOfDirectors;

        mExecutorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("---------purchaseRequest1 start-------------------");
                intern.processPurchase(purchaseRequest1);
                System.out.println("---------purchaseRequest1 end---------------------" + "\n");
            }
        });

        mExecutorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("---------purchaseRequest2 start-------------------");
                intern.processPurchase(purchaseRequest2);
                System.out.println("---------purchaseRequest2 end---------------------" + "\n");
            }
        });

        mExecutorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("---------purchaseRequest3 start-------------------");
                intern.processPurchase(purchaseRequest3);
                System.out.println("---------purchaseRequest3 end---------------------"+ "\n");
            }
        });

        mExecutorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("---------purchaseRequest4 start-------------------");
                intern.processPurchase(purchaseRequest4);
                System.out.println("---------purchaseRequest4 end---------------------");
            }
        });
    }

}
