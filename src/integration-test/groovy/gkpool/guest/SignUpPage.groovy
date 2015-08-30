package gkpool.guest

import geb.Page

/**
 * Created by kktec on 8/30/15.
 */
class SignUpPage extends Page {

    static url = 'guest/signUp'

    static at = { title == "Ken's Pools - Sign Up" }

    static content = {
        heading { $('heading') }
    }
}
