Public class Ave extends Animal {

    private String corPena;

    public Ave(double peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public void fazerNinho() {
        System.out.println("A ave está fazendo um ninho.");
    }
}