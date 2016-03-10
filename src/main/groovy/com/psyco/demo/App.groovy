package com.psyco.demo

import com.psyco.demo.coding.CodeProxy
import com.psyco.demo.coding.Iprogramer
import com.psyco.demo.coding.Programer
import groovy.transform.CompileStatic

/**
 * Created by HouDongQiang on 2016/3/10.
 */
@CompileStatic
class App {
    public static void main(String[] args) {

        //码字是一种超能力 噢耶
        Programer psyco = new Iprogramer()
        //找个外包写代码 赋予他超能力
        Programer proxy = (Programer) new CodeProxy().bind(psyco)
        /**
         * 丫开始干活
         * 丫干活前先喝咖啡
         * 丫完事了就滚蛋了 (。。。完美)
         */

        proxy.code()
    }
}
