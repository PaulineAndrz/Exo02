package fr.banque;

public class Run {
    public static void main(String[] args) {
        Compte compte1 = new Compte(400.00, 2423424);
        Compte compte2 = new Compte(700.00, 2243245);


        Client client1 = new Client("toto", "tata", 43, 678);
        Client client2 = new Client("titi", "tata", 45, 670);

        System.out.println(client1);
        client1.ajouterCompte(compte1);
        System.out.println(client1.toString());

        System.out.println(client2);
        client2.ajouterCompte(compte2);
        System.out.println(client2);
    }
}
