public class SmartWatch extends SmartDevice{

    private String bateria;
    private String colorCorrea;

    public SmartWatch() {
    }

    public SmartWatch(String color, String modelo, String serie, String fechaCreacion, String bateria, String colorCorrea) {
        super(color, modelo, serie, fechaCreacion);
        this.bateria = bateria;
        this.colorCorrea = colorCorrea;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getColorCorrea() {
        return colorCorrea;
    }

    public void setColorCorrea(String colorCorrea) {
        this.colorCorrea = colorCorrea;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "bateria='" + bateria + '\'' +
                ", colorCorrea='" + colorCorrea + '\'' +
                "} " + super.toString();
    }
}
