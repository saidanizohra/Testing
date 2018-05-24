Feature: Gestionnaire de tags
  Background:
    Given je connecte tant qu'un admin
    And je clique sur le lien voir tout
    And Cliquer sur la zone latérale Palette de couleur de la rubrique Apprance

    Scenario: Modification du thème
      And j'ai modifié le couleur de sous menu
      And j'ai modifié le couleur du texte
      And je clique Appliquer
      Then je vérifie si le couleur de sous menu change
      And je vérifie si le couleur du texte change

      Scenario: Réinialiser le thème par défaut
        And je clique sur le bouton Réinialiser le thème par défaut

        Then le couleur de sous menu se réinialise le thème par défaut
        And le couleur du texte se réinialise le thème par défaut



