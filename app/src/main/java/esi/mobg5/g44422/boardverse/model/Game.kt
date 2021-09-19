package esi.mobg5.g44422.boardverse.model

import android.os.Parcel
import android.os.Parcelable

data class Game(private val id: Int,
                private val name: String,
                private val types: Array<GameType>,
                private val categories: Array<GameCategory>,
                private val description: String,
                private val score: Float,
                private val thumbnailURL: String,
                private val picturesURL: Array<String>,
                private val publishers: Array<GamePublisher>,
                private val publishingDate: Int,
                private val minPlayers: Int,
                private val recommendedPlaters: Int,
                private val maxPlayers: Int,
                private val minDuration: Int,
                private val averageDuration: Int,
                private val maxDuration: Int,
                private val minAge: Int,
                private val recommendedAge: Int,
                private val maxAge: Int,
                private val awards: Array<GameAward>,
                private val languages: Array<GameLanguage>): MinGame(id, name, score, thumbnailURL) {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readFloat(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        super.writeToParcel(parcel, flags)
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeFloat(score)
        parcel.writeString(thumbnailURL)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Game> {
        override fun createFromParcel(parcel: Parcel): Game {
            return Game(parcel)
        }

        override fun newArray(size: Int): Array<Game?> {
            return arrayOfNulls(size)
        }
    }
}