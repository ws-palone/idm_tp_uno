# idm_tp_uno
## Author: Arthur Poilane

---


## Feature Model 
![alt text](https://github.com/ws-palone/idm_tp_uno/blob/main/idm_tp_uno_feature_model/idm_uno_feature_model.png "Feature Model")

_Représentation du feature model du jeu de Uno_

#### Combien y a-t-il de variantes du Uno ?
Il n'existe pas de nombre définies de variantes. Chacun peut imaginer de nouvelles règles donnant naissance à de nouvelles façons de jouer. De plus il est possible de combiner plusieurs variantes de jeu. Dans le feature model ci-dessus 6 d'entre elles sont représentées (il en existe bien évidemment beaucoup plus).


## Grammaire Xtext

Cette grammaire reprend le feature model du dessus:

```
grammar org.xtext.example.mydsl.MyDsl with org.eclipse.xtext.common.Terminals

generate myDsl "http://www.xtext.org/example/mydsl/MyDsl"

Uno:
    'UNO' 'game:' game=ID 'numberOfPlayers:' players=INT '{' rules=Rules '}';

Rules:
    'Rules' '{' ((Original  Semicolon) | (variants+=Variant+Semicolon)+) '}';

Semicolon:
    ';';

Original:
    original = 'Original';

Variant:
    Challenge | CardsEffect | Interception | CumulatingMalus | HandsDown | WithoutMalus;

Challenge:
    challenge = 'Challenge' 'numberOfPoints='? points=INT?;

CardsEffect:
    'CardsEffect:' '(' (effects+=Effect+Semicolon?)+ ')';

Effect:
    (card0 = 'card0' | card7 = 'card7');

Interception:
    interception = 'Interception';

CumulatingMalus:
    'CumulatingMalus:' '(' (malus+=Malus+Semicolon?)+ ')';

Malus:
    (plus2 = '+2' | plus4 = '+4');

HandsDown:
    handsdown = 'HandsDown';

WithoutMalus:
    withoutMalus = 'WithoutMalus';
```

#### Exemples d'application de la grammaire

Les règles de base du uno:

```
UNO game:game1 numberOfPlayers:4 {
    Rules {
        Original;
    }
}
```

Exemple avec quelques variantes du uno:

```
UNO game:game1 numberOfPlayers:4 {
    Rules {
        Challenge numberOfPoints=600;
        CardsEffect:
            (card0; card7;);
        Interception;
    }
}
```
note: Ici les contraintes présentes dans le feature model ne sont pas exprimées.


## Json Schema

#### Le schema json est disponible dans le dossier jsonSchema de ce projet. Voici des exemples de configurations possibles:

La configuration permettant de jouer au jeu de base (on n'ajoute pas de variantes):
```
{
    "Uno": {
        "gameId": "game mode 1",
        "numberOfPlayers": 5
    }
}
```

Une configuration avec différentes variantes:
```
{
    "Uno": {
        "gameId": "game mode 1",
        "numberOfPlayers": 5,
        "Variants": {
            "Challenge": {
                "points": 500
            },
            "CardsEffect": {
                "card0": true,
                "card7": true
            },
            "Intercepetion": true,
            "CumulatingMalus": {
                "plus2": true,
                "plus4": false
            },
            "HandsDown": true,
            "WithoutMalus": false
        }
    }
}
```

Une configuration fausse:
```
{
    "Uno": {
        "gameId": "game mode 1"
    }
}

//Required properties are missing from object: numberOfPlayers.
```
## Questions :

#### Q4: On souhaite écrire un générateur de règles Uno (pour fournir à des joueurs en début de partie, par exemple pour éviter tout conflit). Comment développeriez-vous ce générateur avec le FM de la Q1, le DSL de la Q2, et le JSON de la Q3?
- Pour le FM il est possible de développer un programme avec un parser XML Java comme JDOM par exemple. En ajoutant une configuration du feature model en entrée de ce programme celui serait capable d'extraire les informations de chaque feature pour en générer le texte décrivant la règle associée. Le texte peut être générer dans un fichier texte extérieur pour en faciliter la lecture et conserver une trace des règles pour une configuration précise.
- Pour le DSL il faut développer un parser de ce DSL car il n'existe pas d'outils permettant d'extraire la donnée d'un language que l'on a créé. Une fois cette étape effectué nous pouvons suivre la même démarche que pour le FM à savoir générer le texte des règles avec un programme à partir des données extraites de la configuration du DSL.
- Pour le JSON on peut facilement utiliser des librairies java ou même python pour extraire les données que l'on souhaite du fichier de configuration json. Il faut ensuite générer du texte à l'aide d'un programme et le sauvegarder dans un fichier extérieur comme pour le FM.

#### Q5: On souhaite transformer un programme écrit dans votre DSL (cf Q2) en fichier JSON (et vice-versa). Comment développeriez-vous cette transformation? 
Pour développer cette transformation il faut créer un compilateur qui se chargera de convertir chaque élément de mon language DSL en élément Json et inversement. Pour ce faire il faut déjà avoir un DSL et un json schema qui puissent contenir exactement les mêmes paramètres pour garantir qu'une convertion reconvertit dans son language initial soit identique. 
