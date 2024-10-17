package org.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EtudiantDAODictionary implements IEtudiantDAO{
    public Map<String,Etudiant> etudiantMap;

    public EtudiantDAODictionary(){
        etudiantMap = new HashMap<>();
    }

//    public Etudiant AddEtudiant(Etudiant etudiant){
//        etudiantMap.put(String.valueOf(etudiant.getId()),etudiant);
//        return etudiant;
//    }
//
//    public List<Etudiant> getEtudiantlist(){
//        return new ArrayList<>(etudiantMap.values());
//    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantMap.put(String.valueOf(etudiant.getId()),etudiant);
        return etudiant;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return new ArrayList<>(etudiantMap.values());
    }
}
