package com.example.contactapp.clases

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.DrawableRes

data class Contacts (

    val name: String,
    val numberPhone: Int,
    val Email: String,
    @DrawableRes val photo: Int

) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString().toString(),
            parcel.readInt(),
            parcel.readString().toString(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(numberPhone)
        parcel.writeString(Email)
        parcel.writeInt(photo)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Contacts> {
        override fun createFromParcel(parcel: Parcel): Contacts {
            return Contacts(parcel)
        }

        override fun newArray(size: Int): Array<Contacts?> {
            return arrayOfNulls(size)
        }
    }

}