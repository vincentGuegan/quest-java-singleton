# Challenge

#### Desperate Friend

Un ami développeur, désespéré, vient te voir : il doit créer une application permettant de retirer et ajouter de l'argent sur un compte bancaire, grâce à un  _singleton_. À la fin du programme, il doit afficher le total du compte en banque.

Malheureusement, ton ami n'a pas bien compris comment les  _singletons_  marchent. Quand il exécute son code, il obtient le message d'erreur suivant :

```java
Exception in thread "main" java.lang.NullPointerException
        at Singleton.withdraw(Singleton.java:21)
        at Transactions.transactions(Transactions.java:7)
        at Main.main(Main.java:8)

```

Un collègue de ton ami a commenté son code, afin de lui montrer que son implémentation de  `Singleton`  est mauvaise. De plus, il manque l'appel du  _singleton_  à l'affichage de la balance du compte.



1.  Ouvre les classes  `Main`,  `Singleton`,  `Bank`  et  `Transactions`  afin d'en étudier les contenus respectifs.
2.  Dans  `Singleton.java`, modifie l'implémentation du  _singleton_  dans la méthode  `getInstance`, afin de le rendre fonctionnel
3.  Dans  `Transactions.java`, modifie la méthode  `balance`  afin d'appeler le  _singleton_  et récupérer et afficher le total du compte bancaire
4.  Compile et exécute la classe  `Main`, afin de vérifier que le résultat est bien celui attendu

Résultat attendu lors de l'exécution de  `Main`  :

```
$ Your balance is: 8720

```

#### Critères de validation

-   Seuls les fichiers  `Singleton.java`  et  `Transactions.java`  doivent avoir été modifiés.
-   La classe  `Main`  se compile sans erreur et affiche dans le terminal le même résultat que celui présenté précédemment.