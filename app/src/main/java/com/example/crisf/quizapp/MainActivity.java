package com.example.crisf.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

/**
 * Main class that handles a quiz regarding to peppers
 *
 * @author Cris Cobo
 */
public class MainActivity extends AppCompatActivity {

    private Integer grade = 0;

    /**
     * Handles all questions hiding the options and showing the answer with the background color
     * green if correct or red if incorrect.
     *
     * @param optionsComponent      Component containing all options of the question
     * @param correctAnswerChecked  Boolean corresponding to the correct or incorrect answer
     * @param answer                The complete answer of the question
     */
    private void handleQuestions(View optionsComponent, Boolean correctAnswerChecked,
                                 TextView answer) {
        optionsComponent.setVisibility(View.GONE);
        String completeAnswer;
        if (correctAnswerChecked) {
            completeAnswer = getString(R.string.correct) + "\n" + answer.getText();
            answer.setText(completeAnswer);
            answer.setBackgroundColor(Color.parseColor("#3CB371"));
            grade++;
        } else {
            completeAnswer = getString(R.string.incorrect) + "\n" + answer.getText();
            answer.setText(completeAnswer);
            answer.setBackgroundColor(Color.parseColor("#B22222"));
        }
        answer.setVisibility(View.VISIBLE);
    }

    /**
     * Handles the question A
     */
    private void handleQuestionA() {

        LinearLayout linearQuestionA = findViewById(R.id.linearQuestionA);
        linearQuestionA.setVisibility(View.GONE);

        CheckBox firstCheckboxCorrectA = findViewById(R.id.optionA4);
        CheckBox secondCheckboxCorrectA = findViewById(R.id.optionA2);
        CheckBox firstCheckboxIncorrectA = findViewById(R.id.optionA3);
        CheckBox secondCheckboxIncorrectA = findViewById(R.id.optionA1);

        Boolean correctAnswerChecked = firstCheckboxCorrectA.isChecked() && secondCheckboxCorrectA.isChecked() &&
                !firstCheckboxIncorrectA.isChecked() && !secondCheckboxIncorrectA.isChecked();

        TextView answerA = findViewById(R.id.answerA);
        answerA.setText(getString(R.string.answer_A));

        handleQuestions(linearQuestionA, correctAnswerChecked, answerA);

    }

    /**
     * Handles the question B
     */
    private void handleQuestionB() {
        RadioGroup radioGroupQuestionB = findViewById(R.id.radioQuestionB);
        RadioButton radioButtonCorrectB = findViewById(R.id.optionB2);
        Boolean correctAnswerChecked = radioButtonCorrectB.isChecked();
        TextView answerB = findViewById(R.id.answerB);
        answerB.setText(getString(R.string.answer_B));
        handleQuestions(radioGroupQuestionB, correctAnswerChecked, answerB);
    }

    /**
     * Handles the question C
     */
    private void handleQuestionC() {
        RadioGroup radioGroupQuestionC = findViewById(R.id.radioQuestionC);
        RadioButton radioButtonCorrectC = findViewById(R.id.optionC3);
        Boolean correctAnswerChecked = radioButtonCorrectC.isChecked();
        TextView answerC = findViewById(R.id.answerC);
        answerC.setText(getString(R.string.answer_C));
        handleQuestions(radioGroupQuestionC, correctAnswerChecked, answerC);
    }

    /**
     * Handles the question D
     */
    private void handleQuestionD() {
        RadioGroup radioGroupQuestionD = findViewById(R.id.radioQuestionD);
        RadioButton radioButtonCorrectD = findViewById(R.id.optionD1);
        Boolean correctAnswerChecked = radioButtonCorrectD.isChecked();
        TextView answerD = findViewById(R.id.answerD);
        answerD.setText(getString(R.string.answer_D));
        handleQuestions(radioGroupQuestionD, correctAnswerChecked, answerD);
    }

    /**
     * Handles the question E
     */
    private void handleQuestionE() {
        RadioGroup radioGroupQuestionE = findViewById(R.id.radioQuestionE);
        RadioButton radioButtonCorrectE = findViewById(R.id.optionE4);
        Boolean correctAnswerChecked = radioButtonCorrectE.isChecked();
        TextView answerE = findViewById(R.id.answerE);
        answerE.setText(getString(R.string.answer_E));
        handleQuestions(radioGroupQuestionE, correctAnswerChecked, answerE);
    }

