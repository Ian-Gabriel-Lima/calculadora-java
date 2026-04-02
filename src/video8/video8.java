void main(String[] args) {
    // Ler inputs do user
//    IO.println("Qual é o seu nome? ");
//    String nome = IO.readln();
//
//    IO.println("qual a sua idade? ");
//    int idade = Integer.parseInt(IO.readln());

    // simplificando as linhas de cima

    String nome = IO.readln("Qual o seu nome? ");
    int idade = Integer.parseInt(IO.readln("Qual a sua idade? "));
    double peso = Double.parseDouble(IO.readln("Qual o seu peso? "));
    float altura = Float.parseFloat(IO.readln("Qual a sua altura? "));

    System.out.println("Olá " + nome);
    System.out.println("Sua idade é " + idade);
    System.out.println("Seu peso é " + peso);
    System.out.println("Sua altura é " + altura);

}