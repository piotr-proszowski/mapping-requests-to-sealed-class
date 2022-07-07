package eu.proszowski.betoffers.infrastructure

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BetOffersRestApi {

    @PostMapping("/bet-offers")
    fun addBetOffer(@RequestBody betOffer: BetOfferDto?) {
        when (betOffer) {
            is WinLoseBetOfferWrapper -> TODO("WinLoseBetOfferWrapper")
            is WinDrawLoseBetOfferWrapper -> TODO("WinDrawLoseBetOfferWrapper")
            is AmountOfGoalsBetOfferWrapper -> TODO("AmountOfGoalsBetOfferWrapper")
            null -> TODO("null")
        }
    }
}