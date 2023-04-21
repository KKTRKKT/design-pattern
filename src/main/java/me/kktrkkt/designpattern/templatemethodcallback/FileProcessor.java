package me.kktrkkt.designpattern.templatemethodcallback;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

    private String path;
    public FileProcessor(String path) {
        this.path = path;
    }

    public int process(Operator operator) {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            int result = Integer.parseInt(line);
            while((line = reader.readLine()) != null) {
                result = operator.calc(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }

    public interface Operator {
        int calc(int sum, int num);

        static int plus(int sum, int num){
            return sum += num;
        }

        static int multiply(int sum, int num){
            return sum *= num;
        }
    }
}
