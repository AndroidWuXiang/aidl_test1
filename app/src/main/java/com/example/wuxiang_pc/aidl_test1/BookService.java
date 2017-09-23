package com.example.wuxiang_pc.aidl_test1;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.example.wuxiang_pc.aidl_test1.Book;
import com.example.wuxiang_pc.aidl_test1.IBookManager;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by wuxiang-PC on 2017/9/23.
 */

public class BookService extends Service{
    private static final String TAG = "BookService";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "======================onCreate:Success");
    }

    public final Binder mBinder= new IBookManager.Stub()

    {
        @Override
        public void addBook(Book book) throws RemoteException {
            Log.d(TAG, "======================add Book Success:"+book);
            mRemoteCallbackList.add(book);
        }

        @Override
        public void test() throws RemoteException {
            Log.d(TAG, "======================add Book Success:");
        }
    };
    public CopyOnWriteArrayList<Book> mRemoteCallbackList = new CopyOnWriteArrayList<>();
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

}
