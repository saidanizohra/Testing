Feature: Ajouter utilisateur
  Background:
    Given je connecte tant qu'un admin
    And je clique sur le lien voir tout
    And je clique sur l'icôneajouter utilisateur

    Scenario: Ajouter User avec remplissage que les champs obligatoires
      And j'ai rempli les champs <Prénom>, <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe>
      And je clique sur le bouton Créer un utilisateur
      Then le message Succès de la création d'un nouvel utilisateur s'affiche

      Scenario: Ajouter un utilisateur avec un prénom invalide
        And j'ai saisi le champ Prénom contenant des caractères spécifiques
        And j'ai rempli les champs  <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe>
        Then la zone de texte devient rouge
        And le message <le champ contient une erreur s'affiche>

        Scenario: ne remplir pas les champs obligatoires
           And j'ai rempli le champ <nom>
           Then la zone de texte de prénom devient rouge
           And le message <Une valeur doit être indiquée> s'affiche

          Scenario: Ajouter un utilisateur avec un email invalid
            And J'ai rempli <prénom>, <nom>, <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe>
            Then la zone de texte du champ <Email> devient rouge
            And le message <le champ contient une erreur s'affiche> dans la zone de texte Email

            Scenario: Ajouter unn utilisateur avec Nom utilisateur contient des caractères spécifiques
              And J'ai rempli <prénom>, <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe>
              Then la zone de texte du champ <Nom d'utilisateur > devient rouge
              And le message <La valeur contient des caractères illégaux pour un nom> s'affiche

              Scenario: Ajouter un utilisateur ayant un nom d'utilisateur contient un seul caractère
                And J'ai rempli <prénom>, <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe> du formulaire
                Then la zone de texte du champ <Nom d'utilisateur > devient rouge
                And le message <La valeur inclut un nombre de caractères incorrect> s'affiche

         Scenario: Ajouter un utilisateur ayant un mot de passe incorrect
           And j'ai saisi les champs <Prénom>, <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe>
           Then la zone de texte mot de passe devient rouge
           And le messgae La valeur inclut un nombre de caractères incorrect s'affiche

           Scenario: Ajout utilisateur avec un nom et prénom contenant des chiffres
             And J'ai rempli le formulaire <prénom>, <nom>, <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe>
             Then la zone de texte du champ prénom et nom deviennent rouges
             And le message <le champ contient une erreur> s'affiche dans la de texte prénom et nom

         Scenario: Ajouter un utilsateur
           And j'ai rempli formulaire
           And je clique sur le bouton Créer un utilisateur
           Then le message Succès de la création d'un nouvel utilisateur s'affiche

        Scenario: Ajouter utilisateur avec un email existe déjà
  Scenario: Ajouter User avec remplissage que les champs obligatoires
    And j'ai rempli le formulaire par <Prénom>, <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe>
    Then le message Un compte avec le même e-mail existe déjà s'affiche


























