Feature: Parcourir
  Background:
  Background:
    Given je connecte tant qu'un admin
    And je clique sur le lien voir tout
    And je clique sur la rubrique Groupe de la zone latérale groupe et utilisateurs
    And je clique sur le bouton parcourir

  Scenario:  Ajouter un groupe ayant un nom affiché invalid
    And je clique sur l'iône Nouveau groupe
    And j'ai rempli la formulaire avec <Identifiant> et <Nom affiché>
    Then la zone de texte du champ Nom affiché devient rouge
    And un message d'erreur le champ contient une erreur s'affichera en survolant sur la zone de texte du champ nom affiché


  Scenario:  Ajouter un groupe ayant un identifiant invalide
    And je clique sur l'iône Nouveau groupe
    And j'ai saisi <Identifiant> et <Nom affiché>
    Then la zone de texte du champ identifiant devient rouge
    And un message d'erreur le champ contient une erreur s'affichera en survolant sur la zone de texte du champ identifiant

  Scenario:  Ajouter un groupe ayant un idetifiant et Nom invalides
    And je clique sur l'iône Nouveau groupe
    And j'ai saisi les champs <Identifiant> et <Nom affiché>
    Then la zone de texte du champ identifiant et Nom deviennent rouge
    And un message d'erreur le champ contient une erreur s'affichera en survolant sur la zone de texte du champ identifiant et nom

  Scenario:  Ajouter un groupe ayant un identifiant existe déja
    And je clique sur l'iône Nouveau groupe
    And j'ai rempli<Identifiant> et <Nom affiché>
    And je clique sur le bouton Créer un groupe
    Then la zone de texte du champ identifiant devient rouge
    And un message d'erreur le groupe existe déja s'affichera


  Scenario:  Ajouter un groupe sans chef hiérarchique
    And je clique sur l'iône Nouveau groupe
    And j'ai rempli les champs <Identifiant> et <Nom affiché>
    And je clique sur le bouton Créer un groupe
    Then le message Succès de la création du nouveau groupe

  Scenario:  Ajouter un groupe en changeant le rôle par défaut
    And je clique sur l'iône Nouveau groupe
    And j'ai rempli le formulaire <Identifiant>, <Nom affiché>, <chef Hiérarchique> et <rôle>
    And je clique bouton Créer un groupe
    Then le message Succès de la création du nouveau groupe



   Scenario: Ajouter un sous groupe
     And je clique sur un groupe
     And je clique sur le bouton Nouveau sous groupe
     And les champs <Identifiant>, <Nom affiché> et <chef hiérarchique> sont remplis
     And je clique sur le bouton Créer un groupe
     Then le message Succès de la création du nouveau groupe

  Scenario: Ajouter un sous sous groupe
    And je clique sur un sous groupe
    And je clique sur Nouveau sous groupe
    And les champs <Identifiant>, <Nom affiché> et <chef hiérarchique> sont remplis
    And je clique sur le bouton Créer un groupe
    Then le message Succès de la création du nouveau groupe

  Scenario: Affecter un utilisateur à un groupe
    And je clique sur un groupe
    And je clique sur 'icône Ajouter un utilisateur
    And j'ai choisi un utilisateur
    Then le message Succès de l'ajout de l'utilisateur

  Scenario: Enlever un utilisateur
    And je clique sur un groupe
    And je survole sur un utiliseur
    And je clique sur l'icône Enlever l'utilisateur
    And je confirme la suppression
    Then le message Succès de la suppression de l'utilisateur

  Scenario:  Expoter le groupe
    And je clique sur un groupe and je clique sur l'icône Exporter le groupe
    Then le message Export terminé avec succès