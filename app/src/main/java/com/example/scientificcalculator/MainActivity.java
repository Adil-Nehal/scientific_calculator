package com.example.scientificcalculator;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {

    private EditText etInput;
    private TextView previousCalculation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etInput = findViewById(R.id.etInput);
        previousCalculation = findViewById(R.id.previousCalculation);

        etInput.setShowSoftInputOnFocus(false);
    }

    private void updateText(String input) {
        String oldString = etInput.getText().toString();

        int cursorPos = etInput.getSelectionStart();
        String leftStr = oldString.substring(0, cursorPos);
        String rightStr = oldString.substring(cursorPos);

        etInput.setText(String.format("%s%s%s", leftStr, input, rightStr));
        etInput.setSelection(cursorPos + input.length());
    }

    public void oneBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.one));
    }

    public void twoBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.two));
    }

    public void threeBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.three));
    }

    public void fourBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.four));
    }

    public void fiveBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.five));
    }

    public void sixBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.six));
    }

    public void sevenBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.seven));
    }

    public void eightBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.eight));
    }

    public void nineBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.nine));
    }

    public void zeroBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.zero));
    }

    public void decimalBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.decimal));
    }

    public void clearBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.CONFIRM);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        etInput.setText("");
    }

    public void backspaceBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.CONFIRM);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        int cursorPos = etInput.getSelectionStart();
        int textLen = etInput.getText().length();

        if (cursorPos != 0 && textLen != 0) {
            SpannableStringBuilder selection = (SpannableStringBuilder) etInput.getText();
            selection.replace(cursorPos - 1, cursorPos, "");
            etInput.setText(selection);
            etInput.setSelection(cursorPos - 1);
        }
    }

    public void addBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.add));
    }

    public void subtractBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.subtract));
    }

    public void multiplyBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.multiply));
    }

    public void divideBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.divide));
    }

    public void parenthesisOpenBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.parenthesisOpen));
    }

    public void parenthesisCloseBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.parenthesisClose));
    }

    public void equalBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.CONFIRM);
        String userExp = etInput.getText().toString();

        userExp = userExp.replaceAll(getResources().getString(R.string.divide), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiply), "*");

        Expression expression = new Expression(userExp);
        String result = String.valueOf(expression.calculate());

        if (result.endsWith(".0")) result = result.replace(".0", "");

        etInput.setText(result);
        etInput.setSelection(result.length());
        previousCalculation.setText(userExp);
    }

    public void trigSignBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.trigSin) + "(");
    }

    public void trigCosBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.trigCos) + "(");
    }

    public void trigTanBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText(getResources().getString(R.string.trigTan) + "(");
    }

    public void trigArcSinBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText("arcsin(");
    }

    public void trigArcCosBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText("arccos(");
    }

    public void trigArcTanBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText("arctan(");
    }

    public void logBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText("log(");
    }

    public void naturalLogBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText("ln(");
    }

    public void squareRootBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText("sqrt(");
    }

    public void eBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText("e");
    }

    public void piBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText("pi");
    }

    public void absoluteValueBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText("abs(");
    }

    public void isPrimeFunctionBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText("ispr(");
    }

    public void xSquaredBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText("^(2)");
    }

    public void xPowerYBtn(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);

        if (etInput.getText().toString().contains("NaN")) etInput.setText("");

        updateText("^(");
    }
}
