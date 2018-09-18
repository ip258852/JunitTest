package com.kobe.test5;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.File;
import java.io.IOException;

public class Test5 {
    @Rule
    public final TemporaryFolder folder =new TemporaryFolder();
    @Rule
    public final TestPrinter printer = new TestPrinter();
    @Test
    public void case1(){
        try {
            File createFile = folder.newFolder("Td");
            assertThat(createFile).isDirectory();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void csae2(){
        System.out.println("hi");
    }
}
