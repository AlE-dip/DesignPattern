package com.ale.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@MyAnnotation(name = "AAA")
public class Main {
    public static <I> void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = User.class;

        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("+ " + constructor.getName() + " has " + constructor.getParameterCount() + " param");
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("+ " + method.getName());
        }

        User user = (User) constructors[0].newInstance("9", "8");
        System.out.println(user);


        Class<?> aClazz = Main.class;

        // Lấy ra danh sách các Annotation của class.
        Annotation[] annotations = aClazz.getAnnotations();

        for (Annotation ann : annotations) {
            System.out.println("Annotation: " + ann.annotationType().getSimpleName());
        }

        // Hoặc lấy cụ thể.
        Annotation ann = aClazz.getAnnotation(MyAnnotation.class);
        MyAnnotation myAnn = (MyAnnotation) ann;
        System.out.println("Name = " + myAnn.name());
        System.out.println("Value = " + myAnn.value());
    }
}
