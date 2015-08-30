package gkpool.errors

import gkpool.GKPoolFuncSpec
import grails.test.mixin.integration.Integration

/**
 * Created by kktec on 8/29/15.
 */
@Integration
class NotFoundFuncSpec extends GKPoolFuncSpec {
    def 'can display a not found page'() {
        when:
        go '/_'

        then:
        at NotFoundPage
    }
}
