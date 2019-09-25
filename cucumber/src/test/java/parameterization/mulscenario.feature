Feature: list of testers
in ordr to get the testers details
Scenario Outline: i am a tester
Given i am a "<Tester_Type>" tester
When i go to work
Then i "<Work_Output>" it
And my boss "<Boss_Action>" me

Examples:

| Tester_Type|Work_Output|Boss_Action|
|good        |complete   |salutes    |
|bad         |mess       | fires     |