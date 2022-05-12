package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the Capital of U.K",
            R.drawable.flag_uk,
            optionOne = "Beijing",
            optionTwo = "London",
            optionThree = "Lisbon",
            correctAnswer = 2
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "What is the Capital of Australia",
            R.drawable.flag_aus,
            optionOne = "Canberra",
            optionTwo = "Moscow",
            optionThree = "Ottawa",
            correctAnswer = 1
        )

        questionsList.add(que2)

        val que3 = Question(
            3,
            "What is the Capital of Egypt",
            R.drawable.flag_egypt,
            optionOne = "Madrid",
            optionTwo = "Singapore",
            optionThree = "Cairo",
            correctAnswer = 3
        )

        questionsList.add(que3)

        val que4 = Question(
            4,
            "What is the Capital of Afghanistan",
            R.drawable.flag_afghan,
            optionOne = "Buenos Aires",
            optionTwo = "Kabul",
            optionThree = "Brasilia",
            correctAnswer = 2
        )

        questionsList.add(que4)

        val que5 = Question(
            5,
            "What is the Capital of France",
            R.drawable.flag_france,
            optionOne = "Berlin",
            optionTwo = "London",
            optionThree = "Paris",
            correctAnswer = 3
        )

        questionsList.add(que5)

        val que6 = Question(
            6,
            "What is the Capital of Greece",
            R.drawable.flag_greece,
            optionOne = "Athens",
            optionTwo = "Budapest",
            optionThree = "Baghdad",
            correctAnswer = 1
        )

        questionsList.add(que6)

        val que7 = Question(
            7,
            "What is the Capital of Ireland",
            R.drawable.flag_ireland,
            optionOne = "Tokyo",
            optionTwo = "Dublin",
            optionThree = "Rome",
            correctAnswer = 2
        )

        questionsList.add(que7)

        val que8 = Question(
            8,
            "What is the Capital of Jamaica",
            R.drawable.flag_jamaica,
            optionOne = "Nairobi",
            optionTwo = "Kingston",
            optionThree = "Mexico City",
            correctAnswer = 2
        )

        questionsList.add(que8)

        val que9 = Question(
            9,
            "What is the Capital of New Zealand",
            R.drawable.flag_nz,
            optionOne = "Oslo",
            optionTwo = "Belfast",
            optionThree = "Wellington",
            correctAnswer = 3
        )

        questionsList.add(que9)

        val que10 = Question(
            10,
            "What is the Capital of Poland",
            R.drawable.flag_poland,
            optionOne = "Moscow",
            optionTwo = "Warsaw",
            optionThree = "Edinburgh",
            correctAnswer = 2
        )

        questionsList.add(que10)

        val que11 = Question(
            11,
            "What is the Capital of Scotland",
            R.drawable.flag_scotland,
            optionOne = "Edinburgh",
            optionTwo = "Madrid",
            optionThree = "Washington D.C.",
            correctAnswer = 1
        )

        questionsList.add(que11)

        val que12 = Question(
            12,
            "What is the Capital of Wales",
            R.drawable.flag_wales,
            optionOne = "Oslo",
            optionTwo = "Tokyo",
            optionThree = "Cardiff",
            correctAnswer = 3
        )

        questionsList.add(que12)

        val que13 = Question(
            13,
            "What is the Capital of China",
            R.drawable.flag_china,
            optionOne = "Berlin",
            optionTwo = "Beijing",
            optionThree = "Buenos Aires",
            correctAnswer = 2
        )

        questionsList.add(que13)

        val que14 = Question(
            14,
            "What is the Capital of Portugal",
            R.drawable.flag_portugal,
            optionOne = "Lisbon",
            optionTwo = "Moscow",
            optionThree = "Athens",
            correctAnswer = 1
        )

        questionsList.add(que14)

        val que15 = Question(
            15,
            "What is the Capital of Russia",
            R.drawable.flag_russia,
            optionOne = "Madrid",
            optionTwo = "Moscow",
            optionThree = "Singapore",
            correctAnswer = 2
        )

        questionsList.add(que15)

        val que16 = Question(
            16,
            "What is the Capital of Canada",
            R.drawable.flag_canada,
            optionOne = "Rome",
            optionTwo = "Brasilia",
            optionThree = "Ottawa",
            correctAnswer = 3
        )

        questionsList.add(que16)

        val que17 = Question(
            17,
            "What is the Capital of Spain",
            R.drawable.flag_spain,
            optionOne = "Madrid",
            optionTwo = "Nairobi",
            optionThree = "Baghdad",
            correctAnswer = 1
        )

        questionsList.add(que17)

        val que18 = Question(
            18,
            "What is the Capital of Singapore",
            R.drawable.flag_singapore,
            optionOne = "Beijing",
            optionTwo = "Singapore",
            optionThree = "Paris",
            correctAnswer = 2
        )

        questionsList.add(que18)

        val que19 = Question(
            19,
            "What is the Capital of Argentina",
            R.drawable.flag_argentina,
            optionOne = "Budapest",
            optionTwo = "Canberra",
            optionThree = "Buenos Aires",
            correctAnswer = 3
        )

        questionsList.add(que19)

        val que20 = Question(
            20,
            "What is the Capital of Brazil",
            R.drawable.flag_brazil,
            optionOne = "Brasilia",
            optionTwo = "Dublin",
            optionThree = "Cardiff",
            correctAnswer = 1
        )

        questionsList.add(que20)

        val que21 = Question(
            21,
            "What is the Capital of Germany",
            R.drawable.flag_germany,
            optionOne = "Athens",
            optionTwo = "Berlin",
            optionThree = "Beijing",
            correctAnswer = 2
        )

        questionsList.add(que21)

        val que22 = Question(
            22,
            "What is the Capital of Hungary",
            R.drawable.flag_hungary,
            optionOne = "Dublin",
            optionTwo = "Budapest",
            optionThree = "Lisbon",
            correctAnswer = 2
        )

        questionsList.add(que22)

        val que23 = Question(
            23,
            "What is the Capital of Iraq",
            R.drawable.flag_iraq,
            optionOne = "Baghdad",
            optionTwo = "Kingston",
            optionThree = "Warsaw",
            correctAnswer = 1
        )

        questionsList.add(que23)

        val que24 = Question(
            24,
            "What is the Capital of Japan",
            R.drawable.flag_japan,
            optionOne = "Nairobi",
            optionTwo = "Tokyo",
            optionThree = "Madrid",
            correctAnswer = 2
        )

        questionsList.add(que24)

        val que25 = Question(
            25,
            "What is the Capital of Italy",
            R.drawable.flag_italy,
            optionOne = "London",
            optionTwo = "Budapest",
            optionThree = "Rome",
            correctAnswer = 3
        )

        questionsList.add(que25)

        val que26 = Question(
            26,
            "What is the Capital of Kenya",
            R.drawable.flag_kenya,
            optionOne = "Nairobi",
            optionTwo = "Baghdad",
            optionThree = "Beijing",
            correctAnswer = 1
        )

        questionsList.add(que26)

        val que27 = Question(
            27,
            "What is the Capital of Mexico",
            R.drawable.flag_mexico,
            optionOne = "Mexico City",
            optionTwo = "Buenos Aires",
            optionThree = "Paris",
            correctAnswer = 1
        )

        questionsList.add(que27)

        val que28 = Question(
            28,
            "What is the Capital of Norway",
            R.drawable.flag_norway,
            optionOne = "Madrid",
            optionTwo = "Ottawa",
            optionThree = "Oslo",
            correctAnswer = 3
        )

        questionsList.add(que28)

        val que29 = Question(
            29,
            "What is the Capital of USA",
            R.drawable.flag_usa,
            optionOne = "Tokyo",
            optionTwo = "Washington D.C.",
            optionThree = "Berlin",
            correctAnswer = 2
        )

        questionsList.add(que29)

        val que30 = Question(
            30,
            "What is the Capital of Belgium",
            R.drawable.flag_belgium,
            optionOne = "Munich",
            optionTwo = "Paris",
            optionThree = "Brussels",
            correctAnswer = 3
        )

        questionsList.add(que30)

        questionsList.shuffle()

        return questionsList
    }
}
