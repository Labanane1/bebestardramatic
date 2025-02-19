/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bebestardramatic.Beans;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named("welcomeBean")
@ViewScoped
public class WelcomeBean implements Serializable {

    private String nom;
    private String message;

    public void afficherMessage() {
        message = "selamat datang, " + nom + "!";
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getMessage() { return message; }
}
