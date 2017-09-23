package com.example.wuxiang_pc.aidl_test1;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by wuxiang-PC on 2017/9/22.
 */

public class Book implements Parcelable {
    public int bookId;
    public String bookName;
    public Book(Parcel in){
        this.bookId = in.readInt();
        this.bookName = in.readString();
    }

    public Book(int bookId,String bookName){
        this.bookId = bookId;
        this.bookName = bookName;

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.bookId);
        parcel.writeString(this.bookName);
    }
    public static final Parcelable.Creator<Book> CREATOR = new Parcelable.Creator<Book>(){

        @Override
        public Book createFromParcel(Parcel parcel) {
            return new Book(parcel);
        }

        @Override
        public Book[] newArray(int i) {
            return new Book[i];
        }
    };
}
