@Logo
Feature: Logo
  Background:
    Given je connecte tant qu'un admin
    And je clique sur le lien voir tout
    And Cliquer sur la zone latérale Logo de la rubrique Apprance

     Scenario: Modification de logo avec un type différent d'image
       And je clique sur le bouton Nouveau document
       And j'ai choisi un fichier de type différent d'image
       Then le message Échec : error occured during upload of new content  s'affiche dans le popup

       Scenario: Modification de Logo avec un type image
         And je clique sur le bouton Nouveau document
         And j'ai choisi un fichier de type image
         And je clique sur le bouton Appliquer
         And je déconnecte
         Then page de login s'affiche avec le nouveau logo




