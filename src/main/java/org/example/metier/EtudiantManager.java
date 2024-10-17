package org.example.metier;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAO;
import org.example.dao.IEtudiantDAO;
import org.example.presentation.EtudiantDaoFactory;

import java.util.List;

public class EtudiantManager {
    public IEtudiantDAO iEtudiantDAO;
    public EtudiantManager(String type){
        iEtudiantDAO = EtudiantDaoFactory.getEtudiantDAO(type);
    }
    public Etudiant addEtudiant(Etudiant etudiant){
        for (Etudiant e : iEtudiantDAO.getAllEtudiants()){
            if (e.getEmail().equals(etudiant.getEmail())){
                System.out.println("email deja utiliser");
                return null;
            }
        }
        return iEtudiantDAO.addEtudiant(etudiant);
    }

    public List<Etudiant> getEtudiantlist(){
        return iEtudiantDAO.getAllEtudiants();
    }
}
