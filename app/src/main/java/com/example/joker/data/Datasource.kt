package com.example.joker.data

import com.example.joker.R
import com.example.joker.model.Joker

class Datasource {
    fun loadJoker(): List<Joker>{
        return listOf<Joker>(
            Joker(R.string.joker1,R.drawable.image1),
            Joker(R.string.joker2,R.drawable.image2),
            Joker(R.string.joker3,R.drawable.image3),
            Joker(R.string.joker4,R.drawable.image4),
            Joker(R.string.joker5,R.drawable.image5),
            Joker(R.string.joker6,R.drawable.image6),
            Joker(R.string.joker7,R.drawable.image7),
            Joker(R.string.joker8,R.drawable.image8),
            Joker(R.string.joker9,R.drawable.image9),
            Joker(R.string.joker10,R.drawable.image10)
        )

    }

}