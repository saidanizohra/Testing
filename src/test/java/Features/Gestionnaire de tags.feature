Feature: Gestionnaire de tags
  Background:
    Given je connecte tant qu'un admin
    And je clique sur le lien voir tout
    And je clique sur la rubrique Gestionnaire de tags de la zone lattérale Classification

  Scenario: Modifier le tag
    And je clique sur l'icône Modifier le tag en survolant sur un tag
    And je modifie le nom du tag par tag
    And je clique sur le bouton Ok du popup
    Then le message Tag mis à jour - les tags mis à jour peuvent temporairement disparaitre des résultats de recherche pour cause de réindexations'affiche
    And je consulte l'espace bibliothèque de documents
    And je vérifie si le tag attaché au document se modifie aussi

  Scenario: Recherche tous les tags
    And j'ai saisi "*" dans la zone de recherche
    And je clique sur le bouton Rechercher
    Then tous les tags s'affiche

  Scenario: Recherche particulière

    And j'ai saisi un mot dans la zone de recherche
    And je clique sur le bouton Rechercher
    Then le tag souhaité est affiché



