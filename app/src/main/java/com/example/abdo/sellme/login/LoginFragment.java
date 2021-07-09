package com.example.abdo.sellme.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.abdo.sellme.MainActivity;
import com.example.abdo.sellme.R;
import com.rengwuxian.materialedittext.MaterialEditText;

public class LoginFragment extends Fragment {

    private Button loginButton;
    private TextView forgotPassword;
    private CheckBox rememberMe;
    private MaterialEditText userNameEditText, passwordEditText;
    private String userName, password;
    private boolean isOK;
    private SharedPreferences sharedPreferences;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_login, container, false);

        loginButton = view.findViewById(R.id.login_button);
        forgotPassword = view.findViewById(R.id.forgot_password);
        rememberMe = view.findViewById(R.id.check_remember);
        userNameEditText = view.findViewById(R.id.login_name);
        passwordEditText = view.findViewById(R.id.login_password);
        sharedPreferences = getActivity().getSharedPreferences("Pref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        isOK = sharedPreferences.getBoolean("CHECKBOX", false);
        if (isOK)
            restoreInformation();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (checkPassword() & checkUserName()) {
                    if (checkLoginInformation()) {
                        if (rememberMe.isChecked())
                            editor.putBoolean("CHECKBOX", true);
                        else
                            editor.putBoolean("CHECKBOX", false);
                        editor.commit();
                        getActivity().startActivity(new Intent(getContext(), MainActivity.class));
                        getActivity().finish();
                    } else{
                        if (!userName.equals(sharedPreferences.getString("NAME", null)))
                            userNameEditText.setError("User name is not correct");
                        else
                            passwordEditText.setError("Password is not correct");

                    }
                }
            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "you pressed forgot password", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    private void restoreInformation() {
        userNameEditText.setText(sharedPreferences.getString("NAME", null));
        passwordEditText.setText(sharedPreferences.getString("PASSWORD", null));
        rememberMe.setChecked(sharedPreferences.getBoolean("CHECKBOX", false));
    }

    private boolean checkUserName() {
        userName = userNameEditText.getText().toString();

        if (userName.length() > 7) {
            userNameEditText.setError("Username cannot be greater than 7 characters");
            return false;
        } else if (userName.length() < 3) {
            userNameEditText.setError("Username cannot be less than 3 characters");
            return false;
        } else {
            userNameEditText.setError(null);
            return true;

        }
    }

    private boolean checkPassword() {
        password = passwordEditText.getText().toString();

        if (password.length() > 15) {
            passwordEditText.setError("Password cannot be greater than 15 characters");
            return false;
        } else if (password.length() < 8) {
            passwordEditText.setError("Password cannot be less than 8 characters");
            return false;
        } else {
            passwordEditText.setError(null);
            return true;
        }
    }

    private boolean checkLoginInformation() {
        if (userNameEditText.getText().toString().equals(sharedPreferences.getString("NAME", null)) &&
                passwordEditText.getText().toString().equals(sharedPreferences.getString("PASSWORD", null))) {
            return true;
        } else {
            return false;
        }

    }


}