@Contenu
Feature: Gestionnaire de contenu
  Background:
    Given je connecte tant qu'un admin
    And je clique sur le lien voir tout
    And Cliquer sur la zone latérale Eléménts supprimés de la rubrique Gestion de contenu

    Scenario: Restaurer un fichier
      And je survole le cursueur de la souris sur l'élément test.pdf et cliquer sur l'icône restaurer
      And le message Récupération réussie test.pdf s'affiche
      And le message Récupération réussie test.pdf s'affiche
      And je consulte l'espace bibliothèque de documents
      Then le document test.pdf est récupéré

    Scenario: Supprimer un élement
      And je survole le cursueur de la souris sur un élément et cliquer sur l'icône restaurer and je clique sur l'icône Supprimer
      Then le message Suppression réussie s'affiche