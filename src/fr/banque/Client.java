package fr.banque;

import java.util.Arrays;

public class Client {
    private String nom;
    private String prenom;
    private Integer age;
    private Integer numero;
    private Compte[] comptes = new Compte[5];

    public Client () {}

    public Client(String nom, String prenom, Integer age, Integer numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumero() {
        return numero;
    }

    private void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Compte[] getComptes() {
        return comptes;
    }

    public void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", comptes=" + Arrays.toString(comptes) +
                '}';
    }

    public void ajouterCompte(Compte compte) {
        for (int i =0; i < this.getComptes().length; i++) {
            if (this.getComptes()[i] == null ) {
                this.getComptes()[i] = compte;
                break;
            } else {
                System.out.println("Vous avez le nombre max de compte");
            }
        }
    }

    public void getCompte(Integer numero) {
        if (null != this.getComptes()) {
            for (Compte compte : this.getComptes()) {
                if (compte.getNumero().equals(numero)) {
                    System.out.println(compte.toString());
                    break;
                } else {
                    System.out.println("not found");
                }
            }
        } else {
            System.out.println("ce client n'a aucun compte");
        }


    }
}
