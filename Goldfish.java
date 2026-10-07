Public class Goldfish extends Peixe {

    public Goldfish(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public void locomover() {
        System.out.println("O goldfish está nadando.");
    }
}