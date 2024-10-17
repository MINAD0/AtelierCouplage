# Instanciation dynamique :

## Nous avons utilisé une factory pour permettre à l'application de choisir entre deux implémentations de DAO (accès aux données) :
 ### EtudiantDAO (avec une liste)
 ### EtudiantDAODictionary (avec un dictionnaire).
 ### L'utilisateur peut définir quel type de stockage utiliser via une simple chaîne de caractères (list ou map), ce qui rend l'application plus flexible.
