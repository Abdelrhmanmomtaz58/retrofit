package com.momtaz.mvvm.model

import com.momtaz.mvvm.model.domain.Wisdom


class FakeAPIServes {
    private val wisdomList = listOf(
        Wisdom(
            "Be Present: Live in the moment. Worrying about the past or future often takes away from the present.",
            "6/6/2006"
        ),
        Wisdom(
            "Learn Continuously: Always be open to learning. Knowledge and skills can come from anywhere and anyone.",
            "5/5/2005"
        ),
        Wisdom(
            "Practice Gratitude: Regularly take time to appreciate the good things in life. This can improve mental well-being and outlook.",
            "2/9/1999"
        ),
        Wisdom(
            "Stay Humble: Recognize your limitations and appreciate the contributions of others. Humility fosters growth and respect.",
            "3/4/1973"
        ),
        Wisdom(
            "Embrace Change: Change is inevitable. Being adaptable and open to change can help you navigate life's ups and downs more effectively.",
            "4/7/1958"
        ),
        Wisdom(
            "Take Responsibility: Own your actions and their consequences. This builds character and trustworthiness.",
            "5/8/2003"
        ),
        Wisdom(
            "Be Kind: Kindness can have a profound impact on others and can lead to a more positive and fulfilling life.",
            "1/5/2001"
        )

    )

    fun getRandomWisdom(): Wisdom {
        val random = (Math.random() * wisdomList.size).toInt()
        return wisdomList[random]
    }
}