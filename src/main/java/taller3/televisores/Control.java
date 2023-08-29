package taller3.televisores;

public class Control {
    private TV tv;

    public TV getTv() {
        return tv;
    }

    public void enlazar(TV tv) {
        this.tv = tv;
        tv.setControl(this);
    }

    public void setTv(TV tv) {
        enlazar(tv);
    }

    public void turnOn() {
        tv.turnOn();
    }

    public void turnOff() {
        tv.turnOff();
    }

    public void canalUp() {
        tv.canalUp();
    }

    public void canalDown() {
        tv.canalDown();
    }

    public void setCanal(int canal) {
        tv.setCanal(canal);
    }

    public void volumenUp() {
        tv.volumenUp();
    }

    public void volumenDown() {
        tv.volumenDown();
    }

    public void setVolumen(int volumen){
        tv.setVolumen(volumen);
    }


}
