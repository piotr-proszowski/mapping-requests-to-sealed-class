package eu.proszowski.betoffers.infrastructure

data class BetOfferDto(
    val betType: BetType,
    val winLoseBetOffer: WinLoseBetOffer?,
    val winDrawLoseBetOffer: WinDrawLoseBetOffer?,
    val amountOfGoals: AmountOfGoalsBetOffer?
)

enum class BetType {
    WIN_LOSE,
    WIN_DRAW_LOSE,
    AMOUNT_OF_GOALS
}

data class WinLoseBetOffer(
    val homeTeamWins: Odds,
    val awayTeamWins: Odds
) {
    companion object {
        fun from(betOffer: BetOfferDto): WinLoseBetOffer {
            TODO("Do mapping and return WinLoseBetOffer")
        }
    }
}

data class WinDrawLoseBetOffer(
    val homeTeamWins: Odds,
    val draw: Odds,
    val awayTeamWins: Odds
) {
    companion object {
        fun from(betOffer: BetOfferDto): WinDrawLoseBetOffer {
            TODO("Do mapping and return WinDrawLoseBetOffer")
        }
    }
}

data class AmountOfGoalsBetOffer(
    val moreThan: List<GoalsAmountWithOdds>,
    val lessThan: List<GoalsAmountWithOdds>
) {
    companion object {
        fun from(betOffer: BetOfferDto): AmountOfGoalsBetOffer {
            TODO("Do mapping and return AmountOfGoalsBetOffer")
        }
    }
}

data class GoalsAmountWithOdds(
    val amount: String,
    val odds: Odds
)

data class Odds(
    val amount: String,
    val currency: String
)