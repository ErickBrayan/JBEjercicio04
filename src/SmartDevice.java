public class SmartDevice {

    private String color;
    private String modelo;
    private String serie;
    private String fechaCreacion;

    public SmartDevice(String color, String modelo, String serie, String fechaCreacion) {
        this.color = color;
        this.modelo = modelo;
        this.serie = serie;
        this.fechaCreacion = fechaCreacion;
    }

    public SmartDevice() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", serie='" + serie + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                '}';
    }
}
