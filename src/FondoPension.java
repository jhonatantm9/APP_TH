public class FondoPension {

    protected String nombre;
    protected float contabilidad;
    protected int semanasCotizadas;
    protected int semanasRestantes;
    protected int totalSemanas;

    public FondoPension(String nombre, float contabilidad, int semanasCotizadas, int semanasRestantes, int totalSemanas) {
        this.nombre = nombre;
        this.contabilidad = contabilidad;
        this.semanasCotizadas = semanasCotizadas;
        this.semanasRestantes = semanasRestantes;
        this.totalSemanas = totalSemanas;
    }
}
