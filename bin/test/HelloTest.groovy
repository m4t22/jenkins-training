import org.junit.*
import com.lesfurets.jenkins.unit.*
import static groovy.test.GroovyAssert.*

class HelloTest extends BasePipelineTest {
    def hello

    @Before
    void setUp() {
        super.setUp()
        // load hello
        hello = loadScript("vars/hello.groovy")
    }

    @Test
    void testCall() {
        // call hello and check result
        def result = hello("world")
        assert result == "Hello, world."
    }
}
