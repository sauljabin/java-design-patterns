file=*/*

clean:
	@./gradlew clean

test:
	@./gradlew clean cleanTest test

uml:
	@cd plantuml && java -jar plantuml.jar $(file).puml
