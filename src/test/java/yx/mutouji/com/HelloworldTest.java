package yx.mutouji.com;

import org.junit.Assert;
import org.junit.Test;

public class HelloworldTest {
    @Test
    public void sayHelloTest(){
        Helloworld hw = new Helloworld();
        Assert.assertEquals("hello, world!", hw.sayHello("world!"));
    }
}
