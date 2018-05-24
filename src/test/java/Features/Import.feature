Feature: Export
  Background:
    Given je connecte tant qu'un admin
    And je clique sur le lien voir tout
    And je clique sur la rubrique Import de la zone latérale Outils
    Scenario: Importer un fichier dans l'entrepôt de type acp
      And j'ai choisi espace de destination cours par exemple
      And je clique sur le bouton Importer dans l'entrepôt
      And je clique sur le lien Sélectionner les fichiers à ajouter
      And j'ai choisi un fichier du type acp
      And je clique sur le bouton Importer
      And je consulte l'espace bibliothèque de documents
      And je consulte le dossier cours
      Then je dois trouver dans ce dossier un fichier du type acp
  Scenario: Importer un fichier dans l'entrepôt de type zip
    And j'ai choisi espace de destination cours par exemple
    And je clique sur le bouton Importer dans l'entrepôt
    And je clique sur le lien Sélectionner les fichiers à ajouter
    And j'ai choisi un fichier du type zip
    And je clique sur le bouton Importer
    And je consulte l'espace bibliothèque de documents
    And je consulte le dossier cours
    Then je dois trouver dans ce dossier un fichier du type zip