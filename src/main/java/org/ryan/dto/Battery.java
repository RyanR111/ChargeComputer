package org.ryan.dto;

import java.util.Scanner;

public class Battery {
    Scanner console = new Scanner(System.in);
    private boolean charge;
    public int batteryPercent;
    public boolean plugged;


    public void Charge() {
        System.out.println("Plugged? ");
        plugged = console.nextBoolean();
        if (plugged) {
            System.out.println("Enter charge value: ");
            batteryPercent = console.nextInt();
        }

        while (plugged) {
            if (batteryPercent < 40) {
                charge = true;
                while (batteryPercent <= 60) {
                    System.out.println(charge);
                    System.out.println("Plugged? ");
                    plugged = console.nextBoolean();
                    System.out.println("Enter charge value: ");
                    batteryPercent = console.nextInt();
                    if (!plugged) {
                        break;
                    }
                }
            } else if (batteryPercent >= 60) {
                charge = false;
                while (batteryPercent >= 40) {
                    System.out.println(charge);
                    System.out.println("Plugged? ");
                    plugged = console.nextBoolean();
                    System.out.println("Enter charge value: ");
                    batteryPercent = console.nextInt();
                    if (!plugged) {
                        break;
                    }
                }
            }
        }
    }
}
