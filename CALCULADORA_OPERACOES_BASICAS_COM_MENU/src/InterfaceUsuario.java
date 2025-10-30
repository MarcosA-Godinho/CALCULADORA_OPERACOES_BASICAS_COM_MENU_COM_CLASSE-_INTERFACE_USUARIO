import java.util.Scanner;

public class InterfaceUsuario {

    private Scanner sc;

    public InterfaceUsuario() {
        this.sc = new Scanner(System.in);
    }

    public void fechar() {
        sc.close();
    }

    public void exibirMenu() {
        System.out.println("**************************");
        System.out.println("* ESCOLHA UMA OPÇÃO:     *");
        System.out.println("* 1 - ADIÇÃO             *");
        System.out.println("* 2 - SUBTRAÇÃO          *");
        System.out.println("* 3 - MULTIPLICAÇÃO      *");
        System.out.println("* 4 - DIVISÃO            *");
        System.out.println("* 5 - SAIR DO PROGRAMA   *");
        System.out.println("**************************");
    }

    public int lerOpcao() {      //>>> ESSE METODO PERMITE LER AS OPÇÕES DO MENNU
        return sc.nextInt();
    }

    public double lerNumero(String mensagem) {  //>>> ESSE METODO PERMITE LER QUALQUER NUMERO DOUBLE
        System.out.println(mensagem);
        return sc.nextDouble();
    }

    public void exibirBoasVindas(String nomeOperacao) {
        System.out.println("\nSEJA BEM VINDO A CALCULADORA DE " + nomeOperacao.toUpperCase() + "!");
    }

    // Metodo para exibir o resultado formatado
    public void exibirResultado(double numeroA, double numeroB, double resultado, String simbolo) {
        System.out.println("\nSEGUE RESULTADO DA SUA OPERAÇÃO");
        System.out.println(" >>> " + numeroA + " " + simbolo + " " + numeroB + " = " + resultado + "\n");
    }

    // Metodo para o "loop de continuar"
    public boolean perguntarSeContinua() {
        System.out.println("************************************");
        System.out.println("* DESEJA VOLTAR AO MENU INICIAL?   *");
        System.out.println("* DIGITE 1 PARA SIM OU 2 PARA NÃO. *");
        System.out.println("************************************");
        int continuar = sc.nextInt();

        if (continuar != 1) {
            System.out.println("ATÉ A PROXIMA!");
            return false; // Não continuar (ativo = false)
        }
        return true; // Continuar (ativo = true)
    }

    // Metodo para opção inválida
    public void exibirOpcaoInvalida() {
        System.out.println("\nOPÇÃO INVÁLIDA! Por favor, escolha uma opção de 1 a 5!");
    }

    // Metodo para mensagem de saída
    public void exibirMensagemSaida(int opcao) {
        System.out.println("\nVOCÊ ESCOLHEU A OPÇÃO " + opcao);
        System.out.println("ATÉ A PROXIMA!");

    }
}
