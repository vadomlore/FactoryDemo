package com.zyl.beginning.inheritence.ipay;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

class DemoPay{

    public interface Pay
    {
        void doPay();
    }

    //Focus Class
    abstract static class AbstractPay implements Pay{

        PaySupport paySupport;

        @Override
        public void doPay(){
            init();
            prePay();
            pay();
            afterPay();
        }

        abstract void prePay();


        abstract void pay();

        protected void afterPay(){}

        abstract void init();

    }

    static class WeChatPay extends AbstractPay
    {


        @Override
        protected void prePay() {
            System.out.println("WeChatPrePay");
        }

        @Override
        protected void pay() {
            System.out.println("WeChatPay");
        }

        @Override
        protected void afterPay() {
            System.out.println("WeChatPayAfterPay");
        }

        @Override
        public void init() {

        }
    }

    //UtilityClass

    //工具类
    class PayUtility{

    }


    //Uml 2.5 规范
    //名词含义 包含关系

    // Thread

    //

    //Auxiliary class
    class PaySupport {

        //货币转换

        //汇率

        // xml 解析

        // 参数解析

        //xxx
    }


    class PayLog{ //支付记录
        //--->log 网络
        //数据库
    }

    class PayStatistics{

    }

    static class ZhiFuBaoPay extends AbstractPay
    {
        @Override
        void prePay() {

        }

        @Override
        void pay() {

        }

        @Override
        void init() {

        }
    }

    public static void main(String[] args) {
        Pay pay0 = new WeChatPay();
        pay0.doPay();

        Pay pay1 = new ZhiFuBaoPay();
        pay1.doPay();

        //RTFSC
        //read the fucking source code
    }
}
