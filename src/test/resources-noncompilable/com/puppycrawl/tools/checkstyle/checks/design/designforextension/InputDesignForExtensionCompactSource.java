/*
DesignForExtension
ignoredAnnotations = (default)After, AfterClass, Before, BeforeClass, Test
requiredJavadocPhrase = (default).*

*/

// non-compiled with javac: Compilable with Java25

public abstract class Test {
    private int bar;
    // violation below ''m1' does not have javadoc that explains how to do that safely'
    public int m1() {
        return 2;
    }
}

void main() {}