package kaku.myservice;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 410 on 2017/7/21 0021.
 */
public class User implements Parcelable{
    protected User(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
