// 1 - Pacote
package inicio;

// 2 - Referência as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        System.out.println("Bom dia!!!");
        System.out.println("Cálculo de área");

            // Calculo de área reduzida
            int largura = 4;
            int comprimento = 3;

            System.out.println("Para a largura de " + largura + "m e  o comprimento de "
                    + comprimento + "m a área é de " + largura * comprimento + "m²");

    }
    public void calcularAreaModoExtenso(){
        // Cálculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5;      // largura recebe 4
        comprimento = 6; // comprimento recebe 3

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e  o comprimento de "
                + comprimento + "m a área é de " + resultado + "m²");

    }public void calcularAreaModoCompacto(){
        // Calculo de área reduzida
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e  o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }
}
