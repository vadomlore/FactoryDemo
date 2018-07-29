package com.zyl.beginning;

public class BasicTypes {
    public static void main(String[] args) {
        String abb = "ddd";
        String d = abb;
        int ia = 1; // Integer
        double db = 2; //Double
        float dc = 3f; //Float
        boolean bx = false; //Boolean
        byte b1 = 0x01; //字节 Byte
        short u1 = 12; //16位 Short
        long l1 = 111111; //Long
        char m = 'a'; //Character
        Color c = Color.RED;
        System.out.println(c.description);
        System.out.println(c);
        System.out.println("aaaa");
    }

    public enum Color {
        RED("red", 0xFF0000),
        GREEN("green", 0x00FF00),
        BLUE("blue", 0x0000FF);

        private String description;
        private int code;

        Color(String description, int code) {
            this.description = description;
            this.code = code;
        }
    }

}
