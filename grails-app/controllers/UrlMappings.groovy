class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        '/'(redirect: '/guest/welcome')
        '500'(view: '/error')
        '404'(view: '/notFound')
    }
}
