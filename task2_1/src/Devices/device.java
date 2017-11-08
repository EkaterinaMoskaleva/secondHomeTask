package Devices;
import Devices.main;
import Devices.lamp;
import Devices.flash;
import Devices.clock;
import java.util.*;

public abstract class device implements Comparable<device> {
     
        final public float voltage, power, cordLength, amper;
        final public String color;

        public device(float voltage, float amper, float cordLength, String color) {
            this.voltage = voltage;
            this.amper = amper;
            this.power = voltage * amper;
            this.cordLength = cordLength;
            this.color = color;
        }

        abstract void on();
        abstract void off();
        abstract String getName();

        public String toString() {
            return this.power + " " + this.getName() + " " + this.voltage +" " + "V, " + this.amper + " " + "A, Cord " + this.cordLength + " " + "M";

        }

        public int compareTo(device o) {
            if (o.power > this.power) return -1;
            if (o.power < this.power) return 1;
            return 0;
        }
        // от зарядки
    static public interface Chargable {
        void charge();
    }
    // от разетки
    static public interface Pluggable {
        void plug();
    }


    public static List<device> filter(List<device> list, float min, float max) {
        List<device> result = new ArrayList<>();
        for (device dev : list) {
            if (dev.cordLength >= min && dev.cordLength <= max) result.add(dev);
        }
        return result;
    }

    public static float getFullPower(List<device> list) {
        float acc = 0.0f;
        for (device dev : list) {
            acc += dev.power;
        }

        return acc;
    }
}
