@Proprietes
Feature: Propriétés affichées et exportées
  Background:
    Given je connecte tant qu'un admin
    And je clique sur le lien voir tout
    And je clique sur la rubrique Propriétés affichées et exportées  de la zone lattérale Résultats de recherche

    Scenario: Modification des propriétés d'un type crée
      And je clique sur l'icône Modifier en survolant sur un type
      And j'ai fait un drag and drop pour choisir les propriétés sélectionnées
      Then le message Champs mis à jour avec succès s'affiche
      And j'ai effectué un recherche sur un document du type choisi
      Then les propriétés sélectionnées s'affichent

    Scenario: Modification des propriétés d'un type contenu
    And je clique sur l'icône Modifier en survolant sur un type contenu
    And j'ai fait un drag and drop pour choisir les propriétés sélectionnées
    Then le message Champs mis à jour avec succès s'affiche
    And j'ai effectué un recherche sur un document du type contenu
    Then les propriétés sélectionnées s'affichent

    Scenario: Modification des propriétés d'un type dossier
    And je clique sur l'icône Modifier en survolant sur un type dossier
    And j'ai fait un drag and drop pour choisir les propriétés sélectionnées
    Then le message Champs mis à jour avec succès s'affiche
    And j'ai effectué un recherche sur un document du type dossier
    Then les propriétés sélectionnées s'affichent