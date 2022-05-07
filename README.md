# Patrones de Diseño en Java

Este proyecto recoge los patrones de diseño más comunes
para explicarlos en español con ejemplos. Intenta explorar los patrones principales
e intenta ser un recurso que puede ayudar a esos desarrolladores y desarrolladoras que estan empezando a
descubrir estos mismos.

Este libro utiliza [mdBook](https://rust-lang.github.io/mdBook/index.html) y [PlantUML](https://plantuml.com/).

## Enlaces

A continuación se listan algunos enlaces que te ayudaran a ahondar en este tema:

- [refactoring.guru](https://refactoring.guru)
- [mcdonaldland.info](http://www.mcdonaldland.info/files/designpatterns/designpatternscard.pdf)
- [java-design-patterns.com](http://java-design-patterns.com/patterns/)
- [wikipedia](https://es.wikipedia.org/wiki/Patr%C3%B3n_de_dise%C3%B1o)

## Dependencias

- [java 11](https://www.java.com/en/download/)
- [docker](https://www.docker.com/)
- [docker compose](https://docs.docker.com/compose/cli-command/)


## Comandos de Desarrollo

> Debes tener instalado [rust](https://www.rust-lang.org/tools/install) y [PlantUML](https://plantuml.com/) primero.

Instalar `mdbook`:

```bash
cargo install mdbook
```

Correr servidor local:

```bash
mdbook serve --open
```

Compilar libro:

```bash
mdbook build
```

Correr pruebas:

```bash
./gradlew test
```

Compilar imagenes UML:

```bash
cd plantuml && plantuml */*.puml
```

## Con Docker

Crear la imagen de docker:

```bash
docker build -t sauljabin/java-design-patterns:latest -f docker/Dockerfile .
```

Correr libro ([abrir en el navegador](http://localhost)):

```bash
docker run --name java-design-patterns -d -p 80:80 sauljabin/java-design-patterns:latest
```