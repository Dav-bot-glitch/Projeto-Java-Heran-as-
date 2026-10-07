Public class Canguru extends Mamifero {

    public Canguru(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public void usarBolsa() {
        System.out.println("O canguru está usando a bolsa.");
    }

    @Override
    public void locomover() {
        System.out.println("O canguru está pulando.");
    }
}