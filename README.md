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
    
    GAME: Rock, Paper, Scissors
    Program arguments:
    Hello Tom !
    Hello Bot !
    1 Tom: ROCK vs Bot: PAPER
    Bot won
    2 Tom: ROCK vs Bot: PAPER
    Bot won
    3 Tom: ROCK vs Bot: SCISSOR
    Tom won
    4 Tom: ROCK vs Bot: ROCK
    Draw
    5 Tom: ROCK vs Bot: PAPER
    Bot won
    6 Tom: ROCK vs Bot: PAPER
    Bot won
    7 Tom: ROCK vs Bot: ROCK
    Draw
    8 Tom: ROCK vs Bot: SCISSOR
    Tom won
    9 Tom: ROCK vs Bot: PAPER
    Bot won
    10 Tom: ROCK vs Bot: PAPER
    Bot won
    11 Tom: ROCK vs Bot: SCISSOR
    Tom won
    12 Tom: ROCK vs Bot: PAPER
    Bot won
    13 Tom: ROCK vs Bot: ROCK
    Draw
    14 Tom: ROCK vs Bot: PAPER
    Bot won
    15 Tom: ROCK vs Bot: SCISSOR
    Tom won
    16 Tom: ROCK vs Bot: PAPER
    Bot won
    17 Tom: ROCK vs Bot: ROCK
    Draw
    18 Tom: ROCK vs Bot: SCISSOR
    Tom won
    19 Tom: ROCK vs Bot: SCISSOR
    Tom won
    20 Tom: ROCK vs Bot: SCISSOR
    Tom won
    21 Tom: ROCK vs Bot: ROCK
    Draw
    22 Tom: ROCK vs Bot: ROCK
    Draw
    23 Tom: ROCK vs Bot: ROCK
    Draw
    24 Tom: ROCK vs Bot: PAPER
    Bot won
    25 Tom: ROCK vs Bot: SCISSOR
    Tom won
    26 Tom: ROCK vs Bot: SCISSOR
    Tom won
    27 Tom: ROCK vs Bot: PAPER
    Bot won
    28 Tom: ROCK vs Bot: PAPER
    Bot won
    29 Tom: ROCK vs Bot: ROCK
    Draw
    30 Tom: ROCK vs Bot: SCISSOR
    Tom won
    31 Tom: ROCK vs Bot: SCISSOR
    Tom won
    32 Tom: ROCK vs Bot: ROCK
    Draw
    33 Tom: ROCK vs Bot: ROCK
    Draw
    34 Tom: ROCK vs Bot: PAPER
    Bot won
    35 Tom: ROCK vs Bot: PAPER
    Bot won
    36 Tom: ROCK vs Bot: ROCK
    Draw
    37 Tom: ROCK vs Bot: ROCK
    Draw
    38 Tom: ROCK vs Bot: PAPER
    Bot won
    39 Tom: ROCK vs Bot: PAPER
    Bot won
    40 Tom: ROCK vs Bot: SCISSOR
    Tom won
    41 Tom: ROCK vs Bot: SCISSOR
    Tom won
    42 Tom: ROCK vs Bot: ROCK
    Draw
    43 Tom: ROCK vs Bot: PAPER
    Bot won
    44 Tom: ROCK vs Bot: SCISSOR
    Tom won
    45 Tom: ROCK vs Bot: SCISSOR
    Tom won
    46 Tom: ROCK vs Bot: PAPER
    Bot won
    47 Tom: ROCK vs Bot: PAPER
    Bot won
    48 Tom: ROCK vs Bot: SCISSOR
    Tom won
    49 Tom: ROCK vs Bot: PAPER
    Bot won
    50 Tom: ROCK vs Bot: SCISSOR
    Tom won
    51 Tom: ROCK vs Bot: PAPER
    Bot won
    52 Tom: ROCK vs Bot: ROCK
    Draw
    53 Tom: ROCK vs Bot: SCISSOR
    Tom won
    54 Tom: ROCK vs Bot: SCISSOR
    Tom won
    55 Tom: ROCK vs Bot: PAPER
    Bot won
    56 Tom: ROCK vs Bot: PAPER
    Bot won
    57 Tom: ROCK vs Bot: ROCK
    Draw
    58 Tom: ROCK vs Bot: PAPER
    Bot won
    59 Tom: ROCK vs Bot: ROCK
    Draw
    60 Tom: ROCK vs Bot: SCISSOR
    Tom won
    61 Tom: ROCK vs Bot: PAPER
    Bot won
    62 Tom: ROCK vs Bot: PAPER
    Bot won
    63 Tom: ROCK vs Bot: ROCK
    Draw
    64 Tom: ROCK vs Bot: PAPER
    Bot won
    65 Tom: ROCK vs Bot: SCISSOR
    Tom won
    66 Tom: ROCK vs Bot: SCISSOR
    Tom won
    67 Tom: ROCK vs Bot: SCISSOR
    Tom won
    68 Tom: ROCK vs Bot: PAPER
    Bot won
    69 Tom: ROCK vs Bot: ROCK
    Draw
    70 Tom: ROCK vs Bot: PAPER
    Bot won
    71 Tom: ROCK vs Bot: PAPER
    Bot won
    72 Tom: ROCK vs Bot: ROCK
    Draw
    73 Tom: ROCK vs Bot: PAPER
    Bot won
    74 Tom: ROCK vs Bot: PAPER
    Bot won
    75 Tom: ROCK vs Bot: SCISSOR
    Tom won
    76 Tom: ROCK vs Bot: PAPER
    Bot won
    77 Tom: ROCK vs Bot: ROCK
    Draw
    78 Tom: ROCK vs Bot: SCISSOR
    Tom won
    79 Tom: ROCK vs Bot: ROCK
    Draw
    80 Tom: ROCK vs Bot: SCISSOR
    Tom won
    81 Tom: ROCK vs Bot: SCISSOR
    Tom won
    82 Tom: ROCK vs Bot: ROCK
    Draw
    83 Tom: ROCK vs Bot: ROCK
    Draw
    84 Tom: ROCK vs Bot: PAPER
    Bot won
    85 Tom: ROCK vs Bot: ROCK
    Draw
    86 Tom: ROCK vs Bot: SCISSOR
    Tom won
    87 Tom: ROCK vs Bot: ROCK
    Draw
    88 Tom: ROCK vs Bot: PAPER
    Bot won
    89 Tom: ROCK vs Bot: PAPER
    Bot won
    90 Tom: ROCK vs Bot: PAPER
    Bot won
    91 Tom: ROCK vs Bot: ROCK
    Draw
    92 Tom: ROCK vs Bot: SCISSOR
    Tom won
    93 Tom: ROCK vs Bot: PAPER
    Bot won
    94 Tom: ROCK vs Bot: PAPER
    Bot won
    95 Tom: ROCK vs Bot: ROCK
    Draw
    96 Tom: ROCK vs Bot: ROCK
    Draw
    97 Tom: ROCK vs Bot: ROCK
    Draw
    98 Tom: ROCK vs Bot: ROCK
    Draw
    99 Tom: ROCK vs Bot: ROCK
    Draw
    100 Tom: ROCK vs Bot: ROCK
    Draw
