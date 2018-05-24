Feature: Export
  Background:
    Given je connecte tant qu'un admin
    And je clique sur le lien voir tout
    And je clique sur la rubrique Export de la zone latérale Outils
    Scenario: Export
      And j'ai saisi le nom de paquetage
      And j'ai choisi l'espace à exporter
      And j'ai choisi l'esapce de destination
      And je clique sur le bouton Exporter
      And je quitte espace export
      And je consulte l'espace bibliothèque de documents
      And je consulte le dossier test
      Then je dois trouver un fichier du type acp

      Scenario: Export sans choisir l'space à exporter
        And J'ai saisi le nom de paquetagee
        And j'ai choisi l'esapce de destination
        And je clique sur le bouton Exporter
        Then le message Une erreur inattendue s'est produite lors de l'extraction



