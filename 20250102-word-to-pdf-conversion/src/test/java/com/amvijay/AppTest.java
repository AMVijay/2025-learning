package com.amvijay;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testWordToPDFConvert(){
        WordtoPDFConverterService pdfConvert = new WordtoPDFConverterService();
        pdfConvert.convert("test.docx");
        assertTrue(true);
    }
}