

# Spring Boot Docker

## Description du projet
Ce projet est une application Spring Boot conteneurisée avec Docker.

## Cloner et exécuter l'application localement

### Prérequis
- **Docker** : Assurez-vous que Docker est installé sur votre machine. [Installation de Docker](https://docs.docker.com/get-docker/)
- **Git** : Pour cloner le dépôt. [Installation de Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

### Étapes pour cloner et exécuter l'application

1. **Clonez le dépôt Git** :
   ```bash
   git clone https://github.com/MUVATSI69/spring-boot-docker.git
   ```

2. Accédez au répertoire du projet :
   ```bash
   cd spring-boot-docker
   ```

3. **Construire l'image Docker** :
   - Si vous n'avez pas Docker installé, installez-le et assurez-vous que Docker fonctionne sur votre machine.
   - Construisez l'image Docker en utilisant le Dockerfile :
   ```bash
   docker build -t meskya/spring-boot-docker .
   ```

4. **Exécuter l'image Docker** :
   - Une fois l'image construite, lancez le conteneur Docker :
   ```bash
   docker run -d -p 8080:8080 meskya/spring-boot-docker:latest
   ```

5. **Accéder à l'application** :
   - L'application sera accessible à l'adresse [http://localhost:8080](http://localhost:8080).
   
   Vous pouvez tester les deux endpoints suivants :

   - **GET /api/hello** : Retourne un message simple.
     ```bash
     curl http://localhost:8080/api/hello
     ```
     Réponse attendue :
     ```json
     { "message": "Hello, DevOps!" }
     ```

   - **POST /api/echo** : Accepte un objet JSON et le renvoie tel quel.
     ```bash
     curl -X POST -H "Content-Type: application/json" \
     -d '{"key": "value"}' http://localhost:8080/api/echo
     ```
     Réponse attendue :
     ```json
     { "key": "value" }
     ```
