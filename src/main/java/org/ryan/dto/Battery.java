package org.ryan.dto;

public class Battery {
    private boolean charge;
    private int batteryPercent;

    public boolean Charge() {
        while (true) {
            if (batteryPercent < 40) {
                charge = true;
            }

        }
    }
}
