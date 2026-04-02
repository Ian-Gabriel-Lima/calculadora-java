void main(String[] args) {
    // Try Catch / tratamentos de erros!

    try {
        simulaErro();
    } catch (Throwable t) {
        System.out.println("Erro Capturado: " + t.getMessage());
        t.printStackTrace();
    }
}

void simulaErro() throws Throwable {
    throw new Throwable("Erro simulado");
}