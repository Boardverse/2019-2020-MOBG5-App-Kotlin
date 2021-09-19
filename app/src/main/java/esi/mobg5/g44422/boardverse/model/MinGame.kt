package esi.mobg5.g44422.boardverse.model

import android.os.Parcel
import android.os.Parcelable

/**
 * @see Parcelable https://developer.android.com/reference/android/os/Parcelable.html
 */
data class MinGame(private val id: Int,
                   private val name: String,
                   private val score: Float,
                   private val thumbnailURL: String) : Parcelable {

    fun getId(): Int = this.id
    fun getName(): String = this.name
    fun getScore(): Float = this.score
    fun getThumbnailURL(): String = this.thumbnailURL

    constructor(parcel: Parcel) : this( parcel.readInt(),
                                        parcel.readString()!!,
                                        parcel.readFloat(),
                                        parcel.readString()!!) {
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        if (dest != null) {
            dest.writeInt(id)
            dest.writeString(name)
            dest.writeFloat(score)
            dest.writeString(thumbnailURL)
        }
    }

    /**
     * @see CREATOR https://developer.android.com/reference/android/os/Parcelable.Creator.html
     */
    companion object CREATOR : Parcelable.Creator<MinGame> {
        override fun createFromParcel(parcel: Parcel): MinGame {
            return MinGame(parcel)
        }

        override fun newArray(size: Int): Array<MinGame?> {
            return arrayOfNulls(size)
        }
    }
}