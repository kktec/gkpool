package gkpool.guest

import geb.Page

/**
 * Created by kktec on 8/30/15.
 */
class SignInPage extends Page {

    static url = 'guest/signIn'

    static at = { title == "Ken's Pools - Sign In" }

    static content = {
        heading { $('heading') }
    }
}
