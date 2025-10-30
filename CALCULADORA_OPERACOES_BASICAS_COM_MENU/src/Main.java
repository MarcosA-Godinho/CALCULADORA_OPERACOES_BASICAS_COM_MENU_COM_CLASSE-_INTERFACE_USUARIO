
public class Main {
    public static void main(String[] args) {

        // 1. Instancia os objetos que vamos usar
        InterfaceUsuario ui = new InterfaceUsuario();
        Calculadora calculadora = new Calculadora();

        double numeroA;
        double numeroB;
        double resultado;

        // 2. Constantes das opções (como você já tinha)
        final int ADICAO = 1;
        final int SUBTRACAO = 2;
        final int MULTIPLICACAO = 3;
        final int DIVISAO = 4;
        final int SAIR = 5;

        boolean ativo = true;

        //LOOP PRINCIPAL
        while (ativo) {

            ui.exibirMenu(); // Pede para a UI mostrar o menu
            int OPCAO_ESCOLHIDA = ui.lerOpcao(); // Pede para a UI ler a opção

            if (OPCAO_ESCOLHIDA == ADICAO) {
                ui.exibirBoasVindas("SOMA");
                numeroA = ui.lerNumero("\nInforme o valor do primeira parcela: ");
                numeroB = ui.lerNumero("Informe o valor da segunda parcela: ");
                resultado = calculadora.somaNumeros(numeroA, numeroB);
                ui.exibirResultado(numeroA, numeroB, resultado, "+");

            } else if (OPCAO_ESCOLHIDA == SUBTRACAO) {
                ui.exibirBoasVindas("SUBTRAÇÃO");
                numeroA = ui.lerNumero("\nInforme o valor do minuendo: ");
                numeroB = ui.lerNumero("Informe o valor do subtraendo: ");
                resultado = calculadora.subtracaoNumeros(numeroA, numeroB);
                ui.exibirResultado(numeroA, numeroB, resultado, "-");

            } else if (OPCAO_ESCOLHIDA == MULTIPLICACAO) {
                ui.exibirBoasVindas("MULTIPLICAÇÃO");
                numeroA = ui.lerNumero("\nInforme o primeiro fator: ");
                numeroB = ui.lerNumero("Informe o valor do segundo fator: ");
                resultado = calculadora.multiplicacaoNumeros(numeroA, numeroB);
                ui.exibirResultado(numeroA, numeroB, resultado, "X");

            } else if (OPCAO_ESCOLHIDA == DIVISAO) {
                ui.exibirBoasVindas("DIVISÃO");
                numeroA = ui.lerNumero("\nInforme o dividendo: ");
                numeroB = ui.lerNumero("Informe o divisor: ");
                resultado = calculadora.divisaoNumeros(numeroA, numeroB);
                ui.exibirResultado(numeroA, numeroB, resultado, "/");

            } else if (OPCAO_ESCOLHIDA == SAIR) {
                ui.exibirMensagemSaida(OPCAO_ESCOLHIDA);
                ativo = false; // Termina o loop

            } else {
                ui.exibirOpcaoInvalida();
            }

            // 4. Pergunta se continua (se não escolheu sair)
            if (OPCAO_ESCOLHIDA >= ADICAO && OPCAO_ESCOLHIDA <= DIVISAO) {
                ativo = ui.perguntarSeContinua(); // A UI cuida de tudo
            }
        }

        // 5. Fecha o scanner ao final do programa
        ui.fechar();
    }
}