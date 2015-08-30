package gkpool

/**
 * Created by kktec on 8/28/15.
 */
class GuestController {

    def welcome() {
        render view: 'welcome', model: [title: 'Welcome']
    }

    def signIn() {
        render view: 'signIn', model: [title: 'Sign In']
    }

    def signUp() {
        render view: 'signUp', model: [title: 'Sign Up']
    }

    def wtf() {
        throw new IllegalArgumentException('wtf')
    }
}
