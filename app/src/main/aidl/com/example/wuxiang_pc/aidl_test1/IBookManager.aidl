// IBookManager.aidl
package com.example.wuxiang_pc.aidl_test1;
import com.example.wuxiang_pc.aidl_test1.Book;

// Declare any non-default types here with import statements

interface IBookManager {

    void addBook(in Book book);
    void test();
}
