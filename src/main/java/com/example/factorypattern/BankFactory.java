/**
 * Day la Factory Class.
 * Chiu trach nhiem khoi tao cac doi tuong cua sub class dua vao tham so dau vao.
 * Lop nay la Singleton hoac cung cap mojt public static method cho viec truy xuat va khoi tao doi tuong.
 * Facotry class thuong su dung If-else hoacj Switch => trong truong hopj nay ta suw dung Static method
 */

package com.example.factorypattern;

import com.example.factorypattern.SubClass.TPBank;
import com.example.factorypattern.SubClass.Vietcombank;

public class BankFactory {
    private BankFactory() {
    }

    public static final Bank getBank(BankType bankType){
        switch (bankType){
            case TPBANK:
                return  new TPBank();
            case VIETCOMBANK:
                return new Vietcombank();
            default:
                throw  new IllegalArgumentException();
        }
    }

}
