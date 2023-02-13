package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
    public void print() throws IOException {

    }
}

class Child extends Parent {
    public void print() throws ArrayIndexOutOfBoundsException {
    }

}

public class ExceptionInheritance {
}
