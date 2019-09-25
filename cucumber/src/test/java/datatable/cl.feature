Feature: Eating fruits
this explains about the fruits

 Scenario Outline: Eating
 
 Given There are "<start>" fruits
 |type|with|
 |apple|me|
 |orange|john|
 When i eat "<eat>" fruits
 Then i have "<left>" fruits
 
 Examples:
 
 |start|eat|left|
 |12   |3  |4   |
 |1    |4  |6   |