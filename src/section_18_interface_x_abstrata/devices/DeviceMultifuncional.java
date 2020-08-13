package section_18_interface_x_abstrata.devices;

public class DeviceMultifuncional extends Device implements Escaneador, Impressora {

    public DeviceMultifuncional(Integer serial) {
        super(serial);
    }

    @Override
    public String processarDocumento(String documento) {
        return "Processando o documento: " + documento;
    }

    @Override
    public String scan() {
        return "Scaneando o documento";
    }

    @Override
    public String imprimi() {
        return "Imprimindo o documento";
    }
}
