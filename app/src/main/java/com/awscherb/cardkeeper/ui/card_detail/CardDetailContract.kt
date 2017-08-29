package com.awscherb.cardkeeper.ui.card_detail

import com.awscherb.cardkeeper.data.model.ScannedCode
import com.awscherb.cardkeeper.ui.base.BasePresenter
import com.awscherb.cardkeeper.ui.base.BaseView

interface CardDetailContract {

    interface View : BaseView {
        fun showCard(code: ScannedCode)
    }

    interface Presenter : BasePresenter<CardDetailContract.View> {
        fun loadCard(id: Int)
    }

}
