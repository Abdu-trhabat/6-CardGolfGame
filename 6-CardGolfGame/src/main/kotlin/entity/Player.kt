package entity

/**
 * Data class representing a player in the game.
 *
 * @param name The name of the player.
 * @param grid The 2x3 grid of cards placed in front of the player.
 */
class Player(
    val name: String,
    var grid: Array<Array<Card?>>
)