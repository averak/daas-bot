# DaaS Bot

![build](https://github.com/averak/daas-bot/workflows/build/badge.svg)
![test](https://github.com/averak/daas-bot/workflows/test/badge.svg)
![Version 1.0](https://img.shields.io/badge/version-1.0-yellow.svg)
[![MIT License](http://img.shields.io/badge/license-MIT-blue.svg?style=flat)](LICENSE)
[![Twitter](https://img.shields.io/badge/Twitter-%40rits_dajare-blue?style=flat-square&logo=twitter)](https://twitter.com/rits_dajare)

This app is a bot of DaaS (Dajare as a Service).

## Develop

### Requirements

- Java OpenJDK 11
- docker-compose

### How to run

`$ java -jar daas-bot-<version>.jar`

### How to run on dev environment

1. Clone this repository
2. Run `$ cd daas-bot`
3. Run `$ docker-compose up -d`
4. Run application
   - macOS or Linux: `$ ./gradlew bootRun`
   - Windows: `$ ./gradlew.bat bootRun`

### How to build

1. Run `$ cd daas-bot`.
2. Run build
   - macOS or Linux: `$ ./gradlew build`
   - Windows: `$ ./gradlew.bat build`
3. When build successful, you can find .jar file in `app/build/libs`

### API docs

This project support Swagger UI.

1. Run application
2. Access to [Swagger UI](http://localhost:8080/swagger-ui.html)

## References

- [立命館ダジャレサークル](https://rits-dajare.github.io/)
- [DaaS (Dajare as a Service)](https://github.com/rits-dajare/DaaS)
