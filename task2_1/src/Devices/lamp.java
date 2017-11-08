package Devices;
import Devices.device;
import java.util.*;

  public class lamp extends device implements device.Pluggable {

        public lamp(float vol, float amp, float len, String color) { super(vol, amp, len, color); }

        public void on() {
            System.out.println(this.getName() + ":on");
        }

        public void off() {
            System.out.println(this.getName() + ":off");
        }

        public void plug() {
            System.out.println(this.getName() + ":plug");
        }

        public String getName() {
            return "Lamp";
        }
    }

