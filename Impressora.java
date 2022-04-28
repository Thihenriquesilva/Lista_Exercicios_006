/**
 Ex001
 Escreva uma classe chamada Impressora. Essa classe tem  como finalidade imprimir
 conteúdos diversos na tela. Ela deve possuir diversos métodos chamados exibir. Eles
 poderão coexistir graças ao mecanismo conhecido como sobrecarga de métodos.
 Escreva versões do método exibir que tenham as seguintes listas de parâmetros
 */
public class Impressora {

    // 1.1 um único float:
    public void Exibir(float f1){
        System.out.println(f1);
    }
    //1.2 dois float:
    public void Exibir(float f1, float f2){
        System.out.println(f1+ "," +f2);
        
    }
    //1.3 um float e uma String,nessa ordem:
    public void Exibir(float f1, String s1){
        System.out.println(f1 + "," + s1);
    }
    //1.4 uma String e um float, nessa ordem:
    public void Exibir(String s1, float f1){
        Exibir(f1,s1);
    }
    //1.5 três Strings:
    public void Exibir(String s1,String s2, String s3){
        System.out.printf("%s, %s, %s \n",s1,s2,s3);
    }
    //1.6 dois ints e uma String, nessa ordem:
    public void Exibir(int a1, int a2, String s1){
        System.out.println(a1 + ", " + a2 + ", " + s1 );
    }
}