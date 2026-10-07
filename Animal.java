Public class Animal {

    private double peso;
    private int idade;
    private int membros;

    public Animal(double peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public int getMembros() {
        return membros;
    }

    public void locomover() {
        System.out.println("O animal está se locomovendo.");
    }

    public void alimentar() {
        System.out.println("O animal está se alimentando.");
    }

    public void emitirSom() {
        System.out.println("O animal está emitindo um som.");
    }
}