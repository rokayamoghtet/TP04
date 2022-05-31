# TP04   Le problème d’arbitrage Moghtet Rokia Groupe5
L’arbitrage est une stratégie de trading consistant à acheter et vendre simultanément un actif financier dans le but de réaliser un profit. Explications.
Acheter et vendre simultanément le même actif peut sembler absurde, et pourtant, il s’agit là d’une des stratégies de trading les plus utilisées par les traders professionnels. Et pour cause, cette approche permet en théorie de réaliser des gains « sans risque ».

Qu’est-ce qu’un arbitrage ?
Un arbitrage est une opération financière qui consiste à acheter et vendre simultanément deux actifs identiques ou similaires afin de profiter des imperfections des marchés financiers.

D’après l’Hypothèse d’efficience des marchés, chaque actif financier serait toujours valorisé à son juste prix compte tenu de l’information disponible. Pourtant, à très court terme, il arrive d’observer de très légères différences de prix entre deux actifs côtés sur deux places boursières différentes. Ces petits écarts sont précisément les opportunités d’arbitrage chassées par les traders et leurs algorithmes.

En effet, confronté à deux actifs identiques aux prix différents, l’arbitragiste peut acheter l’actif le moins cher tout en vendant simultanément l’actif le plus cher afin de réaliser un profit sans avoir à s’exposer aux fluctuations des marchés financiers.

Les risques cachés de l’arbitrage:

*Le principe de l’arbitrage et ses trades « sans risque » pourraient ressembler à l’Eldorado du trader. Il existe malheureusement quelques difficultés techniques à surmonter et quelques risques cachés dont il faut se méfier.

*Le principal risque de l’arbitrage consiste à confondre une opportunité avec une prime de risque. En effet, les situations dans lesquelles s’achètent et se vendent deux actifs identiques ou similaires ne sont jamais exactement les mêmes. D’une place boursière à l’autre, la liquidité des actifs peut varier, tout comme les nombreuses conditions de négociation imposées par la chambre de compensation ou les conventions cadres (marge, livraison, etc). La différence de prix observée pourrait donc n’être qu’une prime de risque.

*Le risque de l’arbitrage est également lié directement à l’exécution des trades. Repérer une anomalie de marché est une chose, être en capacité de l’exploiter en est une autre. La plupart des anomalies de marché sont minimes et éphémères. Pour pouvoir les exploiter de façon rentable, il faut donc disposer de gros moyens techniques, généralement réservés aux professionnels les plus aguerris. En effet, le moindre décalage entre l’achat et la vente censés être simultanés est un risque car le prix des actifs peut tout à fait poursuivre son évolution au cours de ces quelques nanosecondes et exposer le trader à un risque nouveau.

Dès qu’une anomalie de marché est exploitée par un trader, le prix de l’actif acheté monte et celui de l’actif vendu baisse, jusqu’à ce que l’anomalie soit corrigée. Avec l’avènement du trading haute fréquence, les opportunités d’arbitrage sont donc de plus en plus éphémères et de plus en plus complexes à détecter.

Si par le passé, des opportunités d’arbitrage évidentes pouvaient apparaître avec des actions cotées à différents prix d’une place boursière à l’autre, désormais il s’agit souvent d’opportunités bien plus complexes faites d’arbitrage triangulaires, de taux d’intérêts, et de produits dérivés complexes.

Ces informations sont produites par CMC Markets. Elles présentent un caractère purement informatif, elles ne constituent pas un conseil en investissement, ni une recommandation d’achat ou de vente d’instruments financiers ou de la recherche en investissement. Cette communication n'a pas été élaborée conformément aux dispositions réglementaires visant à promouvoir l'indépendance des analyses financières et à interdire d'effectuer des transactions sur l'instrument concerné avant la diffusion de la communication Ces informations vous sont fournies à titre indicatif et pourraient ne pas être actualisées. Elles peuvent être amenées à changer sans avertissement préalable. Les anticipations, projections ou objectifs mentionnés sont présentés à titre indicatif et ne sont en aucun cas garantis. CMC ne saurait être tenu responsable s’ils n'étaient pas réalisés ou atteints.

CMC Markets est un prestataire de service d'exécution uniquement. Ces informations (qu'elle contiennent ou non des opinions) présentent un caractère purement informatif et ne tient pas compte de votre situation ou de vos objectifs personnels. Aucune des informations contenues dans ce document n'est (ou ne doit être considérée comme) un conseil financier, d'investissement ou autre auquel se fier. Aucun avis donné dans les documents ne constitue une recommandation de CMC Markets ou de l'auteur selon laquelle un investissement, un titre, une transaction ou une stratégie d'investissement particulier convient à une personne spécifique. Le matériel n'a pas été préparé conformément aux exigences légales visant à promouvoir l'indépendance de la recherche sur les marchés d'investissement. Bien qu'il ne nous soit pas expressément interdit de traiter avant de fournir ce matériel, nous ne cherchons pas à en tirer profit avant sa diffusion.

Resumé:

Problème d'arbitrage de devises L'arbitrage est le processus d'utilisation des écarts dans les valeurs de change pour réaliser des bénéfices. Considérez une personne qui commence avec une certaine quantité de devise X, passe par une série d'échanges et se retrouve finalement avec plus de quantité de X (qu'elle n'en avait initialement).
Étant donné n devises et un tableau (nxn) de taux de change, concevez un algorithme qu'une personne devrait utiliser pour profiter d'un profit maximum en supposant qu'elle n'effectue pas un échange plus d'une fois.
Algorithme d'ici :
Nous pouvons utiliser l'algorithme BellMan-Ford pour résoudre ce problème.
Pour exécuter, vous avez besoin d'installer JDK et JRE, puis vous pouvez l'exécuter par javac main.java et java main dans le terminal ubuntu Ou vous pouvez l'ouvrir avec certaines applications graphiques comme NetBeans ou Eclipse.
