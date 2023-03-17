package patronbuilder;

/**
 *
 * @author lucas
 */
class Pizza {

    private String masa;
    private boolean relleno;
    private int tipo;
    private boolean salsa;
    private String tipoSalsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean piña;
    private boolean champiñones;
    private boolean jamon;

    public Pizza(String masa, boolean relleno, int tipo, boolean salsa, String tipoSalsa, boolean cebolla,
            boolean sinGluten, boolean extraQueso, boolean piña, boolean champiñones, boolean jamon) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.champiñones = champiñones;
        this.jamon = jamon;
    }

    @Override
    public String toString() {
        return "Pizza{"
                + "masa='" + masa + '\''
                + ", relleno=" + relleno
                + ", tipo=" + tipo
                + ", salsa=" + salsa
                + ", tipoSalsa='" + tipoSalsa + '\''
                + ", cebolla=" + cebolla
                + ", sinGluten=" + sinGluten
                + ", extraQueso=" + extraQueso
                + ", piña=" + piña
                + ", champiñones=" + champiñones
                + ", jamon=" + jamon
                + '}';
    }
}
