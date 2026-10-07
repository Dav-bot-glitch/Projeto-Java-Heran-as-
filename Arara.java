Public class Arara extends Ave {

    public Arara(double peso, int idade, int membros, String corPena) {
        super(peso, idade, membros, corPena);
    }

    @Override
    public void locomover() {
        System.out.println("A arara está voando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("A arara está emitindo sons.");
    }
}