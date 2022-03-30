// 1 - Pacote
package inicio;

// 2 - Referência as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // switch - Selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        String opcao = "melancia";

        switch (opcao){
            case "ifSimples":
                System.out.println("Você escolheu o método ifSimples");
                ifSimples();
                break;
            case "curto":
                System.out.println("Você escolheu o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "extenso":
                System.out.println("Você escolheu o método  calcularAreaModoExtenso");
               calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você escolheu outro valor que não tem uma ação associada");
                break;

        }



    }

    public static void ifSimples(){
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // if = se
        // else = senão

        String modo = "extenso";

        if (modo == "curto") {
            calcularAreaModoCurto();

        }
        else {
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoCurto() {

        System.out.println("Cálculo de área Modo Curto ");

        // Calculo de área reduzida
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e  o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }


    public static void calcularAreaModoExtenso() {

        System.out.println("Cálculo de área Modo Extenso ");

        // Cálculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5;      // largura recebe 4
        comprimento = 6; // comprimento recebe 3

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e  o comprimento de "
                + comprimento + "m a área é de " + resultado + "m²");
    }
}
