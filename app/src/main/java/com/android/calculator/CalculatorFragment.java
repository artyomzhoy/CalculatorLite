package com.android.calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class CalculatorFragment extends Fragment {

    public static CalculatorFragment newInstance() {
        return new CalculatorFragment();
    }

    private Button mAC;
    private Button mPlusMinus;
    private Button mPercent;
    private Button mDivide;
    private Button mSeven;
    private Button mEight;
    private Button mNine;
    private Button mMultiply;
    private Button mFour;
    private Button mFive;
    private Button mSix;
    private Button mSubtract;
    private Button mOne;
    private Button mTwo;
    private Button mThree;
    private Button mAdd;
    private Button mZero;
    private Button mComa;
    private Button mResult;
    private TextView mCalculatorResult;
    private TextView mCalculatorInput;

    String text;
    String operation = "";
    float value;
    float result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_calculator, container, false);

        mZero = (Button) view.findViewById(R.id.zero);
        mZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCalculatorInput.setText(mCalculatorInput.getText() + "0");
            }
        });

        mOne = (Button) view.findViewById(R.id.one);
        mOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mCalculatorInput.getText().equals("0")) {
                    mCalculatorInput.setText(mCalculatorInput.getText() + "1");
                } else {
                    mCalculatorInput.setText("1");
                }
            }
        });

        mTwo = (Button) view.findViewById(R.id.two);
        mTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mCalculatorInput.getText().equals("0")) {
                    mCalculatorInput.setText(mCalculatorInput.getText() + "2");
                } else {
                    mCalculatorInput.setText("2");
                }
            }
        });

        mThree = (Button) view.findViewById(R.id.three);
        mThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mCalculatorInput.getText().equals("0")) {
                    mCalculatorInput.setText(mCalculatorInput.getText() + "3");
                } else {
                    mCalculatorInput.setText("3");
                }
            }
        });

        mFour = (Button) view.findViewById(R.id.four);
        mFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mCalculatorInput.getText().equals("0")) {
                    mCalculatorInput.setText(mCalculatorInput.getText() + "4");
                } else {
                    mCalculatorInput.setText("4");
                }
            }
        });

        mFive = (Button) view.findViewById(R.id.five);
        mFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mCalculatorInput.getText().equals("0")) {
                    mCalculatorInput.setText(mCalculatorInput.getText() + "5");
                } else {
                    mCalculatorInput.setText("5");
                }
            }
        });

        mSix = (Button) view.findViewById(R.id.six);
        mSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mCalculatorInput.getText().equals("0")) {
                    mCalculatorInput.setText(mCalculatorInput.getText() + "6");
                } else {
                    mCalculatorInput.setText("6");
                }
            }
        });

        mSeven = (Button) view.findViewById(R.id.seven);
        mSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mCalculatorInput.getText().equals("0")) {
                    mCalculatorInput.setText(mCalculatorInput.getText() + "7");
                } else {
                    mCalculatorInput.setText("7");
                }
            }
        });

        mEight = (Button) view.findViewById(R.id.eight);
        mEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mCalculatorInput.getText().equals("0")) {
                    mCalculatorInput.setText(mCalculatorInput.getText() + "8");
                } else {
                    mCalculatorInput.setText("8");
                }
            }
        });

        mNine = (Button) view.findViewById(R.id.nine);
        mNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mCalculatorInput.getText().equals("0")) {
                    mCalculatorInput.setText(mCalculatorInput.getText() + "9");
                } else {
                    mCalculatorInput.setText("9");
                }
            }
        });

        mComa = (Button) view.findViewById(R.id.coma);
        mComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = mCalculatorInput.getText().toString();
                if (!text.contains("."))
                    mCalculatorInput.setText(mCalculatorInput.getText() + ".");
            }
        });

        mAC = (Button) view.findViewById(R.id.AC);
        mAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = null;
                value = 0;
                result = 0;
                mCalculatorInput.setText("");
                mCalculatorResult.setText("");
                updateResult(operation);
                operation = "";
            }
        });

        mPlusMinus = (Button) view.findViewById(R.id.plus_minus);
        mPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(requireContext().getApplicationContext(), "Don't work", Toast.LENGTH_SHORT).show();

            }
        });

        mPercent = (Button) view.findViewById(R.id.percent);
        mPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(requireContext().getApplicationContext(), "Don't work", Toast.LENGTH_SHORT).show();

            }
        });

        mDivide = (Button) view.findViewById(R.id.divide);
        mDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mCalculatorInput.getText().toString().isEmpty()) {
                    mCalculatorInput.setText("0");
                }
                value = Float.parseFloat(mCalculatorInput.getText().toString());
                updateResult(operation);
                operation = "/";
                text = Float.toString(result);
                mCalculatorResult.setText(text);
                mCalculatorInput.setText("0");

            }
        });


        mMultiply = (Button) view.findViewById(R.id.multiply);
        mMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mCalculatorInput.getText().toString().isEmpty()) {
                    mCalculatorInput.setText("0");
                }
                value = Float.parseFloat(mCalculatorInput.getText().toString());
                updateResult(operation);
                operation = "*";
                text = Float.toString(result);
                mCalculatorResult.setText(text);
                mCalculatorInput.setText("0");

            }
        });

        mSubtract = (Button) view.findViewById(R.id.subtract);
        mSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mCalculatorInput.getText().toString().isEmpty()) {
                    mCalculatorInput.setText("0");
                }
                value = Float.parseFloat(mCalculatorInput.getText().toString());
                updateResult(operation);
                operation = "-";
                text = Float.toString(result);
                mCalculatorResult.setText(text);
                mCalculatorInput.setText("0");

            }
        });

        mAdd = (Button) view.findViewById(R.id.add);
        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mCalculatorInput.getText().toString().isEmpty()) {
                    mCalculatorInput.setText("0");
                }
                value = Float.parseFloat(mCalculatorInput.getText().toString());
                updateResult(operation);
                operation = "+";
                text = Float.toString(result);
                mCalculatorResult.setText(text);
                mCalculatorInput.setText("0");

            }
        });

        mResult = (Button) view.findViewById(R.id.result);
        mResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mCalculatorInput.getText().toString().isEmpty()) {
                    mCalculatorInput.setText("0");
                }
                value = Float.parseFloat(mCalculatorInput.getText().toString());
                updateResult(operation);
                operation = "=";
                text = Float.toString(result);
                mCalculatorResult.setText(text);
                mCalculatorInput.setText("0");

            }
        });

        mCalculatorInput = (TextView) view.findViewById(R.id.calculator_input_text);
        mCalculatorResult = (TextView) view.findViewById(R.id.calculator_result);

        return view;

    }

    public String updateResult(String operation) {

        switch (operation) {
            case ("+"):
                if (value == 0) {
                    result += value;
                } else if (result == 0) {
                    result = value;
                } else {
                    result = result + value;
                }
                break;
            case ("-"):
                if (value == 0) {
                    result -= value;
                } else if (result == 0) {
                    result = result - value;
                } else {
                    result = result - value;
                }
                break;
            case ("/"):
                if (value == 0) {
                    result = value;
                } else if (result == 0) {
                    result = value;
                } else {
                    result = result / value;
                }
                break;
            case ("*"):
                if (value == 0) {
                    result = value;
                } else if (result == 0) {
                    result = value;
                } else {
                    result = result * value;
                }
                break;
            case ("="):
                result = result;
                break;
            case (""):
                result = value;
                break;
        }
        return Float.toString(result);
    }

}
