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


If you'd like to make changes and run all the tests...
```bash
./gradlew test
```

Or, if you'd like to run the tests on a specific class...
```bash
./gradlew -Dtest.single=ClassToTest test
```

## Run app
```bash
java -jar gradle/wrapper/gradle-wrapper.jar
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
                "PAPER
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
