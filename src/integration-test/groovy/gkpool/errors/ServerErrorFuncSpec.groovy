package gkpool.errors

import gkpool.GKPoolFuncSpec
import grails.test.mixin.integration.Integration

/**
 * Created by kktec on 8/29/15.
 */
@Integration
class ServerErrorFuncSpec extends GKPoolFuncSpec {

    def 'an exception thrown displays an error page'() {
        when:
        go '/guest/wtf'

        then:
        at ServerErrorPage
    }
}
