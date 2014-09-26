import  org.codehaus.groovy.grails.commons.ApplicationHolder

def config = ApplicationHolder.application.config
def abConfig = config?.grails?.resources?.angular?.bootstrap

modules = {

	'ui-bootstrap' {
        dependsOn(['angular', 'bootstrap-css'])
        resource ( abConfig?.uiBootstrapResource ?: [
                url:[plugin: 'angular-bootstrap', dir:'js/angular/ui-bootstrap', file:'ui-bootstrap-tpls-0.11.1.min.js'],
                exclude:'minify', disposition : "head",
                linkOverride: "http://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.11.1.min.js"]  )
    }

}
