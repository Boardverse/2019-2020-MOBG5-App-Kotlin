package esi.mobg5.g44422.boardverse.model

interface API {
    // Home page
    fun getOtherPopularGames()
    fun getOtherNewGames()
    fun getOtherGamesFriendsPlaying()
    fun getOtherGamesFriendsLoving()
    fun getOtherGamesInCategories()
    fun getOtherGamesWithTypes()
    fun getOtherGamesFromPublishers()

    // Game page
    fun getGame()
    fun addGameToCollection()
    fun removeGameFromCollection()
    fun rateGame()
    fun getFriendsPlayingGame()
    fun getFriendsLovingGame()
    fun getOtherGamesFromPublisher()
    fun getOtherGamesInCategory()
    fun getOtherGamesWithType()

    // Profile page

}