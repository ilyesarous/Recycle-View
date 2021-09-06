package com.example.fournisseurv5;

public class modelClient {
    private String montant,nom,regle,solde,date,clientid,echeance;

    public modelClient() {
    }

    public modelClient(String montant, String nom, String réglé, String solde, String date, String clientid, String echeance) {
        this.montant = montant;
        this.nom = nom;
        this.regle = regle;
        this.solde = solde;
        this.date = date;
        this.clientid = clientid;
        this.echeance = echeance;
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

    public String getRegle() {
        return regle;
    }

    public void setRegle(String regle) {
        this.regle = regle;
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

    public String getEcheance() {
        return echeance;
    }

    public void setEcheance(String echeance) {
        this.echeance = echeance;
    }
}
