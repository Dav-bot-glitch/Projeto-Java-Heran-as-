Public class Tartaruga extends Reptil {

    public Tartaruga(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public void locomover() {
        System.out.println("A tartaruga está andando lentamente.");
    }
}