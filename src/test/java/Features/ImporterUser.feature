@ImportUser
Feature: ImportUser
  Background:
    Given je connecte tant qu'un admin
    And je clique sur le lien voir tout


  Scenario: Importer un fichier de type json
    And je clique sur l'icône Importer des utilisateurs
    And je clique sur le bouton Sélect.fichiers du popup
    And j'ai choisi un fichier de type json
    And je clique sur le bouton confirmer du popup
    Then le message Succès de l'import s'affiche

   Scenario: Importer un fichier de type hors json
     And je clique sur l'icône Importer des utilisateurs
     And je clique sur le bouton Sélect.fichiers du popup
     And j'ai choisi un fichier de type hors json
     And je clique sur le bouton confirmer du popup
     Then le système reste dans la page principale de gestion des utilisateurs

  Scenario: Importer un fichier CSV qui respecte le modèle
    And je clique sur l'icône Importer un fichier CSV d'utilisateurs
    And je clique sur le bouton Choisir un fichier
    And j'ai choisi un fichier de type csv
    And je clique sur le bouton Ajouter

  Scenario: Télécharger un modèle de fichier d'import
    And je clique sur l'icône Télécharger un modèle de fichier d'import

  Scenario: Exporter des utilisateurs
    And je clique sur l'icône Exporter des utilisateurs
    And le popup Export en cours s'affiche
    Then le message Succes de l'export s'affiche







