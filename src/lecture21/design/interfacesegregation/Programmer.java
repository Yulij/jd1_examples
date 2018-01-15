package lecture21.design.interfacesegregation;

/**
 * @author yslabko
 */
public class Programmer {

    private Radio radioClock;

    public Programmer(Radio radio) {
        this.radioClock = radio;
    }

    public void listenToRadio() {
        radioClock.listenToRadio();
    }
}
