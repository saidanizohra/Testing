Feature: groupe

  Background:
    Given je connecte tant qu'un admin
    And je clique sur le lien voir tout
    And je clique sur la rubrique Groupe de la zone latérale groupe et utilisateurs


  Scenario:  Ajouter un groupe ayant un nom affiché invalid
    And je clique sur l'icône ajouter un groupe
    And j'ai rempli la formulaire avec <Identifiant> et <Nom affiché>
    Then la zone de texte du champ Nom affiché devient rouge
    And un message d'erreur le champ contient une erreur s'affichera en survolant sur la zone de texte du champ nom affiché

  Scenario:  Ajouter un groupe ayant un identifiant invalide
    And je clique sur l'icône ajouter un groupe
    And j'ai saisi <Identifiant> et <Nom affiché>
    Then la zone de texte du champ identifiant devient rouge
    And un message d'erreur le champ contient une erreur s'affichera en survolant sur la zone de texte du champ identifiant

  Scenario:  Ajouter un groupe ayant un idetifiant et Nom invalides
    And je clique sur l'icône ajouter un groupe
    And j'ai saisi les champs <Identifiant> et <Nom affiché>
    Then la zone de texte du champ identifiant et Nom deviennent rouge
    And un message d'erreur le champ contient une erreur s'affichera en survolant sur la zone de texte du champ identifiant et nom

  Scenario:  Ajouter un groupe ayant un identifiant existe déja
    And je clique sur l'icône ajouter un groupe
    And j'ai rempli<Identifiant> et <Nom affiché>
    And je clique sur le bouton Créer un groupe
    Then la zone de texte du champ identifiant devient rouge
    And un message d'erreur le groupe existe déja s'affichera


  Scenario:  Ajouter un groupe sans chef hiérarchique
    And je clique sur l'icône ajouter un groupe
    And j'ai rempli les champs <Identifiant> et <Nom affiché>
    And je clique sur le bouton Créer un groupe
    Then le message Succès de la création du nouveau groupe

  Scenario:  Ajouter un groupe en changeant le rôle par défaut
    And je clique sur l'icône ajouter un groupe
    And j'ai rempli le formulaire <Identifiant>, <Nom affiché>, <chef Hiérarchique> et <rôle>
    And je clique sur le bouton Créer un groupe
    Then le message Succès de la création du nouveau groupe

  Scenario: Modifier un groupe

    And j'ai saisi "*" dans la zone de texte
    And je clique sur le bouton Rechercher
    And je survole sur un groupe et je clique sur l'icône Modifier
    And j'ai mofifié <Identifiant>, <Rôle> et <chef hiérarchique>
    And je clique sur le bouton Enregistrer Les modifications
    Then le message Succès de la mise à jour s'affiche

  Scenario: Importer La liste de groupe
    And je clique sur l'icône Importer la liste de groupe
    And je clique sur Sélect.fichiers du popup
    And j'ai choisi un fichier du type json
    And je clique sur Confirmer
    Then Succès de l'import du groupe

  Scenario: Exporter les groupes
    And je clique sur l'icône Exporter les groupes
    And le popup Export en cours s'affiche
    Then le message Succes de l'export s'affiche














