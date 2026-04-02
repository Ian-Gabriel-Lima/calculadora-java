void main(String[] args) {
    // laços de repetição
    for (int i = 0; i <= 10; i++) {
        System.out.println(i);
    }
    Boolean loopAtivo = true;

    int i = 0;

    while (loopAtivo) {
        System.out.println("Meu nome é Ian");
        i++;
        if (i == 10) {
            loopAtivo = false;
        }
    }
}
