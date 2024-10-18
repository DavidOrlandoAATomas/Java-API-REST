# Santander BootCamp
Java RESTful API cirada para DIO java BootCamp.


##Diagrama de classes

```mermaid
classDiagram
    class Utilizador {
        +String name
        +Account account
        +Feature[] features
        +Card card
        +News[] news
    }

    class Account {
        +String agencia
        +String numero
        +float saldo
        +float limite
    }

    class Feature {
        +String icon
        +String descricao
    }

    class Card {
        +String numero
        +float limite
    }

    class News {
        +String icon
        +String descricao
    }

    Utilizador --> Account
    Utilizador --> Feature
    Utilizador --> Card
    Utilizador --> News
```
