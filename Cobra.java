Public class Cobra extends Reptil {

    public Cobra(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public void locomover() {
        System.out.println("A cobra está rastejando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("A cobra está sibilando.");
    }
}