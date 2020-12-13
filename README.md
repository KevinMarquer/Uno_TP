
#Kévin MARQUER

##TP UNO


###Q1:

Pour ce qui est du nombre de combinaison possible, c'est un peu délicat à trouvé.
Pour le cas de la partie UnoClassique il y a 23 règles et sans prendre en compte le nombre de joueurs, in n'est pas possible de prédire exactement le nombre de cas possible.
Si je vais dans configs/default.xml, il me donne plus de 5000 combinaisons possibles, ce qui est un peu exagéré.
Pour les autre règles spéciales, UnoRapido et UnoWizz ne dépende que du nombre de joueur (7 combinaisons).
Pour UnoOlympique, il a 4 combinaisons (sans prendre on compte les joueur vue q'il a deux règles qui sont en options.




###Q4:

Pour la génération de règle de Uno.
À partir de Feature Model :
Je lirai le fichier xml à partir de :

```java
File xmlFile = new File("info.xml");
        
        Reader fileReader = new FileReader(xmlFile);
        BufferedReader bufReader = new BufferedReader(fileReader);
        
        StringBuilder sb = new StringBuilder();
        String line = bufReader.readLine();
        while( line != null){
		//...
	}
```
on lit ensuite chaque ligne et dès qu'on atteint la balise avec le nom de la règle voulut, on la prends (on la prends obligatoirement si elle est obligatoire), tout en rajoutant des conditions pour prendre celle qui sont associé (l'une des règle de GameOver par exemple).



À partir du DSL:


À partir du JSON:

Comme pour xml, on lit ligne par ligne et on selectionne aléatoirement se qu'on veut prendre comme règle.

###Q5:

En lisant ligne par ligne le fichier du programme écrit par notre DSL et en le convertissant en fichier json (et inversement).
Par example:

dans le fichier json, dès qu'on aura la ligne avec dedans "name":
on créer à partir du nom puis dans le "tableau" on sélectionne les règles dont la valeur est à true.

Et pour le langage aux fichier json:
on prend le premier mots qui correspond à la règle choisit, on créer alors la balise { "name":xxxx ...
puis on créer la suite de règle "rules": que l'on remplis de toutes les règles du Uno choisit et si cette règle est présente dans le fichier de notre langage alors on le met à true (false sinon).
