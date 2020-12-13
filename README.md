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
    'UNO' 'game' game=ID '{' rules=Rules '}';

Rules:
    'Rules' '{' (Original | (variants+=Variant+Coma)+) '}';

Coma:
    ',';

Original:
    'Original';

Variant:
    Challenge | CardsEffect | Interception | CumulatingMalus | HandsDown | WithoutMalus;

Challenge:
    'Challenge';

CardsEffect:
    'CardsEffect:' + ('card0' | 'card7' | 'card0AndCard7');

Interception:
    'Interception';

CumulatingMalus:
    'CumulatingMalus:' + ('onlyPlus2' | 'onlyPlus4' | 'plus2AndPlus4');

HandsDown:
    'HandsDown';

WithoutMalus:
    'WithoutMalus';
```

#### Exemples d'application de la grammaire

Les règles de base du uno:

```
UNO game règleDeBase {
  Rules {
    Original
  }
}
```

Des variantes du uno:

```
UNO game variants {
  Rules {
    Challenge,
    CardEffects:card0,
    Interception,
    CumulatingMalus:onlyPlus2,
  }
}
```


