Grails Angular Bootstrap
========================

Grails resources plugin for Ui Bootstrap modules made with AngularJS like UI-Bootstrap http://angular-ui.github.io/bootstrap/ and AngularUI http://angular-ui.github.io/

## Install

In BuildConfig.groovy
```
        runtime ":angular-bootstrap:0.1"
```

## Work in progress

This is a work in progess at the moment

## Grails Plugins

This project makes use of these plugins:

* [Grails AngularJS Resources Plugin](https://github.com/smartiniOnGitHub/grails-angularjs-resources)

## Override Resources Definition

Optionally you may define one of the following in Config.groovy
```
grails.resources.angular.bootstrap.uiBootstrapResource = [
    url:[plugin: 'angular-ui-bootstrap', dir:'js/angular', file:'ui-bootstrap-tpls-0.11.1.min.js'],
    exclude:'minify', disposition : "head", linkOverride: "http://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.11.1.min.js"]
```

This will be useful if you need to use angular-bootstrap javascript that is different from the one packaged in the plugin.

## Notes

This work is based on [grails-angularjs-ui-bootstrap](https://github.com/arief-hidayat/grails-angularjs-ui-bootstrap) by [arief hidayat](https://github.com/arief-hidayat) 