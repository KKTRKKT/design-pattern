package me.kktrkkt.designpattern.templatemethod;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new Plus("number.txt");
        int result = fileProcessor.process();
        System.out.println(result);

        fileProcessor = new Multiply("number.txt");
        result = fileProcessor.process();
        System.out.println(result);
    }
}
