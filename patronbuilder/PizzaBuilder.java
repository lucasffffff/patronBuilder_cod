package patronbuilder;

/**
 *
 * @author lucas
 */
class PizzaBuilder {

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

    public PizzaBuilder setMasa(String masa) {
        this.masa = masa;
        return this;
    }

    public PizzaBuilder setRelleno(boolean relleno) {
        this.relleno = relleno;
        return this;
    }

    public PizzaBuilder setTipo(int tipo) {
        this.tipo = tipo;
        return this;
    }

    public PizzaBuilder setSalsa(boolean salsa) {
        this.salsa = salsa;
        return this;
    }

    public PizzaBuilder setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
        return this;
    }

    public PizzaBuilder setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
        return this;
    }

    public PizzaBuilder setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
        return this;
    }

    public PizzaBuilder setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
        return this;
    }

    public PizzaBuilder setPiña(boolean piña) {
        this.piña = piña;
        return this;
    }

    public PizzaBuilder setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
        return this;
    }

    public PizzaBuilder setJamon(boolean jamon) {
        this.jamon = jamon;
        return this;
    }

    public Pizza build() {
        return new Pizza(masa, relleno, tipo, salsa, tipoSalsa, cebolla, sinGluten, extraQueso, piña, champiñones, jamon);
    }
}
