Import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

   

        System.out.println("===== CADASTRO DO CANGURU =====");

        System.out.print("Peso: ");
        double pesoCanguru = scanner.nextDouble();

        System.out.print("Idade: ");
        int idadeCanguru = scanner.nextInt();

        System.out.print("Quantidade de membros: ");
        int membrosCanguru = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Cor do pelo: ");
        String corPeloCanguru = scanner.nextLine();

        Canguru canguru = new Canguru(
                pesoCanguru,
                idadeCanguru,
                membrosCanguru,
                corPeloCanguru
        );

        System.out.println("\n--- Dados do Canguru ---");
        System.out.println("Peso: " + canguru.getPeso());
        System.out.println("Idade: " + canguru.getIdade());
        System.out.println("Membros: " + canguru.getMembros());
        System.out.println("Cor do pelo: " + canguru.getCorPelo());

        canguru.locomover();
        canguru.alimentar();
        canguru.emitirSom();
        canguru.usarBolsa();


        
      

        System.out.println("\n===== CADASTRO DO CACHORRO =====");

        System.out.print("Peso: ");
        double pesoCachorro = scanner.nextDouble();

        System.out.print("Idade: ");
        int idadeCachorro = scanner.nextInt();

        System.out.print("Quantidade de membros: ");
        int membrosCachorro = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Cor do pelo: ");
        String corPeloCachorro = scanner.nextLine();

        Cachorro cachorro = new Cachorro(
                pesoCachorro,
                idadeCachorro,
                membrosCachorro,
                corPeloCachorro
        );

        System.out.println("\n--- Dados do Cachorro ---");
        System.out.println("Peso: " + cachorro.getPeso());
        System.out.println("Idade: " + cachorro.getIdade());
        System.out.println("Membros: " + cachorro.getMembros());
        System.out.println("Cor do pelo: " + cachorro.getCorPelo());

        cachorro.locomover();
        cachorro.alimentar();
        cachorro.emitirSom();
        cachorro.enterrarOsso();
        cachorro.abanarRabo();



        System.out.println("\n===== CADASTRO DA COBRA =====");

        System.out.print("Peso: ");
        double pesoCobra = scanner.nextDouble();

        System.out.print("Idade: ");
        int idadeCobra = scanner.nextInt();

        System.out.print("Quantidade de membros: ");
        int membrosCobra = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Cor da escama: ");
        String corEscamaCobra = scanner.nextLine();

        Cobra cobra = new Cobra(
                pesoCobra,
                idadeCobra,
                membrosCobra,
                corEscamaCobra
        );

        System.out.println("\n--- Dados da Cobra ---");
        System.out.println("Peso: " + cobra.getPeso());
        System.out.println("Idade: " + cobra.getIdade());
        System.out.println("Membros: " + cobra.getMembros());
        System.out.println("Cor da escama: " + cobra.getCorEscama());

        cobra.locomover();
        cobra.alimentar();
        cobra.emitirSom();


     

        System.out.println("\n===== CADASTRO DA TARTARUGA =====");

        System.out.print("Peso: ");
        double pesoTartaruga = scanner.nextDouble();

        System.out.print("Idade: ");
        int idadeTartaruga = scanner.nextInt();

        System.out.print("Quantidade de membros: ");
        int membrosTartaruga = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Cor da escama: ");
        String corEscamaTartaruga = scanner.nextLine();

        Tartaruga tartaruga = new Tartaruga(
                pesoTartaruga,
                idadeTartaruga,
                membrosTartaruga,
                corEscamaTartaruga
        );

        System.out.println("\n--- Dados da Tartaruga ---");
        System.out.println("Peso: " + tartaruga.getPeso());
        System.out.println("Idade: " + tartaruga.getIdade());
        System.out.println("Membros: " + tartaruga.getMembros());
        System.out.println("Cor da escama: " + tartaruga.getCorEscama());

        tartaruga.locomover();
        tartaruga.alimentar();
        tartaruga.emitirSom();


      
   

        System.out.println("\n===== CADASTRO DO GOLDFISH =====");

        System.out.print("Peso: ");
        double pesoGoldfish = scanner.nextDouble();

        System.out.print("Idade: ");
        int idadeGoldfish = scanner.nextInt();

        System.out.print("Quantidade de membros: ");
        int membrosGoldfish = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Cor da escama: ");
        String corEscamaGoldfish = scanner.nextLine();

        Goldfish goldfish = new Goldfish(
                pesoGoldfish,
                idadeGoldfish,
                membrosGoldfish,
                corEscamaGoldfish
        );

        System.out.println("\n--- Dados do Goldfish ---");
        System.out.println("Peso: " + goldfish.getPeso());
        System.out.println("Idade: " + goldfish.getIdade());
        System.out.println("Membros: " + goldfish.getMembros());
        System.out.println("Cor da escama: " + goldfish.getCorEscama());

        goldfish.locomover();
        goldfish.alimentar();
        goldfish.emitirSom();
        goldfish.soltarBolha();


       
        System.out.println("\n===== CADASTRO DA ARARA =====");

        System.out.print("Peso: ");
        double pesoArara = scanner.nextDouble();

        System.out.print("Idade: ");
        int idadeArara = scanner.nextInt();

        System.out.print("Quantidade de membros: ");
        int membrosArara = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Cor da pena: ");
        String corPenaArara = scanner.nextLine();

        Arara arara = new Arara(
                pesoArara,
                idadeArara,
                membrosArara,
                corPenaArara
        );

        System.out.println("\n--- Dados da Arara ---");
        System.out.println("Peso: " + arara.getPeso());
        System.out.println("Idade: " + arara.getIdade());
        System.out.println("Membros: " + arara.getMembros());
        System.out.println("Cor da pena: " + arara.getCorPena());

        arara.locomover();
        arara.alimentar();
        arara.emitirSom();
        arara.fazerNinho();


        scanner.close();
    }
}