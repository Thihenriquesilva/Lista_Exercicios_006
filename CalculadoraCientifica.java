public class CalculadoraCientifica {
    // 3 Escreva uma classe chamada CalculadoraCientifica. 
    // Ela deve fazer as operações de potenciação e radiciação com inteiros e reais

    // 3.1 Escreva um método chamado raiz. Utilizando sobrecarga de métodos, ele terá três versões:

    // 3.1.1 Lista de parâmetros com um inteiro:
    public double raiz(int ra){
        return Math.sqrt(ra);
    }
    //3.1.2 Lista de parâmetros com um double:
    public double raiz(double db){
        return Math.sqrt(db);
    }
    //3.1.3 Lista de parâmetros com uma String:
    public double raiz(String s1){
        return raiz(Double.parseDouble(s1));
    }
    /*******************************/
    // 3.2 Escreva um método chamado potência. Utilizando a sobrecarga de métodos, ele terá três versões:

    // 3.2.1 Lista de parâmetros com dois bytes a e b. Ele calcula e devolve a elevado a b.
    public double potencia(byte a, byte b){
        return Math.pow(a,b);
    }
    // 3.2.2 Lista de parâmetros com duas Strings s1 e s2. Ele converte ambas para double,calcula e devolve s1 elevado a s2.
    public double potencia(String s1, String s2){
        return Math.pow(Double.parseDouble(s1),Double.parseDouble(s2));
    }
    // 3.2.3 Lista de parâmetros com um inteiro a e um double b. Ele calcula e devolve a elevado a b.
    public double potencia(int a, double b){
        return Math.pow(a,b);
    }
}
