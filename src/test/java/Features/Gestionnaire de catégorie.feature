
@Categorie
Feature: Gestionnaire de Catégorie
  Background:
    Given je connecte tant qu'un admin
    And je clique sur le lien voir tout
    And je clique sur la rubrique Gestionnaire de catégories de la zone lattérale Classification

  Scenario: Ajout Catégorie ayant un nom contenat que des chiffres
    And je clique sur l'icône Ajouter une catégorie en survolant sur Catégorie racine
    And j'ai saisi le nom de la catégorie
    And je clique sur le bouton Ok
    Then le message Catégorie ajoutée avec succès s'affiche

  Scenario: Ajout Catégorie ayant un nom contenant que des lettre
    And je clique sur l'icône Ajouter une catégorie en survolant sur Catégorie racine
    And j'ai saisi le nom de catégorie
    And je clique sur le bouton Ok
    Then le message Catégorie ajoutée avec succès s'affiche

  Scenario: Supprimer une catégorie
    And je survole sur une catégorie et je clique sur l'icône Supprimer la catégorie
    And je clique sur le bouton Supprimer du popup de validation de suppression
    Then le message Catégorie supprimée avec succès s'affiche

  Scenario: Modifier une catégorie
    And je survole sur une catégorie et je clique sur l'icône Editer une catégorie
    And je modifie le nom de la catégorie et je clique sur le bouton Enregistrer
    Then le message Nom de la catégorie modifié avec succès s'affiche

  Scenario: Ajouter sous catégorie

    And je survole sur une catégorie et je clique sur l'icône Ajouter une catégorie
    And j'ai saisi le nom de la sous catégorie
    And je clique sur Ok
    Then le message Catégorie ajoutée avec succès s'affiche













