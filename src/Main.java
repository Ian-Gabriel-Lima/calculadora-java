void main() {
    // CALCULADORA EM JAVA (DEMAIS VIDEOS DA PLAYLIST NOS PACOTES)

    IO.println("Digite um número inteiro: ");
    int numero1 = Integer.parseInt(IO.readln(""));

    IO.println("Digite outro número inteiro: ");
    int numero2 = Integer.parseInt(IO.readln(""));

    IO.println("Digite o número da operação que deseja realizar.\n1 = soma\n2 = subtração\n3 = divisão\n4 = multiplicação");
    int operacao = Integer.parseInt(IO.readln());

    float resultado = 0;
    switch (operacao) {
        case 1:
            resultado = numero1 + numero2;
            break;
        case 2:
            resultado = numero1 - numero2;
            break;
        case 3:
            if (numero2 == 0) {
                System.out.println("Não é possivel dividir por zero!");
            } else {
                try {
                    resultado = numero1 / numero2;
                } catch (Exception t) {
                    IO.println("ERRO DETECTADO:" + t.getMessage());
                }
            }
            break;
        case 4:
            resultado = numero1 * numero2;
            break;
        default:
            System.out.println("OPERAÇÃO INVÁLIDA!");
    }

    System.out.println("Resultado é: " + resultado);
}
