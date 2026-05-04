package entity

/**
 * Enum to distinguish between the possible actions a player can take during their turn.
 */
enum class Action {
    DRAWFROMGRAVEYARD,
    DRAWFROMDRAWPILE,
    FLIPONECARD,
    FLIPTWOCARDS,
}