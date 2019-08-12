/**
 * Day la subclass TPBank. Class nay implement phuong thuc cua Super class theo nghiep vu xu ly cua TPBank.
 * Trong truong hopj nay la getBankName => tra ve ten cua ngan hang la TPBank
 */
package com.example.factorypattern.SubClass;

import com.example.factorypattern.Bank;

public class TPBank implements Bank{

    @Override
    public String getBankName() {
        return "TPBank";
    }
}
