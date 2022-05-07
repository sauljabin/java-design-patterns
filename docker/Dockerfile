FROM peaceiris/mdbook:latest AS builder
WORKDIR /java-design-patterns
COPY book.toml /java-design-patterns/book.toml
COPY md /java-design-patterns/md
RUN mdbook build

FROM nginx
COPY --from=builder /java-design-patterns/book /usr/share/nginx/html
