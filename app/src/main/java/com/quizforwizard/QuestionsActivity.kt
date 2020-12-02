package com.quizforwizard

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_questions.*

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 0
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        mQuestionList = Constants.getQuestions()
        setQuestion()

        option_one.setOnClickListener(this)
        option_two.setOnClickListener(this)
        option_three.setOnClickListener(this)
        option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion() {

        val question = mQuestionList!!.get(mCurrentPosition++)

        defaultOptionsView()

        if (mCurrentPosition == mQuestionList!!.size) {
            btn_submit.text = "Finish"
        } else {
            btn_submit.text = "Submit"
        }

        progressBar.progress = mCurrentPosition

        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max
        tv_question.text = question.question
        option_one.text = question.optionOne
        option_two.text = question.optionTwo
        option_three.text = question.optionThree
        option_four.text = question.optionFour


    }

    override fun onClick(v: View?) {

        if (v != null) {
            when (v.id) {
                R.id.option_one -> {
                    selectedOptionsView(option_one, 1)

                }
                R.id.option_two -> {
                    selectedOptionsView(option_two, 2)

                }
                R.id.option_three -> {
                    selectedOptionsView(option_three, 3)

                }
                R.id.option_four -> {
                    selectedOptionsView(option_four, 4)

                }

                R.id.btn_submit -> {

                    if (mSelectedOptionPosition == 0) {
                        when {
                            mCurrentPosition <= mQuestionList!!.size -> {
                                setQuestion()
                            }

                            else -> {
                                Toast.makeText(
                                    this,
                                    "Congratulations! You've completed this quiz successfully!",
                                    Toast.LENGTH_SHORT
                                ).show()
                                val intent = Intent(this, MainActivity::class.java)
                                startActivity(intent)
                            }
                        }
                    } else {

                        val question = mQuestionList?.get(mCurrentPosition - 1)
                        if (question!!.correctOption != mSelectedOptionPosition) {
                            answerView(
                                mSelectedOptionPosition,
                                R.drawable.incorrect_option_border_bg
                            )
                        }

                        answerView(question.correctOption, R.drawable.correct_option_border_bg)

                        if (mCurrentPosition == mQuestionList!!.size) {
                            btn_submit.text = "FINISH"
                        } else {
                            btn_submit.text = "NEXT QUESTION"
                        }
                        mSelectedOptionPosition = 0


                    }

                }

            }
        }

    }


    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        options.add(0, option_one)
        options.add(1, option_two)
        options.add(2, option_three)
        options.add(3, option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }

    }

    private fun selectedOptionsView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )

    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                option_one.background = ContextCompat.getDrawable(this, drawableView)

            }

            2 -> {
                option_two.background = ContextCompat.getDrawable(this, drawableView)

            }
            3 -> {
                option_three.background = ContextCompat.getDrawable(this, drawableView)

            }
            4 -> {
                option_four.background = ContextCompat.getDrawable(this, drawableView)

            }

        }
    }
}
