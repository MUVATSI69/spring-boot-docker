# Étape 1 : Utiliser une image Maven pour construire le JAR
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app

# Copier les fichiers de configuration Maven et le code source
COPY pom.xml .
COPY src ./src

# Compiler le projet et générer le JAR
RUN mvn clean package -DskipTests

# Étape 2 : Utiliser une image Java pour exécuter l'application
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copier le JAR généré depuis l'étape de compilation
COPY --from=build /app/target/*.jar app.jar

# Exposer le port utilisé par l'application
EXPOSE 8080

# Commande pour exécuter le JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
