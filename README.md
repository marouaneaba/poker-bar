# Poker-Bar

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

# Module architecture (DDD / Clean archi):
![img](https://github.com/marouaneaba/poker-bar/blob/develop/shema-module-projet.png)




This project present in two versions:

Version 1 Modular functional orientation:
  - Common
  - beer
  - coffee
  - .....
    
Version 2 en micro service.

# New Features!

  - Public trello: https://trello.com/b/jYAfTZwv/poker-bar
  - Import a HTML file and watch it magically convert to Markdown
  - Drag and drop images (requires your Dropbox account be linked)


You can also:
  - Import and save files from GitHub, Dropbox, Google Drive and One Drive
  - Drag and drop markdown and HTML files into Dillinger
  - Export documents as Markdown, HTML and PDF

Markdown is a lightweight markup language based on the formatting conventions that people naturally use in email.  As [John Gruber] writes on the [Markdown site][df1]

> The overriding design goal for Markdown's
> formatting syntax is to make it as readable
> as possible. The idea is that a
> Markdown-formatted document should be
> publishable as-is, as plain text, without
> looking like it's been marked up with tags
> or formatting instructions.

This text you see here is *actually* written in Markdown! To get a feel for Markdown's syntax, type some text into the left window and watch the results in the right.

### Tech

Dillinger uses a number of open source projects to work properly:

* [Angular] - HTML enhanced for web apps!
* [Spring] - 
* [Keycloak] -
* [Atom] - 
* [Inttelij] - 
* [Boostrap] - 
* [Saas/Css3] - 
* [Docker] - 
* [AWS] - 
* [Jenkins] - 
* [Sonar] - 
* [Github] - 
* [Ace Editor] - awesome web-based text editor
* [markdown-it] - Markdown parser done right. Fast and easy to extend.
* [Twitter Bootstrap] - great UI boilerplate for modern web apps
* [node.js] - evented I/O for the backend
* [Express] - fast node.js network app framework [@tjholowaychuk]
* [Gulp] - the streaming build system
* [Breakdance](https://breakdance.github.io/breakdance/) - HTML to Markdown converter
* [jQuery] - duh
* [semVer] - Gestion sémantique version Git.

And of course Dillinger itself is open source with a [public repository][dill]
 on GitHub.

### Installation

Dillinger requires [Node.js](https://nodejs.org/) v4+ to run.

Install the dependencies and devDependencies and start the server.

```sh
$ cd dillinger
$ npm install -d
$ node app
```

For production environments...

```sh
$ npm install --production
$ NODE_ENV=production node app
```

### Plugins

Dillinger is currently extended with the following plugins. Instructions on how to use them in your own application are linked below.

| Plugin | README |
| ------ | ------ |
| Dropbox | [plugins/dropbox/README.md][PlDb] |
| GitHub | [plugins/github/README.md][PlGh] |
| Google Drive | [plugins/googledrive/README.md][PlGd] |
| OneDrive | [plugins/onedrive/README.md][PlOd] |
| Medium | [plugins/medium/README.md][PlMe] |
| Google Analytics | [plugins/googleanalytics/README.md][PlGa] |

### Git:

Our project uses continuous delivery, each feature finished and respecting the definition of done must go directly into production to speed up our time to market, so we use the git-hub flow.

[Git-hub flow] is a method for managing branches in a project with the use of git.
There is no need to create or manage several branches.

Our realization goes directly to the production (market), we do not use the delivery by peroid, suddenly we do not have a process "the RELEASE / vX.YZ branch" which must be validated and stabilized so that it is available in the production.

We do not use any process between the finished realization (DoD) and production, we use CI / CD.

This project use the semantic management version : [semVer](https://semver.org/lang/fr/) 

Generate the .gitignore, ignore the files to push into remote git [.gitIgnore genérateur](https://www.toptal.com/developers/gitignore) 

Delete files ignored by git in the local : 
```
# git clean -Xdf .
```

### Development

Want to contribute? Great!

Dillinger uses Gulp + Webpack for fast developing.
Make a change in your file and instantaneously see your updates!

Open your favorite Terminal and run these commands.

First Tab:
```sh
$ node app
```

Second Tab:
```sh
$ gulp watch
```

(optional) Third:
```sh
$ karma test
```

### Intégration continue:
#### Sonar:
L'objetif du [Sonar](https://sonarcloud.io/organizations/marouaneaba/projects) [lien vers sonar du projet](https://sonarcloud.io/organizations/marouaneaba/projects) c'est de donné des notification au développeur, des amélioration à faire dans le code.
Sonar permet de controller la qualité du code à livrer avant de l'intégrer dans le projet ( duplication, code smile/compléxité du code, couverture du code, recherche des bugs).

- Sonar utilisé dans l'integration continue pour check le code avant de l'intégrer dans le projet
- Sonar utilisé dans les checks de la PR dans partie Check, un rapport sonar générer dans la PR.
- SoanrLint plugin d'IDE code local pour vérifier la structure du code avant de créer une PR et livrer.

#### Building for source
For production release:
```sh
$ gulp build --prod
```
Generating pre-built zip archives for distribution:
```sh
$ gulp build dist --prod
```
### Docker
Dillinger is very easy to install and deploy in a Docker container.

By default, the Docker will expose port 8080, so change this within the Dockerfile if necessary. When ready, simply use the Dockerfile to build the image.

```sh
cd dillinger
docker build -t joemccann/dillinger:${package.json.version} .
```
This will create the dillinger image and pull in the necessary dependencies. Be sure to swap out `${package.json.version}` with the actual version of Dillinger.

Once done, run the Docker image and map the port to whatever you wish on your host. In this example, we simply map port 8000 of the host to port 8080 of the Docker (or whatever port was exposed in the Dockerfile):

```sh
docker run -d -p 8000:8080 --restart="always" <youruser>/dillinger:${package.json.version}
```

Verify the deployment by navigating to your server address in your preferred browser.

```sh
127.0.0.1:8000
```
#### CHANGE LOG
See [CHANGELOG.md](https://github.com/marouaneaba/git-changelog/blob/develop/git-changelog)
Script to generate changelog -> https://github.com/marouaneaba/git-changelog/blob/develop/git-changelog

https://github.com/marouaneaba/git-changelog/blob/develop/git-changelog

#### Jenkins CI/CD
See [Jenkins.md](https://github.com/marouaneaba/CI-CD-Docker-Jenkins-Sonar)

#### Kafka
See [Kafka.md](https://github.com/kafka.md)

#### keycloak
See [Keycloak.md](https://github.com/keycloak.md)

#### Kubernetes
See [KUBERNETES.md](https://github.com/KUBERNETES.md)


### Todos

 - Write MORE Tests [TODO] (https://trello.com/b/jYAfTZwv/poker-bar)
 - Add Night Mode

License
----

MIT


**Free Software, Hell Yeah!**

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)


   [dill]: <https://github.com/joemccann/dillinger>
   [git-repo-url]: <https://github.com/joemccann/dillinger.git>
   [john gruber]: <http://daringfireball.net>
   [df1]: <http://daringfireball.net/projects/markdown/>
   [markdown-it]: <https://github.com/markdown-it/markdown-it>
   [Ace Editor]: <http://ace.ajax.org>
   [node.js]: <http://nodejs.org>
   [Twitter Bootstrap]: <http://twitter.github.com/bootstrap/>
   [jQuery]: <http://jquery.com>
   [@tjholowaychuk]: <http://twitter.com/tjholowaychuk>
   [express]: <http://expressjs.com>
   [AngularJS]: <https://angular.io/>
   [Gulp]: <http://gulpjs.com>
   [Git-hub flow]: <https://docs.github.com/en/free-pro-team@latest/github/collaborating-with-issues-and-pull-requests/github-flow>
   [semVer]: <https://semver.org/lang/fr/>

   [PlDb]: <https://github.com/joemccann/dillinger/tree/master/plugins/dropbox/README.md>
   [PlGh]: <https://github.com/joemccann/dillinger/tree/master/plugins/github/README.md>
   [PlGd]: <https://github.com/joemccann/dillinger/tree/master/plugins/googledrive/README.md>
   [PlOd]: <https://github.com/joemccann/dillinger/tree/master/plugins/onedrive/README.md>
   [PlMe]: <https://github.com/joemccann/dillinger/tree/master/plugins/medium/README.md>
   [PlGa]: <https://github.com/RahulHP/dillinger/blob/master/plugins/googleanalytics/README.md>
   
   
   
   N'hésite pas à me contacter à 'mar.Abakarim@gmail.com' pour toutes questions ou remarques, Merci.
