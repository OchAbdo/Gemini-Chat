# 🤖 Gemini API Consumer 

Une application Spring Boot qui consomme l'API Gemini de Google pour envoyer des prompts et recevoir des réponses basées sur l'intelligence artificielle.

## 🚀 Fonctionnalités

- Envoi de prompts à l'API Gemini
- Réception et affichage de la réponse générée par l'IA
- Application RESTful

## 🧰 Stack Technique

- Java 17
- Spring Boot 3
- Spring Web (REST Controller)
- Bibliothèque HTTP :`WebClient`
- [Google Gemini API](https://ai.google.dev/)

## 🔑 Prérequis

- Compte Google avec accès à l'API Gemini
- Obtenir une clé API sur [Google AI Studio](https://makersuite.google.com/app)
- Java 17
- Maven

## ⚙️ Configuration

Dans le fichier `application.properties` :

```properties
gemini.api.key=YOUR_GOOGLE_API_KEY
gemini.api.url=https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent
