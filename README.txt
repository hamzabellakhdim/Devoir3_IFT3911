Pour démarrer le logiciel, il faut exécuter le fichier 'Main_View.java' (qui contient la fonction main).

Le logiciel est implémenté tel que demandé dans la consigne, c'est-à-dire sans "base de données principale" mais en utilisant des collections au sein des 
gestionnaires.

Avant de pouvoir manipuler des entités, il faut d'abord les créer en tant qu'administrateur (ou client dans le cas de manipulation de réservation ou de profils
client).
Dans le cas des Voyages, une liste de voyages a déjà été implémentée à l'initialisation du logiciel, car une fois qu'on rentre dans le volet admin ou client 
ce n'est plus possible de revenir dans le menu principal (Main_View) sans fermer le logiciel, ce qui aura pour conséquence d'effacer tous les changements 
effectués.

Le code utilise beaucoup de "switch() case" car c'est un prototype moyenne fidélité qu'on ne prévoit pas d'agrandir dans le futur.