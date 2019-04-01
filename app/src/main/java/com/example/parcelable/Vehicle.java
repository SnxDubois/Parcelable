package com.example.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Vehicle implements Parcelable {

    private String brand;
    private int km;

    public Vehicle(String brand, int km) {
        this.brand = brand;
        this.km = km;
    }

    protected Vehicle(Parcel in) {
        brand = in.readString();
        km = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(brand);
        dest.writeInt(km);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Vehicle> CREATOR = new Creator<Vehicle>() {
        @Override
        public Vehicle createFromParcel(Parcel in) {
            return new Vehicle(in);
        }

        @Override
        public Vehicle[] newArray(int size) {
            return new Vehicle[size];
        }
    };

    public String getBrand() {
        return this.brand;
    }

    public int getKm() {
        return this.km;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKm(int km) {
        this.km = km;
    }

}
