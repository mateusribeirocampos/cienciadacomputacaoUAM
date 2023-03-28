package areatriangle;
/***************************************************************************************************************************************************Crie uma aplicação que calcule a área de um triângulo. Elabore as variáveis necessárias e coloque o tipo de dado adequado para cada uma. No final, imprima a resposta. Lembre-se de que a base receberá o valor de 15 e a altura o valor de 7,5. Para calcular a área de um triângulo utilizamos a fórmula: área = (base x altura) / 2.
***************************************************************************************************************************************************/
public class Area_triangulo {
    public static void main(String[] args) {
        int base = 15;
        double altura = 7.5;
        double area = (base * altura) / 2;

        System.out.println("A área do triângulo: " + area);
    }
}
