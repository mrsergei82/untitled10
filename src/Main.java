import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String[] heder = new String[3];
        heder[0]= "value1";
        heder[1]= "value2";
        heder[2]= "value3";
        int[][] data = new int[3][2];
        data[0][0]=100;
        data[0][1]=200;
        data[1][0]=123;
        data[1][1]=300;
        data[2][0]=400;
        data[2][1]=500;
        AppData appData = new AppData(heder,data);
        appData.setHeader(heder);
        appData.setData(data);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("newFile.txt"))){
            String str;
            writer.write("Value1;Value2;Value3\n");
            writer.write("300"+";"+"200"+";"+"120"+"\n");
            writer.write("200"+";"+"100"+";"+"140");
        }catch (IOException e){
            e.printStackTrace();
        }
        try(BufferedReader reader = new BufferedReader(new FileReader("newFile.txt"))){
            String str;
            while ((str = reader.readLine())!=null){
                System.out.println( str+" ");
            }

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
