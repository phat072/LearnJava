package Day3_SwingGUI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class B1 {
    public static void main(String[] args) {

        // 1a
        try {
            InputStream is = new FileInputStream("/home/phan/Workspace/Java/LearnJava/javaBasic/src/Day3_SwingGUI/b1.txt");

            int i = -1;

            while ((i = is.read()) != -1) {
                System.out.println(i + "  " + (char) i);
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 1b
        try {
            OutputStream w = new FileOutputStream("/home/phan/Workspace/Java/LearnJava/javaBasic/src/Day3_SwingGUI/b2.txt");

            byte[] by = new byte[] { 'W', 'e', ' ', 'a', 'r', 'e', ' ', 't', 'h', 'e', ' ', 'b', 'e', 's', 't', ' ', 'g', 'r', 'o', 'u', 'p' };

            for (int i = 0; i < by.length; i++) {
                byte b = by[i];
                w.write(b);
            }
            w.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 1c
        try {
            InputStream in = new FileInputStream("/home/phan/Workspace/Java/LearnJava/javaBasic/src/Day3_SwingGUI/b1.txt");

            byte[] temp = new byte[10];
            int i = -1;

            while ((i = in.read(temp)) != -1) {
                String s = new String(temp, 0, i);
                System.out.println(s);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}