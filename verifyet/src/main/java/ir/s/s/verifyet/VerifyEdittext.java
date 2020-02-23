package ir.s.s.verifyet;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;

public class VerifyEdittext extends LinearLayout {

    View root;
    AppCompatEditText et1,et2,et3,et4,et5;
    public VerifyEdittext(Context context) {
        super(context);
        init(context);
    }

    public VerifyEdittext(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public VerifyEdittext(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }


    private void init(Context context){
        root=inflate(context, R.layout.verify_edittext, this);
        et1=root.findViewById(R.id.et1);
        et2=root.findViewById(R.id.et2);
        et3=root.findViewById(R.id.et3);
        et4=root.findViewById(R.id.et4);
        et5=root.findViewById(R.id.et5);

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et1.getText().toString().trim().length()>0){
                    et2.requestFocus();
                }
            }
        });



        et2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et2.getText().toString().trim().length()>0){
                    et3.requestFocus();
                }else if (et2.getText().toString().trim().length()==0){
                    et1.requestFocus();
                }
            }
        });



        et3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et3.getText().toString().trim().length()>0){
                    et4.requestFocus();
                }else if (et3.getText().toString().trim().length()==0){
                    et2.requestFocus();
                }
            }
        });


        et4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et4.getText().toString().trim().length()>0){
                    et5.requestFocus();
                }else if (et4.getText().toString().trim().length()==0){
                    et3.requestFocus();
                }
            }
        });


        et5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et5.getText().toString().trim().length()==0){
                    et4.requestFocus();
                }
            }
        });

    }



    public String getText(){

        return et1.getText().toString().trim()+
                et2.getText().toString().trim()+
                et3.getText().toString().trim()+
                et4.getText().toString().trim()+
                et5.getText().toString().trim();
    }

    public void setTextSize(float size){
        et1.setTextSize(size);
        et2.setTextSize(size);
        et3.setTextSize(size);
        et4.setTextSize(size);
        et5.setTextSize(size);
    }



}
