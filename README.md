# TP2SIR
Ce projet s'appuie sur JPA pour faire l'implementation du model de données d'une application qui cherche à faire la comparaison de la consomation d'energie entre un utilisateur et ses amies, c'est-a-dire une espece de reseau social. Cette application utilise JPA avec l'implementation Hibernate et se connecte à une base de donnees MySQL.

### Instalation 

- Faire clone ou telecharger le projet dans un ordinateur.
- Le projet a été developpé avec eclipse comme IDE et maven pour la gestion de dependances et automatisation.
- Pour valider le checkstyle du projet lancer la commande ```mvn site ``` 
- Pour compiler les sources et generer un ficher Jar ```mvn compile assembly:single``` 
- Pour lancer l'application en ligne de commandes, il faut aller au dossier qui contient le fichier Jar previement genere et ecrire ```java -jar nomApp-jar-with-dependencies.jar```, il faut utiliser le jar qui a dans son nom la phrase jar-with-dependencies, car c'est ce jar qui contient les dependences requises pour faire marcher l'application


