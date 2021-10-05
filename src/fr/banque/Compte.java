package fr.banque;

public class Compte {
    private Double solde;
    private Integer numero = 0;

    public Compte() {
        this.numero++;
    }

    public Compte(Double solde, Integer numero) {
        this.solde = solde;
        this.numero = numero;
    }

    public Double getSolde() {
        return solde;
    }

    private void setSolde(Double solde) {
        this.solde = solde;
    }

    public Integer getNumero() {
        return numero;
    }

    private void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "solde=" + solde +
                ", numero=" + numero +
                '}';
    }

    public void ajouter(Double n) {
        this.setSolde(this.getSolde() + n);
    }

    public void retirer(Double n) {
        this.setSolde(this.getSolde() - n);
    }
}
