# Scanner - a lexical analyser
This project is designed to create the first part of a computer compiler. It's a project for INE5426, a Computer Science course at UFSC.

## Prerequisites
- Java 8 or greater
- `make`

## Tools and Libraries
- Gradle
- ANTLR
- j-text-utils

## Commands
After you `clone` the repo, you can run the following commands.

If you want to download the dependencies, build the application and prepare the environment you can simply run:
```
$ make
```

If you want to run the application, you can run the following command with the path to file with `.ccc` extension:
```
$ make run <file>.ccc
```
It will analyse the source code from file and it will output a token list and a symbol table.

For cleaning your environment and removing all build files, you can simply run:
```
$ make clean
```

## TODO

- [X] Makefile
- [X] Lexical Analysis
- [ ] Syntactic Analysis
- [ ] Symbol table with scope analysis
- [ ] Translation to other programing languages

