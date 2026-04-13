public class NoListaDupla <T> {
    private int infoDupla;
    private NoListaDupla<T> proximoDupla;
    private NoListaDupla<T> anteriorDupla;

    public int getInfoDupla(int valor) {
        return infoDupla;
    }

    public void setInfoDupla(int infoDupla) {
        this.infoDupla = infoDupla;
    }

    public NoListaDupla<T> getProximoDupla() {
        return proximoDupla;
    }

    public void setProximoDupla(NoListaDupla<T> proximoDupla) {
        this.proximoDupla = proximoDupla;
    }

    public NoListaDupla<T> getAnteriorDupla() {
        return anteriorDupla;
    }

    public void setAnteriorDupla(NoListaDupla<T> anteriorDupla) {
        this.anteriorDupla = anteriorDupla;
    }
}