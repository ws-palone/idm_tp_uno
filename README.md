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
