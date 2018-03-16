package yx.mutouji.com;

public class Helloworld {

    public String sayHello(String name){
        return "hello, " + name;
    }

    public static void main(String[] args) {
        System.out.println(new Helloworld().sayHello("world!"));
    }
}
