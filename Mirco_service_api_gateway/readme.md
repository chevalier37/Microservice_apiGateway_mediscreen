# Api Gateway
> Point d'entrée unique de l'application

> Port d'écoute : 8080

## Table of contents
* [General info](#general-info)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Setup](#setup)
* [Features](#features)
* [Status](#status)


## General info
Le fichier Docker Compose se trouve dans ce microservice.


## Technologies
* Java


## Setup
Eureka se trouve sur le port 9102

## Code Examples
Pour lancer le fichier docker-compose.yml faire :
`docker-compose up`

## Features
Liste des endpoints disponibles :
* Voir la page pour ajouter un patient -> GET : /patient/add
* Ajouter un patient -> POST : /patient/validate
* Voir la liste de tous les patients -> GET : /patient/list
* Voir la page pour modifier un patient -> GET : /patient/update/{patientId}
* Modifier un patient -> POST : /patient/update/{patientId}
* Voir les informations d'un patient -> GET : /patient/{patientId}
* Voir la liste des note d'un patient -> GET : /patient/note/{patientId}
* Voir la page pour ajouter une note à un patient -> GET : /patient/addNotes/{patientId}
* Ajouter une note à un patient -> POST : /patient/addNotes/{patientId}
* Voir la page pour mettre à jour une note -> GET : /patient/updateNote/{idNote}/{patientId}}
* Mettre à jour une note -> POST : /patient/updateNote/{idNote}

## Status
Project is: _finished_

