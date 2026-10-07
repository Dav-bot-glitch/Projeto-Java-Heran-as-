Public class Mamifero extends Animal {

    private String corPelo;

    public Mamifero(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }
}