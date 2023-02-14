package com.example.sakura;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.val;

import java.lang.annotation.*;


public class MyAnnotation {

    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("com.example.sakura.Cy");
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        MyAnnotationTest myAnnotationTest = (MyAnnotationTest) c1.getAnnotation(MyAnnotationTest.class);
        System.out.println(myAnnotationTest.name());

        System.out.println("注解测试");
        System.out.println("hot-fix 代码修改");
        System.out.println("hot-fix 代码再次修改");
    }


}

@Data
@AllArgsConstructor
@MyAnnotationTest(name = "chenyang")
class Cy{

    @MyAnnotationTest2("123")
    private String aaa;



}


@Target(value = {ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationTest{
    String name() default "";
}

@Target(value = {ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationTest2{
    String value();
}


