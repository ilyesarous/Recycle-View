package com.example.fournisseurv5;

public class modelClient {
    private String montant,nom,réglé,solde,date,clientid,echéance;

    public modelClient() {
    }

    public modelClient(String montant, String nom, String réglé, String solde, String date, String clientid, String echéance) {
        this.montant = montant;
        this.nom = nom;
        this.réglé = réglé;
        this.solde = solde;
        this.date = date;
        this.clientid = clientid;
        this.echéance = echéance;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRéglé() {
        return réglé;
    }

    public void setRéglé(String réglé) {
        this.réglé = réglé;
    }

    public String getSolde() {
        return solde;
    }

    public void setSolde(String solde) {
        this.solde = solde;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getEchéance() {
        return echéance;
    }

    public void setEchéance(String echéance) {
        this.echéance = echéance;
    }
}
