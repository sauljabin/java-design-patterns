# Acerca de este Libro 

Este libro utiliza [mdBook](https://rust-lang.github.io/mdBook/index.html) y [PlantUML](https://plantuml.com/).

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