    /**
     * Handles the question F
     */
    private void handleQuestionF() {
        EditText editTextQuestionF = findViewById(R.id.optionF1);
        List<String> validAnswers = Arrays.asList(getString(R.string.option_F1).toUpperCase(),
                getString(R.string.option_F2).toUpperCase(),
                getString(R.string.option_F3).toUpperCase(),
                getString(R.string.option_F4).toUpperCase(),
                getString(R.string.option_F5).toUpperCase(),
                getString(R.string.option_F6).toUpperCase(),
                getString(R.string.option_F7).toUpperCase(),
                getString(R.string.option_F8).toUpperCase(),
                getString(R.string.option_F9).toUpperCase(),
                getString(R.string.option_F10).toUpperCase());
        Boolean correctAnswerChecked = validAnswers.contains(String.valueOf(editTextQuestionF.getText()).toUpperCase());
        TextView answerF = findViewById(R.id.answerF);
        answerF.setText(getString(R.string.answer_F));
        handleQuestions(editTextQuestionF, correctAnswerChecked, answerF);
    }

    /**
     * Hides all answers if the user wants to answer the quiz again
     */
    private void hideAnswers() {
        TextView answerA = findViewById(R.id.answerA);
        answerA.setVisibility(View.GONE);
        TextView answerB = findViewById(R.id.answerB);
        answerB.setVisibility(View.GONE);
        TextView answerC = findViewById(R.id.answerC);
        answerC.setVisibility(View.GONE);
        TextView answerD = findViewById(R.id.answerD);
        answerD.setVisibility(View.GONE);
        TextView answerE = findViewById(R.id.answerE);
        answerE.setVisibility(View.GONE);
        TextView answerF = findViewById(R.id.answerF);
        answerF.setVisibility(View.GONE);
    }

    /**
     * Shows all options if the user wants to answer the quiz again
     */
    private void showOptions() {
        LinearLayout linearQuestionA = findViewById(R.id.linearQuestionA);
        CheckBox firstCheckboxA = findViewById(R.id.optionA1);
        firstCheckboxA.setChecked(false);
        CheckBox secondCheckboxA = findViewById(R.id.optionA2);
        secondCheckboxA.setChecked(false);
        CheckBox thirdCheckboxA = findViewById(R.id.optionA3);
        thirdCheckboxA.setChecked(false);
        CheckBox fourthCheckboxA = findViewById(R.id.optionA4);
        fourthCheckboxA.setChecked(false);
        RadioGroup radioGroupQuestionB = findViewById(R.id.radioQuestionB);
        radioGroupQuestionB.clearCheck();
        RadioGroup radioGroupQuestionC = findViewById(R.id.radioQuestionC);
        radioGroupQuestionC.clearCheck();
        RadioGroup radioGroupQuestionD = findViewById(R.id.radioQuestionD);
        radioGroupQuestionD.clearCheck();
        RadioGroup radioGroupQuestionE = findViewById(R.id.radioQuestionE);
        radioGroupQuestionE.clearCheck();
        EditText editTextF = findViewById(R.id.optionF1);
        editTextF.setText("");
        linearQuestionA.setVisibility(View.VISIBLE);
        radioGroupQuestionB.setVisibility(View.VISIBLE);
        radioGroupQuestionC.setVisibility(View.VISIBLE);
        radioGroupQuestionD.setVisibility(View.VISIBLE);
        radioGroupQuestionE.setVisibility(View.VISIBLE);
        editTextF.setVisibility(View.VISIBLE);
    }

    /**
     * Creates the page for the quiz
     *
     * @param savedInstanceState the state of the instance
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method will verify if the answers are correct or not and display it to the user.
     * Also, the submit button will be hidden and a button for the user to decide if he wants to
     * answer the quiz again will be displayed.
     *
     * @param view the page view
     */
    public void submitAnswers(View view) {
        grade = 0;
        handleQuestionA();
        handleQuestionB();
        handleQuestionC();
        handleQuestionD();
        handleQuestionE();
        handleQuestionF();
        Toast toast = Toast.makeText(this, getString(R.string.grade, grade.toString()), Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setVisibility(View.GONE);
        Button resetButton = findViewById(R.id.resetButton);
        resetButton.setVisibility(View.VISIBLE);
    }

    /**
     * This method will be invoked if the user wants to answer the quiz again.
     * The answers will be hidden and the options as well as the submit button will be displayed
     * again.
     *
     * @param view the page view
     */
    public void resetAnswers(View view) {
        hideAnswers();
        showOptions();
        Button resetButton = findViewById(R.id.resetButton);
        resetButton.setVisibility(View.GONE);
        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setVisibility(View.VISIBLE);
    }

}