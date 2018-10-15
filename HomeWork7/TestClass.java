package com.bashko.java3.HomeWork7;

import java.lang.reflect.Method;
import java.util.*;

public class TestClass {

    public static void start(String nameClass) {
        try {
            start(Class.forName(nameClass));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void start(Class<?> object) {

        List<Method> methods = new ArrayList<Method>();
        methods.addAll(Arrays.asList(object.getDeclaredMethods()));

        Method beforeSuite = getBeforeSuite(methods);
        methods.remove(beforeSuite);
        Method afterSuite = getAfterSuite(methods);
        methods.remove(afterSuite);

        Collections.sort(methods, new Comparator<Method>() {
            public int compare(Method m1, Method m2) {
                Test annotation1 = m1.getAnnotation(Test.class);
                Test annotation2 = m2.getAnnotation(Test.class);
                if (annotation1.priority() == annotation2.priority()) return 0;
                else if (annotation1.priority() < annotation2.priority()) return -1;
                else return 1;
            }
        });
        try {
            Object ob = object.newInstance();
            beforeSuite.invoke(ob);
            for (Method o : methods) {
                o.invoke(ob);
            }
            afterSuite.invoke(ob);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Method getBeforeSuite(List<Method> methods) {
        int count = 0;
        Method beforeSuite = null;
        for (Method o : methods) {
            if (o.getAnnotation(BeforeSuite.class) != null){
                beforeSuite = o;
                count++;
            }
        }
        if (count>1) throw new RuntimeException("Больше одного метода BeforeSuite");
        return beforeSuite;
    }

    public static Method getAfterSuite(List<Method> methods) {
        int count = 0;
        Method afterSuite = null;
        for (Method o : methods) {
            if (o.getAnnotation(AfterSuite.class) != null) {
                afterSuite = o;
                count++;
            }
        }
        if (count>1) throw new RuntimeException("Больше одного метода AfterSuite");
        return afterSuite;
    }
}
