package com.psyco.demo.coding

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

/**
 * Created by HouDongQiang on 2016/3/10.
 */
class CodeProxy implements InvocationHandler {
    Object obj

     Object bind(Object obj) {
        this.obj = obj
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this)

    }

    @Override
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result
        try {
            doBefore()
            result = method.invoke(obj, args)
            doAfter()
        } catch (Exception ex) {
            System.exit(1)
        }
        return result
    }

    private void doAfter() {
        println('I wannago home...')
    }

    private void doBefore() {
        println('I wanna a cup of coffe...')
    }

}
