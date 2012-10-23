package com.fortysevendeg.bbc.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * A persistence service proxy
 */
public class ObjectProxy implements InvocationHandler {

    public interface Interceptor {

        Object around(Object result);

    }

    private Object obj;

    private Interceptor interceptor;

    @SuppressWarnings("unchecked")
    public static <T> T newInstance(Object obj, Interceptor interceptor) {
        return (T) java.lang.reflect.Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new ObjectProxy(obj, interceptor));
    }

    private ObjectProxy(Object obj, Interceptor interceptor) {
        this.interceptor = interceptor;
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method m, Object[] args)
            throws Throwable {
        Object result;
        try {
            System.out.println("before method " + m.getName());
            result = m.invoke(obj, args);
            result = interceptor.around(result);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("unexpected invocation exception: " +
                    e.getMessage());
        } finally {
            System.out.println("after method " + m.getName());
        }
        return result;
    }

}