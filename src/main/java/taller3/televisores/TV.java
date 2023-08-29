package taller3.televisores;

public class TV {

    private static int numTV = 0;

    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.precio = 500;
        this.volumen = 1;
        numTV++;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public boolean getEstado() {
        return estado;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if(canal > 120 || canal < 1 || !this.estado ){
            return;
        }
        this.canal = canal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if(volumen > 7 || volumen < 0 || !this.estado){
           return;
        }
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public void turnOn() {
        if(!this.estado)
            this.estado = true;
    }

    public void turnOff() {
        if(this.estado)
            this.estado = false;
    }

    public void canalUp() {
        if (this.canal < 120 && this.estado)
            this.canal++;
    }

    public void canalDown() {
        if (this.canal > 1 && this.estado)
            this.canal--;
    }

    public void volumenUp(){
        if (this.volumen < 7 && this.estado)
            this.volumen++;
    }

    public void volumenDown(){
        if (this.volumen > 0 && this.estado)
            this.volumen--;
    }
}
