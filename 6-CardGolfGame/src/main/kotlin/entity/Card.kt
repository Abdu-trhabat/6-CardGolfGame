package entity

/**
 * Data class representing a single playing card in the game.
 *
 * @param suit The suit of the card (e.g., Hearts, Spades).
 * @param value The value of the card (e.g., Two, King, Ace).
 * @param isFlipped True if the card is face-up, false if it is face-down.
 */
class Card(
    val suit: CardSuit,
    val value: CardValue,
    var isFlipped: Boolean
){
    /**
     * Returns a string representation of the card.
     *
     * @return The string representation of the card
     */

    override fun toString(): String {
        return if (isFlipped) "$suit $value" else "[Verdeckte Karte]"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Card) return false

        if (suit != other.suit) return false
        if (value != other.value) return false
        if (isFlipped != other.isFlipped) return false

        return true
    }

    override fun hashCode(): Int {
        var result = suit.hashCode()
        result = 31 * result + value.hashCode()
        result = 31 * result + isFlipped.hashCode()
        return result
    }
}