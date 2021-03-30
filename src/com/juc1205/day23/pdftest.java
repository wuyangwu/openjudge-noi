package com.juc1205.day23;

import com.pdftron.common.PDFNetException;
import com.pdftron.pdf.PDFNet;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/12 11:05
 */
public class pdftest {
    public static void main(String[] args) throws PDFNetException {
//        System.loadLibrary("D:\\readers\\demo\\Lib\\PDFNetC.dll");
        PDFNet.initialize("Insert commercial license key here after purchase");

    }
}
