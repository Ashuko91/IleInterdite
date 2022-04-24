# L'IleInterdite

Projet POGL réalisé par SARTIAUX Lilian et RIBEIRO David, Groupe 2.

Nous avons traités les trois premières parties : On va se la couler douce, Non pas la trempette et Sa place est dans un musée.

Nous avons organisé le projet en 3 packages : modele, Vue et Observer.
Package modele contient 6 classes :
- Artefact : Contient la création d'un artéfact.
- Cle : Contient la création des clés.  
- Controleur : Contient tous les boutons du jeu.
- Ile : Contient la construction de la grille et plusieurs méthodes.
- Joueur :  Contient la création des joueurs et leurs méthodes.
- Zone : Contient la création des cases et leurs méthodes.

Package Vue contient 2 classes :
- Vue : Elle sert à créer la fenêtre et à ajouter à celle-ci tous les éléments graphiques.
- IleVue : Elle dessinne la grille, les joueurs et les artefacts.

Package Observer contient 2 classes :
-Observer, Observable : Ces deux classes sont extraites du fichier Conway.java.

La Classe Jeu contient le main qui éxécute le jeu.

Lilian s'est occupé de la gestion des relations entre les artefacts, les joueurs et leurs comportements.
David s'est occupé de la partie visuel, de l'affichage des différents éléments du projet.
Nous avons réalisé la partie du controleur et la création de l'ile ensemble. 


Difficultées : 
1. Nous avons eu du mal au début à afficher la grille dans la fenêtre.
2. Le bouton Assèche fonctionne mais n'assèche pas la zone ou se trouve le joueur.
3. Le bouton Rammasser fonctionne mais ne rammasse pas les bons artéfacts.
4. Les clés ne sont pas liées correctement aux artefacts.
