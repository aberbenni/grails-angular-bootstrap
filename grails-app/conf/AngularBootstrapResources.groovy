modules = {

	'angular-bootstrap' {
        dependsOn(['angular', 'bootstrap-css'])
        resource ( aubConfig?.angularBootstrapResource ?: [
                url:[plugin: 'angular-ui-bootstrap', dir:'js/angular/ui-bootstrap', file:'ui-bootstrap-tpls-0.11.1.min.js'],
                exclude:'minify', disposition : "head",
                linkOverride: "http://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.11.1.min.js"]  )
    }

}
