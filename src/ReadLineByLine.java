import java.io.*;
public class ReadLineByLine {
    public static void main(String[] args) {
        readLineByLine();
    }
    public static void readLineByLine() {


        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ich\\Desktop\\sorular.txt"));

            String line =br.readLine();

            while (line!=null){
                System.out.println(line);
                line=br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Either path is wrong or file has been deleted" + e.getMessage());

        } catch (IOException e) {
           e.printStackTrace();
        }
    }
    }


