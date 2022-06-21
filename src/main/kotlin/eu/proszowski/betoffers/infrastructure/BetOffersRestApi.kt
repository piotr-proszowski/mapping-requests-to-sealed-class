package eu.proszowski.betoffers.infrastructure

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BetOffersRestApi {

    @PostMapping
    fun addBetOffer(betOffer: BetOfferDto) {
        when(betOffer.betType) {
            BetType.WIN_LOSE -> WinLoseBetOffer.from(betOffer)
            BetType.WIN_DRAW_LOSE -> WinDrawLoseBetOffer.from(betOffer)
            BetType.AMOUNT_OF_GOALS -> AmountOfGoalsBetOffer.from(betOffer)
        }
    }
}