package eu.proszowski.betoffers.infrastructure

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "betType")
@JsonSubTypes(
    JsonSubTypes.Type(value = WinLoseBetOfferWrapper::class, name = "WIN_LOSE"),
    JsonSubTypes.Type(value = WinDrawLoseBetOfferWrapper::class, name = "WIN_DRAW_LOSE"),
    JsonSubTypes.Type(value = AmountOfGoalsBetOfferWrapper::class, name = "AMOUNT_OF_GOALS")
)
sealed class BetOfferDto

data class WinLoseBetOfferWrapper(
    val winLoseBetOffer: WinLoseBetOffer
) : BetOfferDto()

data class WinLoseBetOffer(
    val homeTeamWins: Odds,
    val awayTeamWins: Odds
)

data class WinDrawLoseBetOfferWrapper(
    val winDrawLoseBetOffer: WinDrawLoseBetOffer
) : BetOfferDto()

data class WinDrawLoseBetOffer(
    val homeTeamWins: Odds,
    val draw: Odds,
    val awayTeamWins: Odds
)

data class AmountOfGoalsBetOfferWrapper(
    val amountOfGoalsBetOffer: AmountOfGoalsBetOffer
) : BetOfferDto()

data class AmountOfGoalsBetOffer(
    val moreThan: List<GoalsAmountWithOdds>,
    val lessThan: List<GoalsAmountWithOdds>
)

data class GoalsAmountWithOdds(
    val amount: String,
    val odds: Odds
)

data class Odds(
    val amount: String,
    val currency: String
)