package org.example;

import org.example.dao.Etudiant;
import org.example.metier.EtudiantManager;

public class Main {
    public static void main(String[] args) {
        String type = "map";

        EtudiantManager etudiantManager = new EtudiantManager(type);

        Etudiant e1 = new Etudiant(1, "Dupont", "jean.dupont@mail.com");
        Etudiant e2 = new Etudiant(2, "Martin", "marie.martin@mail.com");
        Etudiant e3 = new Etudiant(3, "Durand",  "pierre.durand@mail.com");
        Etudiant e4 = new Etudiant(4, "Bernard",  "julie.bernard@mail.com");

        etudiantManager.addEtudiant(e1);
        etudiantManager.addEtudiant(e2);
        etudiantManager.addEtudiant(e3);
        etudiantManager.addEtudiant(e4);

        System.out.println("List des etudiants: ");
        for (Etudiant etudiant : etudiantManager.getEtudiantlist()){
            System.out.println(etudiant.getNom() + " " + etudiant.getEmail());
        }

    }
}