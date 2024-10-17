package org.example.dao;

import java.util.List;

public interface IEtudiantDAO {
    Etudiant addEtudiant(Etudiant etudiant);
    List<Etudiant> getAllEtudiants();
}
