package entity

import org.junit.jupiter.api.Test
import kotlin.test.*

/**
 * Test class for [Card].
 * Ensures that a card is created correctly and its properties can be changed.
 */
class CardTest {

    /**
     * Tests if a card is initialized with the correct values.
     */
    @Test
    fun testCardInitialization() {
        // erstellen eine Test-Karte: Herz Ass, verdeckt (false)
        val card = Card(CardSuit.HEARTS, CardValue.ACE, false)

        // prüft, ob die Karte die Werte gespeichert hat, die wir ihr gegeben haben
        assertEquals(CardSuit.HEARTS, card.suit, "Suit should be HEARTS")
        assertEquals(CardValue.ACE, card.value, "Value should be ACE")

        // prüft, ob den Wert wirklich 'false' ist
        assertFalse(card.isFlipped, "Card should be initially face down (false)")
    }


    @Test
    fun testChangeCardProperties() {
        // erstelle nue karte 10 spades
        val card = Card(CardSuit.SPADES, CardValue.TEN, false)

        // flip die karte false -> true
        card.isFlipped = true

        // Änderungenn erfolgreich?
        assertTrue(card.isFlipped, "Card should be face up (true) after flipping")
    }
}