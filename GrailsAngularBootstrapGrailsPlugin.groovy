class GrailsAngularBootstrapGrailsPlugin {

    def version = "0.1"
    def grailsVersion = "2.3 > *"    
    def title = "Grails Angular Bootstrap Plugin" // Headline display name of the plugin
    def author = "Alessandro Berbenni"
    def authorEmail = "aberbenni@gmail.com"
    def description = '''\
Brief summary/description of the plugin.
'''
    def documentation = "https://github.com/aberbenni/grails-angular-bootstrap"
    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"
    // Details of company behind the plugin (if there is one)
//    def organization = [ name: "My Company", url: "http://www.my-company.com/" ]
    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

	def issueManagement = [ system: "github", url: "https://github.com/aberbenni/grails-angular-bootstrap/issues/" ]
	def scm = [ url: "https://github.com/aberbenni/grails-angular-bootstrap" ]


    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { ctx ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
