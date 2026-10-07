Public class Cachorro extends Mamifero {

    public Cachorro(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public void enterrarOsso() {
        System.out.println("O cachorro está enterrando o osso.");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo: Au Au!");
    }
}