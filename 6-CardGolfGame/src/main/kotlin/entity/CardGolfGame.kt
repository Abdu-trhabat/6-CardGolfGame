package entity

/**
 * Data class representing the overall state of the Card Golf game.
 *
 * @param currentPlayer The index of the player whose turn it currently is.
 * @param isLastTurnTriggered True if the endgame condition has been met.
 * @param lastRoundTurnCounter Counts how many players have taken their final turn.
 * @param isFirstRound True if it's the first round of the game.
 * @param players The list of players participating in the game.
 * @param drawpile The stack of face-down cards to draw from.
 * @param graveyard The stack of face-up discarded cards.
 * @param log The history of all turns taken in the game.
 */
class CardGolfGame(
    var currentPlayer: Int,
    var isLastTurnTriggered: Boolean,
    var lastRoundTurnCounter: Int,
    var isFirstRound: Boolean,
    val players: MutableList<Player>,
    val drawpile: MutableList<Card>,
    val graveyard: MutableList<Card>,
    val log: MutableList<TurnInstance>
)