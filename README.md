# TP2SIR

Ce projet s'appuie sur JPA pour faire la mise en oeuvre du modelé de données d'une application qui cherche à faire la comparaison de la consommation d'énergie entre un utilisateur et ses amies, c'est-a-dire une espèce de réseau social. Cette application utilise JPA avec l'a distribution Hibernate et se connecte à une base de données MySQL.

### Installation 

- Faire clone ou télécharger le projet dans un ordinateur.
- Le projet a été développé avec eclipse comme IDE et maven pour la gestion de dépendances et automatisation.
- Pour valider le checkstyle du projet lancer la commande ```mvn site ```.
- Pour compiler les sources et générer un ficher Jar ```mvn compile assembly:single```.
- Pour lancer l'application en ligne de commandes, il faut aller au dossier qui contient le fichier Jar génère auparavant et écrire ```java -jar nomApp-jar-with-dependencies.jar```, il faut utiliser le jar qui a dans son nom la phrase jar-with-dependencies, car c'est ce jar qui contient les dépendances requises pour faire marcher l'application.


