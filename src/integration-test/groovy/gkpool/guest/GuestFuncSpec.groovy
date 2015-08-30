package gkpool.guest

import gkpool.GKPoolFuncSpec
import grails.test.mixin.integration.Integration

/**
 * Created by kktec on 8/28/15.
 */
@Integration
class GuestFuncSpec extends GKPoolFuncSpec {

    def 'the default entry point is the Guest Welcome page'() {
        when:
        go ''

        then:
        at WelcomePage
        title == "Ken's Pools - Welcome"
    }

    def 'can go to Sign In'() {
        when:
        to WelcomePage
        signIn.click()

        then:
        at SignInPage
    }

    def 'can go to Sign Up'() {
        when:
        to WelcomePage
        signUp.click()

        then:
        at SignUpPage
    }
}
