package org.example.dao;
import java.util.ArrayList;
import java.util.List;


public class EtudiantDAO implements IEtudiantDAO{
    public List<Etudiant> etudiantlist = new ArrayList();

//    public Etudiant AddEtudiant(Etudiant etudiant){
//        etudiantlist.add(etudiant);
//        return etudiant;
//    }
//
//    public List<Etudiant> getEtudiantlist(){
//        return etudiantlist;
//    }


    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantlist.add(etudiant);
        return etudiant;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantlist;
    }
}
