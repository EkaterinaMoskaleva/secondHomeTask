package Devices;
import java.util.*;
import Devices.device;
import Devices.lamp;
import Devices.flash;
import Devices.clock;

public class main {
    private List<device> devs;

    public static void main(String[] args) {
        lamp lamp = new lamp(220f, 25f, 2f, "white");
        lamp.plug();
        lamp.on();

        List<device>  devs = new ArrayList<>();
        devs.add(lamp);
        devs.add(new lamp(200, 20,4,"black"));
        devs.add(new lamp(180, 25,1,"blue"));
        devs.add(new lamp(210, 15,14,"yellow"));
        devs.add(new flash(12f, 2f, 6f, "red"));
        devs.add(new flash(14f, 3f, 5f, "white"));
        devs.add(new flash(15f, 4f, 11f, "orange"));
        devs.add(new clock(14f, 4f, 5f, "blue"));
        devs.add(new clock(2f, 1f, 10f, "pink"));
        devs.add(new clock(12f, 2f, 15f, "green"));

        Collections.sort(devs);
        System.out.println(devs);
        System.out.println(device.getFullPower(devs));
        System.out.println(device.filter(devs, 1f, 3f));

    }
}
