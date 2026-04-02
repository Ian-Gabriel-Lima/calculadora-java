void main(String[] args) {
    //switch case
    int numeroDia = 3;

    if (numeroDia == 0) {
        IO.println("Domingo");
    } else if (numeroDia == 1) {
        IO.println("Segunda-feira");
    } else if (numeroDia == 2) {
        IO.println("Terça-feira");
    } else if (numeroDia == 3) {
        IO.println("Quarta-feira");
    } else if (numeroDia == 4) {
        IO.println("Quinta-feira");
    } else if (numeroDia == 5) {
        IO.println("Sexta-feira");
    } else if (numeroDia == 6) {
        IO.println("Sábado");
    }

    switch (numeroDia) {
        case 0:
            IO.println("Domingo");
            break;
        case 1:
            IO.println("Segunda-feira");
            break;
        case 2:
            IO.println("Terça-feira");
            break;
        default:
            IO.println("Dia da semana invalido");
    }


}
