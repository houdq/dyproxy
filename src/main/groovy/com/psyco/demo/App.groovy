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
        Programer psyco = new Iprogramer()
        Programer proxy = (Programer)new CodeProxy().bind(psyco)
        proxy.code()
    }
}
