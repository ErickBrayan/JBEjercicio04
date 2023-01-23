public class SmartPhone extends SmartDevice{

    private String pantalla;
    private String procesador;
    private String camara;

    public SmartPhone(String color, String modelo, String serie, String fechaCreacion, String pantalla, String procesador, String camara) {
        super(color, modelo, serie, fechaCreacion);
        this.pantalla = pantalla;
        this.procesador = procesador;
        this.camara = camara;
    }

    public SmartPhone() {
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "pantalla='" + pantalla + '\'' +
                ", procesador='" + procesador + '\'' +
                ", camara='" + camara + '\'' +
                "} " + super.toString();
    }
}
