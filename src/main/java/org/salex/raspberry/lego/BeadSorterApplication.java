package org.salex.raspberry.lego;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeadSorterApplication {
    public static void main(String[] args) {
        System.out.println("| Red                | Green              | Blue               |");
    //    final GpioController gpio = GpioFactory.getInstance();
        System.out.print("|--------------------|--------------------|--------------------|");
        for(int i = 0 ; i < 20 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            StringBuffer bar = new StringBuffer("\r|");
            for(int j = 0 ; j < 20 ; j ++) {
                if(j<=i) {
                    bar.append("#");
                } else {
                    bar.append("-");
                }
            }
            bar.append("|");
            for(int j = 0 ; j < 20 ; j ++) {
                if(j<=i) {
                    bar.append("#");
                } else {
                    bar.append("-");
                }
            }
            bar.append("|");
            for(int j = 0 ; j < 20 ; j ++) {
                if(j<=i) {
                    bar.append("#");
                } else {
                    bar.append("-");
                }
            }
            bar.append("|");
            System.out.print(bar.toString());
        }
    }
}
