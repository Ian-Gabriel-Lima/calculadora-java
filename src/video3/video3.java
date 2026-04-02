void main(String[] args) {
    // Concatenação e interpolação

    String nome = "lucas";
    Integer idade = 20;

    // CONCATENAÇÃO
    IO.println(nome + " " + idade);
    System.out.println(nome + " " + idade);

    //INTERPOLAÇÃO
    IO.println(String.format("Meu nome é %s, e eu tenho %s anos!", nome, idade));
    System.out.printf("Meu nome é %s, e eu tenho %s anos!", nome, idade);


}