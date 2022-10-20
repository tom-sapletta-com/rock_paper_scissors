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
If you'd like to make changes and run all the tests...
```bash
./gradlew test
```

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


## Example
            
    ::::: START GAME : Rock, Paper, Scissors ::::::
    Hello Tom !
    Hello Bot !
    GAME with 100 rounds
    1 Tom: ROCK Bot: SCISSOR = Tom won
    2 Tom: ROCK Bot: ROCK = Draw
    3 Tom: ROCK Bot: PAPER = Bot won
    4 Tom: ROCK Bot: SCISSOR = Tom won
    5 Tom: ROCK Bot: SCISSOR = Tom won
    6 Tom: ROCK Bot: SCISSOR = Tom won
    7 Tom: ROCK Bot: PAPER = Bot won
    8 Tom: ROCK Bot: PAPER = Bot won
    9 Tom: ROCK Bot: PAPER = Bot won
    10 Tom: ROCK Bot: SCISSOR = Tom won
    11 Tom: ROCK Bot: SCISSOR = Tom won
    12 Tom: ROCK Bot: ROCK = Draw
    13 Tom: ROCK Bot: SCISSOR = Tom won
    14 Tom: ROCK Bot: ROCK = Draw
    15 Tom: ROCK Bot: ROCK = Draw
    16 Tom: ROCK Bot: PAPER = Bot won
    17 Tom: ROCK Bot: PAPER = Bot won
    18 Tom: ROCK Bot: ROCK = Draw
    19 Tom: ROCK Bot: ROCK = Draw
    20 Tom: ROCK Bot: SCISSOR = Tom won
    21 Tom: ROCK Bot: SCISSOR = Tom won
    22 Tom: ROCK Bot: ROCK = Draw
    23 Tom: ROCK Bot: ROCK = Draw
    24 Tom: ROCK Bot: SCISSOR = Tom won
    25 Tom: ROCK Bot: PAPER = Bot won
    26 Tom: ROCK Bot: PAPER = Bot won
    27 Tom: ROCK Bot: PAPER = Bot won
    28 Tom: ROCK Bot: PAPER = Bot won
    29 Tom: ROCK Bot: ROCK = Draw
    30 Tom: ROCK Bot: PAPER = Bot won
    31 Tom: ROCK Bot: ROCK = Draw
    32 Tom: ROCK Bot: SCISSOR = Tom won
    33 Tom: ROCK Bot: SCISSOR = Tom won
    34 Tom: ROCK Bot: ROCK = Draw
    35 Tom: ROCK Bot: SCISSOR = Tom won
    36 Tom: ROCK Bot: ROCK = Draw
    37 Tom: ROCK Bot: PAPER = Bot won
    38 Tom: ROCK Bot: ROCK = Draw
    39 Tom: ROCK Bot: SCISSOR = Tom won
    40 Tom: ROCK Bot: SCISSOR = Tom won
    41 Tom: ROCK Bot: SCISSOR = Tom won
    42 Tom: ROCK Bot: ROCK = Draw
    43 Tom: ROCK Bot: ROCK = Draw
    44 Tom: ROCK Bot: ROCK = Draw
    45 Tom: ROCK Bot: PAPER = Bot won
    46 Tom: ROCK Bot: ROCK = Draw
    47 Tom: ROCK Bot: SCISSOR = Tom won
    48 Tom: ROCK Bot: SCISSOR = Tom won
    49 Tom: ROCK Bot: SCISSOR = Tom won
    50 Tom: ROCK Bot: PAPER = Bot won
    51 Tom: ROCK Bot: PAPER = Bot won
    52 Tom: ROCK Bot: PAPER = Bot won
    53 Tom: ROCK Bot: ROCK = Draw
    54 Tom: ROCK Bot: ROCK = Draw
    55 Tom: ROCK Bot: ROCK = Draw
    56 Tom: ROCK Bot: ROCK = Draw
    57 Tom: ROCK Bot: ROCK = Draw
    58 Tom: ROCK Bot: SCISSOR = Tom won
    59 Tom: ROCK Bot: ROCK = Draw
    60 Tom: ROCK Bot: SCISSOR = Tom won
    61 Tom: ROCK Bot: SCISSOR = Tom won
    62 Tom: ROCK Bot: SCISSOR = Tom won
    63 Tom: ROCK Bot: PAPER = Bot won
    64 Tom: ROCK Bot: SCISSOR = Tom won
    65 Tom: ROCK Bot: PAPER = Bot won
    66 Tom: ROCK Bot: PAPER = Bot won
    67 Tom: ROCK Bot: ROCK = Draw
    68 Tom: ROCK Bot: PAPER = Bot won
    69 Tom: ROCK Bot: SCISSOR = Tom won
    70 Tom: ROCK Bot: PAPER = Bot won
    71 Tom: ROCK Bot: ROCK = Draw
    72 Tom: ROCK Bot: SCISSOR = Tom won
    73 Tom: ROCK Bot: SCISSOR = Tom won
    74 Tom: ROCK Bot: SCISSOR = Tom won
    75 Tom: ROCK Bot: SCISSOR = Tom won
    76 Tom: ROCK Bot: SCISSOR = Tom won
    77 Tom: ROCK Bot: SCISSOR = Tom won
    78 Tom: ROCK Bot: ROCK = Draw
    79 Tom: ROCK Bot: SCISSOR = Tom won
    80 Tom: ROCK Bot: SCISSOR = Tom won
    81 Tom: ROCK Bot: SCISSOR = Tom won
    82 Tom: ROCK Bot: SCISSOR = Tom won
    83 Tom: ROCK Bot: PAPER = Bot won
    84 Tom: ROCK Bot: ROCK = Draw
    85 Tom: ROCK Bot: PAPER = Bot won
    86 Tom: ROCK Bot: ROCK = Draw
    87 Tom: ROCK Bot: ROCK = Draw
    88 Tom: ROCK Bot: PAPER = Bot won
    89 Tom: ROCK Bot: PAPER = Bot won
    90 Tom: ROCK Bot: PAPER = Bot won
    91 Tom: ROCK Bot: PAPER = Bot won
    92 Tom: ROCK Bot: SCISSOR = Tom won
    93 Tom: ROCK Bot: PAPER = Bot won
    94 Tom: ROCK Bot: PAPER = Bot won
    95 Tom: ROCK Bot: ROCK = Draw
    96 Tom: ROCK Bot: SCISSOR = Tom won
    97 Tom: ROCK Bot: PAPER = Bot won
    98 Tom: ROCK Bot: PAPER = Bot won
    99 Tom: ROCK Bot: PAPER = Bot won
    100 Tom: ROCK Bot: SCISSOR = Tom won
    ::::: GAME OVER : Rock, Paper, Scissors ::::::
