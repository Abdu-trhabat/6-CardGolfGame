package entity

/**
 * Data class representing a single logged action or turn in the game.
 *
 * @param turnNumber The sequential number of the turn.
 * @param playerName The name of the player who made the turn.
 * @param action The specific action the player took.
 * @param cardPlayed A list of up to two cards that were played or flipped.
 * @param cardReplaced The card that was replaced in the grid, if applicable.
 */
class TurnInstance(
    val turnNumber: Int,
    val playerName: String,
    val action: Action,
    val cardPlayed: List<Card>,
    val cardReplaced: Card? = null
)