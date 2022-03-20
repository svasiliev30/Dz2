package io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sbp.io.MyIOExample;

import java.io.IOException;

public class MyIOExampleTest {

    private MyIOExample myIOExample = new MyIOExample();
    /**
     * Проверяем,возвращает ли метод тру при копировании данных из MyFile в MyFileCopy
     */
    @Test
    void MyIOExampleTest0() {
        boolean testTrue =  myIOExample.workWithFile("MyFile");
        Assertions.assertTrue(testTrue);
    }

    /**
     * Проверяем,возвращает ли метод тру при копировании данных из MyFile в MyFileCopy
     */
    @Test
    void MyIOExampleTest1() throws IOException {
      boolean testTrue =  myIOExample.copyFile("MyFile","MyFileCopy");
        Assertions.assertTrue(testTrue);
    }

    /**
     * Проверяем,возвращает ли метод тру при копировании данных из MyFile в MyFileCopy
     */
    @Test
    void MyIOExampleTest2() throws IOException {
        boolean testTrue =  myIOExample.copyBufferedFile ("MyFile","MyFileCopy");
        Assertions.assertTrue(testTrue);
    }

    /**
     * Проверяем,возвращает ли метод тру при копировании данных из MyFile в MyFileCopy
     */
    @Test
    void MyIOExampleTest3() throws IOException {
        boolean testTrue =  myIOExample.copyFileWithReaderAndWriter ("MyFile","MyFileCopy");
        Assertions.assertTrue(testTrue);
    }
}
