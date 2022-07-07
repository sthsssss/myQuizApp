package com.example.myquizapp

object Constants {
    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTION:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_question"


    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val que1 = Questions(
            1,
            "Choose the correct name of this Icon",
            R.drawable.csharp,
            "csharp", "c++","c lang","coke",1
        )
        val que2 = Questions(
            2,
            "Choose the correct name of this Icon",
            R.drawable.css,
            "c++", "csharp","css","none",3
        )
        val que3 = Questions(
            3,
            "Choose the correct name of this Icon",
            R.drawable.html,
            "hmzx", "html","5","redot",2
        )
        val que4 = Questions(
            4,
            "Choose the correct name of this Icon",
            R.drawable.python,
            "python", "snakes","swift","java",1
        )
        val que5 = Questions(
            5,
            "Choose the correct name of this Icon",
            R.drawable.ruby,
            "c++", "ruby","ring","redJewl",2
        )
        val que6 = Questions(
            6,
            "Choose the correct name of this Icon",
            R.drawable.swift,
            "eagle", "csharp","hummingBird","swift",4
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)

        return questionsList
    }
}