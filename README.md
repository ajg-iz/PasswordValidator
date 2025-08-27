# PasswordValidator
Java Klasse zum validieren von Passwörtern.
Kann als CLI mit oder ohne Parameter genutzt werden

## Default Policy:
- mindestens 8 Zeichen,
- mindestens eine Ziffer (0–9),
- Groß- und Kleinbuchstaben (beides muss vorkommen),
- nicht in einer Liste häufiger/schwacher Passwörter.
- mindestens ein Sonderzeichen !"§$%&/()=?²³¼½¬{[]},;.:+-*'#~|<>^°

## Requirements
- Java 24
- Maven 3 

## Build
```bash
git clone https://github.com/ajg-iz/PasswordValidator
cd PasswordValidator
mvn clean install
```