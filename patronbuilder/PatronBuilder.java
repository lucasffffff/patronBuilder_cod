package patronbuilder;

/**
 *
 * @author lucas
 */
public class PatronBuilder {

    public static void main(String[] args) {
        // Creo pizzas usando el constructor de la clase Pizza:
        Pizza pizza1 = new Pizza("Normal", true, 2, true, "Barbacoa", true, false, false, false, false, false);
        Pizza pizza2 = new Pizza("Fina", false, 3, true, "Solo tomate", false, true, false, false, false, false);
        Pizza pizza3 = new Pizza("Masa pan", true, 1, false, "Salsa sin gluten", false, true, false, false, false, false);

        System.out.println("Pizza 1: " + pizza1.toString());
        System.out.println("Pizza 2: " + pizza2.toString());
        System.out.println("Pizza 3: " + pizza3.toString());

        // Creo pizzas usando el patrón Builder
        Pizza pizzaBuilder1 = new PizzaBuilder()
                .setMasa("Normal")
                .setRelleno(true)
                .setTipo(2)
                .setSalsa(true)
                .setTipoSalsa("Barbacoa")
                .setCebolla(true)
                .setSinGluten(false)
                .setExtraQueso(false)
                .setPiña(false)
                .setChampiñones(false)
                .setJamon(false)
                .build();

        Pizza pizzaBuilder2 = new PizzaBuilder()
                .setMasa("Fina")
                .setRelleno(false)
                .setTipo(3)
                .setSalsa(true)
                .setTipoSalsa("Solo tomate")
                .setCebolla(false)
                .setSinGluten(true)
                .setExtraQueso(false)
                .setPiña(false)
                .setChampiñones(false)
                .setJamon(false)
                .build();

        Pizza pizzaBuilder3 = new PizzaBuilder()
                .setMasa("Masa pan")
                .setRelleno(true)
                .setTipo(1)
                .setSalsa(false)
                .setTipoSalsa("Salsa sin gluten")
                .setCebolla(false)
                .setSinGluten(true)
                .setExtraQueso(false)
                .setPiña(false)
                .setChampiñones(false)
                .setJamon(false)
                .build();

        System.out.println("Pizza Builder 1: " + pizzaBuilder1.toString());
        System.out.println("Pizza Builder 2: " + pizzaBuilder2.toString());
        System.out.println("Pizza Builder 3: " + pizzaBuilder3.toString());
    }
}
