# LecteurFichier
> Vincent RODRIGUEZ
## Lecteur de fichiers texte (.txt) :


L'Interface Lecteur définie trois fonctions :
* `charger()` permet de créer un StringBuffer avec le contenu du fichier
* `lire()` affiche le contenu du fichier .txt après l'avoir chargé
* `contenuComparaison()` affiche les lignes différentes entre deux fichiers après l'avoir chargé

La classe LectureDuFichier :
* implémente l'Interface Lecteur et définit les fonctions et les attributs communs aux autres classes

Les classes LecteurEndroit, LecteurEnvers, LecteurPalindromique, ComparateurFichiers :
* héritent toutes de LectureFichier, elle peuvent donc utiliser les fonctions de Lecteur qui n'ont pas été définies dans LectureDuFichier, et celles définies dans cette dernière
* Ont chacune leur propre fonction charger() qui charge un StringBuffer en fonction de l'affichage souhaité (palindromique, à l'envers etc).
* ComparateurFichiers permet de comparer deux fichiers .txt
