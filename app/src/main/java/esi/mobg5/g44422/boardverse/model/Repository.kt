package esi.mobg5.g44422.boardverse.model

class Repository private constructor() {

    companion object {
        @Volatile private var instance: Repository? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: Repository().also { instance = it }
            }
    }



}