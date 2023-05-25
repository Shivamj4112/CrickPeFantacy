package com.crickpe.utils;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.crickpe.C1188R;

public class GenericTextWatcher implements TextWatcher {
    private final EditText[] editText;
    private View view;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public GenericTextWatcher(View view2, EditText[] editTextArr) {
        this.editText = editTextArr;
        this.view = view2;
    }

    public void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        switch (this.view.getId()) {
            case C1188R.C1192id.otp_textbox_five:
                if (obj.length() == 1) {
                    this.editText[5].requestFocus();
                    return;
                } else if (obj.length() == 0) {
                    this.editText[3].requestFocus();
                    return;
                } else {
                    return;
                }
            case C1188R.C1192id.otp_textbox_four:
                if (obj.length() == 1) {
                    this.editText[4].requestFocus();
                    return;
                } else if (obj.length() == 0) {
                    this.editText[2].requestFocus();
                    return;
                } else {
                    return;
                }
            case C1188R.C1192id.otp_textbox_one:
                if (obj.length() == 1) {
                    this.editText[1].requestFocus();
                    return;
                }
                return;
            case C1188R.C1192id.otp_textbox_seven:
                if (obj.length() == 1) {
                    this.editText[6].clearFocus();
                    return;
                } else if (obj.length() == 0) {
                    this.editText[5].requestFocus();
                    return;
                } else {
                    return;
                }
            case C1188R.C1192id.otp_textbox_six:
                if (obj.length() == 1) {
                    this.editText[6].requestFocus();
                    return;
                } else if (obj.length() == 0) {
                    this.editText[4].requestFocus();
                    return;
                } else {
                    return;
                }
            case C1188R.C1192id.otp_textbox_three:
                if (obj.length() == 1) {
                    this.editText[3].requestFocus();
                    return;
                } else if (obj.length() == 0) {
                    this.editText[1].requestFocus();
                    return;
                } else {
                    return;
                }
            case C1188R.C1192id.otp_textbox_two:
                if (obj.length() == 1) {
                    this.editText[2].requestFocus();
                    return;
                } else if (obj.length() == 0) {
                    this.editText[0].requestFocus();
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }
}
