package section_18_interface_x_abstrata.devices;

public abstract class Device {

    private Integer serial;

    public Device(Integer serial) {
        this.serial = serial;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public abstract String processarDocumento(String documento);
}
