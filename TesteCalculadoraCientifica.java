public class TesteCalculadoraCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica calc1 = new CalculadoraCientifica();
        // Raiz↓↓
        System.out.println(calc1.raiz(16));
        System.out.println(calc1.raiz(91.0));
        System.out.println(calc1.raiz("81"));

        // Potenciação↓↓
        byte a =2, b =4;
        System.out.println(calc1.potencia(a, b));
        System.out.println(calc1.potencia("2", "5"));
        
        System.out.println(calc1.potencia(4, 16.0));
    }
}
