Public class Peixe extends Animal {

    private String corEscama;

    public Peixe(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void soltarBolha() {
        System.out.println("O peixe está soltando bolhas.");
    }
}