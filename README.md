# [tom-sapletta-com/rock_paper_scissors](https://github.com/tom-sapletta-com/rock_paper_scissors)

shell app that plays multiple rounds of Rock, Paper, Scissors

+ [requirements](DOCS/requirements.md)
+ [todo list](DOCS/todo.md)
+ [tests](DOCS/tests.md)
+ [logic](DOCS/logic.md)
+ [config](DOCS/config.md)



# Getting Started

+ [install](DOCS/install.md)

```bash 
git clone https://github.com/tom-sapletta-com/rock_paper_scissors.git
cd rock_paper_scissors
```

## Test

Run all the tests...

```bash
./gradlew test --info
```

[test result](test.html)

## Run app
```bash
./gradlew run
```


## Code

[rock_paper_scissors/Main.kt at main](https://github.com/tom-sapletta-com/rock_paper_scissors/blob/main/src/main/kotlin/Main.kt)

```
GameHumanBot(
    Config(
        cycles=100
        bot_name: "Bot"
    ),
    StartGame(
        human_name: "Tom"
    ),  
    Results(
        Play(
            PlayerAction(
                "ROCK"
            ),
            PlayerAction(
                RandomAction()
            )
        ),
        Play(
            PlayerAction(
                "ROCK"
            ),
            PlayerAction(
                RandomAction()
            )
        ),
        ...
    ),
    GameOver(
        Results()
    )
)
```



## Example results

    ::::: START GAME : Rock, Paper, Scissors ::::::
    Hello Tom !
    Hello Bot !
    
    GAME with 100 rounds:
    1 Tom: ROCK Bot: ROCK = DRAW
    2 Tom: ROCK Bot: ROCK = DRAW
    3 Tom: ROCK Bot: SCISSOR = Tom WON!
    4 Tom: ROCK Bot: SCISSOR = Tom WON!
    5 Tom: ROCK Bot: ROCK = DRAW
    6 Tom: ROCK Bot: ROCK = DRAW
    7 Tom: ROCK Bot: PAPER = Bot WON!
    8 Tom: ROCK Bot: ROCK = DRAW
    9 Tom: ROCK Bot: PAPER = Bot WON!
    10 Tom: ROCK Bot: SCISSOR = Tom WON!
    11 Tom: ROCK Bot: PAPER = Bot WON!
    12 Tom: ROCK Bot: ROCK = DRAW
    13 Tom: ROCK Bot: SCISSOR = Tom WON!
    14 Tom: ROCK Bot: SCISSOR = Tom WON!
    15 Tom: ROCK Bot: ROCK = DRAW
    16 Tom: ROCK Bot: SCISSOR = Tom WON!
    17 Tom: ROCK Bot: ROCK = DRAW
    18 Tom: ROCK Bot: SCISSOR = Tom WON!
    19 Tom: ROCK Bot: PAPER = Bot WON!
    20 Tom: ROCK Bot: PAPER = Bot WON!
    21 Tom: ROCK Bot: SCISSOR = Tom WON!
    22 Tom: ROCK Bot: SCISSOR = Tom WON!
    23 Tom: ROCK Bot: PAPER = Bot WON!
    24 Tom: ROCK Bot: PAPER = Bot WON!
    25 Tom: ROCK Bot: PAPER = Bot WON!
    26 Tom: ROCK Bot: SCISSOR = Tom WON!
    27 Tom: ROCK Bot: ROCK = DRAW
    28 Tom: ROCK Bot: SCISSOR = Tom WON!
    29 Tom: ROCK Bot: ROCK = DRAW
    30 Tom: ROCK Bot: ROCK = DRAW
    31 Tom: ROCK Bot: ROCK = DRAW
    32 Tom: ROCK Bot: ROCK = DRAW
    33 Tom: ROCK Bot: SCISSOR = Tom WON!
    34 Tom: ROCK Bot: ROCK = DRAW
    35 Tom: ROCK Bot: ROCK = DRAW
    36 Tom: ROCK Bot: PAPER = Bot WON!
    37 Tom: ROCK Bot: PAPER = Bot WON!
    38 Tom: ROCK Bot: ROCK = DRAW
    39 Tom: ROCK Bot: SCISSOR = Tom WON!
    40 Tom: ROCK Bot: PAPER = Bot WON!
    41 Tom: ROCK Bot: SCISSOR = Tom WON!
    42 Tom: ROCK Bot: PAPER = Bot WON!
    43 Tom: ROCK Bot: ROCK = DRAW
    44 Tom: ROCK Bot: PAPER = Bot WON!
    45 Tom: ROCK Bot: PAPER = Bot WON!
    46 Tom: ROCK Bot: ROCK = DRAW
    47 Tom: ROCK Bot: PAPER = Bot WON!
    48 Tom: ROCK Bot: PAPER = Bot WON!
    49 Tom: ROCK Bot: PAPER = Bot WON!
    50 Tom: ROCK Bot: PAPER = Bot WON!
    51 Tom: ROCK Bot: PAPER = Bot WON!
    52 Tom: ROCK Bot: SCISSOR = Tom WON!
    53 Tom: ROCK Bot: SCISSOR = Tom WON!
    54 Tom: ROCK Bot: ROCK = DRAW
    55 Tom: ROCK Bot: SCISSOR = Tom WON!
    56 Tom: ROCK Bot: PAPER = Bot WON!
    57 Tom: ROCK Bot: SCISSOR = Tom WON!
    58 Tom: ROCK Bot: ROCK = DRAW
    59 Tom: ROCK Bot: SCISSOR = Tom WON!
    60 Tom: ROCK Bot: SCISSOR = Tom WON!
    61 Tom: ROCK Bot: PAPER = Bot WON!
    62 Tom: ROCK Bot: SCISSOR = Tom WON!
    63 Tom: ROCK Bot: ROCK = DRAW
    64 Tom: ROCK Bot: ROCK = DRAW
    65 Tom: ROCK Bot: PAPER = Bot WON!
    66 Tom: ROCK Bot: ROCK = DRAW
    67 Tom: ROCK Bot: ROCK = DRAW
    68 Tom: ROCK Bot: SCISSOR = Tom WON!
    69 Tom: ROCK Bot: PAPER = Bot WON!
    70 Tom: ROCK Bot: ROCK = DRAW
    71 Tom: ROCK Bot: ROCK = DRAW
    72 Tom: ROCK Bot: PAPER = Bot WON!
    73 Tom: ROCK Bot: PAPER = Bot WON!
    74 Tom: ROCK Bot: PAPER = Bot WON!
    75 Tom: ROCK Bot: SCISSOR = Tom WON!
    76 Tom: ROCK Bot: ROCK = DRAW
    77 Tom: ROCK Bot: SCISSOR = Tom WON!
    78 Tom: ROCK Bot: ROCK = DRAW
    79 Tom: ROCK Bot: PAPER = Bot WON!
    80 Tom: ROCK Bot: ROCK = DRAW
    81 Tom: ROCK Bot: PAPER = Bot WON!
    82 Tom: ROCK Bot: PAPER = Bot WON!
    83 Tom: ROCK Bot: SCISSOR = Tom WON!
    84 Tom: ROCK Bot: SCISSOR = Tom WON!
    85 Tom: ROCK Bot: SCISSOR = Tom WON!
    86 Tom: ROCK Bot: PAPER = Bot WON!
    87 Tom: ROCK Bot: ROCK = DRAW
    88 Tom: ROCK Bot: SCISSOR = Tom WON!
    89 Tom: ROCK Bot: SCISSOR = Tom WON!
    90 Tom: ROCK Bot: ROCK = DRAW
    91 Tom: ROCK Bot: ROCK = DRAW
    92 Tom: ROCK Bot: ROCK = DRAW
    93 Tom: ROCK Bot: PAPER = Bot WON!
    94 Tom: ROCK Bot: ROCK = DRAW
    95 Tom: ROCK Bot: SCISSOR = Tom WON!
    96 Tom: ROCK Bot: ROCK = DRAW
    97 Tom: ROCK Bot: PAPER = Bot WON!
    98 Tom: ROCK Bot: PAPER = Bot WON!
    99 Tom: ROCK Bot: ROCK = DRAW
    100 Tom: ROCK Bot: SCISSOR = Tom WON!
    
    RESULT COUNTER:
    User Tom won 31 times
    User Bot won 33 times
    Draw 36 times
    
    ::::: GAME OVER : Rock, Paper, Scissors ::::::


# DOCS

## What is Kotlin?

Kotlin is a statically type language on the JVM.

[Kotlin Programming Language](https://kotlinlang.org/)

## Code generator
Create ZIP package with generator of kotlin project

[Generate Ktor project](https://start.ktor.io/)

[Generate Example project](https://start.ktor.io/#/final?name=game&website=example.com&artifact=com.example.game&kotlinVersion=1.7.20&ktorVersion=2.1.2&buildSystem=GRADLE_KTS&engine=NETTY&configurationIn=CODE&addSampleCode=true&plugins=)


## Create project with InteliJ IDE

https://ktor.io/docs/getting-started-ktor-client.html#prerequisites

