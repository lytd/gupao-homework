package com.td.pattern.singleton.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RegistryModel {

    private static final Map<String, Object> ioc = new ConcurrentHashMap<>();

    private RegistryModel() {
    }

    public static RegistryModel getInstance(String className) {
        return (RegistryModel) getBean(className);
    }

    public static Object getBean(String className) {
        synchronized (ioc) {

            if (!ioc.containsKey(className)) {
                try {
                    Class<?> clazz = Class.forName(className);
                    Object obj=clazz.newInstance();
                    ioc.put(className, obj);
                    return obj;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }


            } else {

                return ioc.get(className);
            }

        }


        return null;
    }


}
