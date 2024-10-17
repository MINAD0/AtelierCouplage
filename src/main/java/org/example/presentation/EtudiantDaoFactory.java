package org.example.presentation;

import org.example.dao.EtudiantDAO;
import org.example.dao.EtudiantDAODictionary;
import org.example.dao.IEtudiantDAO;

public class EtudiantDaoFactory {

    public static IEtudiantDAO getEtudiantDAO(String type){
        if (type.equalsIgnoreCase("list")){
            return new EtudiantDAO();
        } else if (type.equalsIgnoreCase("map")) {
            return new EtudiantDAODictionary();
        }
        throw new IllegalArgumentException("Type dao inconnu: " + type);
    }
}
