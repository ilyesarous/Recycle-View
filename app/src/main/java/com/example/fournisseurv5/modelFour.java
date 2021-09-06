package com.example.fournisseurv5;

public class modelFour {
    private String date,echéance,fournisseurid,montant,nom,solde;

    public modelFour() {

    }

    public modelFour(String date, String echéance, String fournisseurid, String montant, String nom, String solde) {
        this.date = date;
        this.echéance = echéance;
        this.fournisseurid = fournisseurid;
        this.montant = montant;
        this.nom = nom;
        this.solde = solde;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEchéance() {
        return echéance;
    }

    public void setEchéance(String echéance) {
        this.echéance = echéance;
    }

    public String getFournisseurid() {
        return fournisseurid;
    }

    public void setFournisseurid(String fournisseurid) {
        this.fournisseurid = fournisseurid;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String monrant) {
        this.montant = montant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSolde() {
        return solde;
    }

    public void setSolde(String solde) {
        this.solde = solde;
    }
}
