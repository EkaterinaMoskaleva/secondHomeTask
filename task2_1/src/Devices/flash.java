package Devices;
import Devices.device;
import Devices.main;
import java.util.*;

public class flash extends device implements device.Chargable {

        public flash(float vol, float amp, float len, String color) { super(vol, amp, len, color); }

        public void on() {
            System.out.println(this.getName() + ":on");
        }

        public void off() {
            System.out.println(this.getName() + ":off");
        }

        public void charge() {
            System.out.println(this.getName() + ":charge");
        }

        public String getName() {
            return "Flash";
        }
    }

