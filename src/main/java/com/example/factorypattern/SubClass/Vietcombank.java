
/**
 * Day la subclass Vietcombank. Class nay implement phuong thuc cua Super class theo nghiep vu xu ly cua Vietcombank.
 * Trong truong hopj nay la getBankName => tra ve ten cua ngan hang la Vietcombank
 */
package com.example.factorypattern.SubClass;

import com.example.factorypattern.Bank;

public class Vietcombank implements Bank{
    @Override
    public String getBankName() {
        return "VietcomBank";
    }
}
