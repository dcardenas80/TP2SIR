# TP2SIR DESIGN

La description de classes utilisées pour cette application sont distribuées en deux pacquages fr.istic.sir.tp2.model et jpa

## Pacquages 
### fr.istic.sir.tp2.model 
Dans ces pacquages on peut trouver les entités du modèle de base de données.
- ##### ElectronicDevice: un dispositif électronique qui se situe sur la maison.
- ##### Home: la maison où on trouve un ou plusieurs chauffages et dispositif électroniques.
- ##### Heater: un chauffage qui va être à la maison.
- ##### Person: une personne que peut avoir une ou plusieurs maisons et aussi une au plusieurs relations d'amitié avec d'autres personnes.

### JPA 
Dans ce pacquage on trouve l'entityManager et la classe charge de faire un test d'insertion et requêtes sur le modèle de données
- ##### EntityManager cette classe est charge d'appeler l'unité de persistance et aussi de créer l'entity manager qui sera charge de commencer les transactions, faire requêtes et faire commit.
- ##### JpaTest - cette classe est charge d'un petit test de création de personnes, maisons, chauffages et dispositif électroniques.


