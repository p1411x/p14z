
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SAD
 */
public class NewClass {
    public static void main(String[] args) {
        Date date = new Date();
         long mhd = date.getTime();
        System.out.println(mhd);
    }
}
