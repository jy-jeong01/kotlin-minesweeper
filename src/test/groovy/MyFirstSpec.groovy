

import spock.lang.Specification

class MyFirstSpec extends Specification {

    def "should add two numbers"() {
        given: 'Two numbers: 2 and 3'
        def a = 2
        def b = 3

        when: 'Numbers are added'
        def result = a + b

        then: 'The result is equal to 5'
        result == 5
    }
}