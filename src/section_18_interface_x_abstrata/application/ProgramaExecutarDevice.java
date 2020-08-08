package section_18_interface_x_abstrata.application;

import section_18_interface_x_abstrata.devices.DeviceMultifuncional;

public class ProgramaExecutarDevice {
    public static void main(String[] args) {

        DeviceMultifuncional deviceMultifuncional = new DeviceMultifuncional(123);

        System.out.println("Serial do device: " + deviceMultifuncional.getSerial());
        System.out.println(deviceMultifuncional.processarDocumento("Excel"));
        System.out.println(deviceMultifuncional.scan());
        System.out.println(deviceMultifuncional.imprimi());
    }
}
