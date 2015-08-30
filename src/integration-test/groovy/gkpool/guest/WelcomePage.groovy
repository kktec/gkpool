package gkpool.guest

import geb.Page

/**
 * Created by kktec on 8/28/15.
 */
class WelcomePage extends Page {

    static url = 'guest/welcome'

    static at = { title == "Ken's Pools - Welcome" }

    static content = {
        heading { $('heading') }
        signIn { $('#signIn') }
        signUp { $('#signUp') }
    }
}
