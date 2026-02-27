# Transport Manager

## Description

Transport Manager est un programme Java qui permet de calculer le nombre de voyages nécessaires pour déménager un certain nombre de cartons à l’aide d’un camion ayant une capacité donnée.

L’utilisateur doit saisir :

- Le nombre total de cartons à transporter
- La capacité du camion (nombre de cartons par voyage)

Le programme affiche ensuite :

- Chaque voyage effectué
- Le nombre total de voyages nécessaires

---

## Fonctionnement

1. Le programme demande le nombre de cartons.
2. Il vérifie que la valeur saisie est bien un nombre.
3. Il demande la capacité du camion.
4. Il vérifie également cette saisie.
5. Il calcule les voyages nécessaires.
6. Il affiche le détail de chaque voyage.
7. Il affiche le nombre total de voyages effectués.

---

## Lancer le programme

### Avec IntelliJ

1. Ouvrir le projet.
2. Exécuter la classe `TransportManager`.
3. Saisir les valeurs demandées dans la console.

### Avec le terminal

```bash
javac TransportManager.java
java TransportManager