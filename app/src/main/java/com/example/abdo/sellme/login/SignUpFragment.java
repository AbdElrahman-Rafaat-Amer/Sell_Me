package com.example.abdo.sellme.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.abdo.sellme.MainActivity;
import com.example.abdo.sellme.R;
import com.rengwuxian.materialedittext.MaterialEditText;


public class SignUpFragment extends Fragment {

    private Button signUpButton;
    private MaterialEditText userNameEditText, passwordEditText, emailEditText, confirmPasswordEditText;
    private String userName, password, confirmPassword, email;
    private SharedPreferences sharedPreferences;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);

        sharedPreferences = getActivity().getSharedPreferences("Pref", Context.MODE_PRIVATE);

        signUpButton = view.findViewById(R.id.signUp_button);
        userNameEditText = view.findViewById(R.id.signUp_name);
        passwordEditText = view.findViewById(R.id.signUp_password);
        confirmPasswordEditText = view.findViewById(R.id.signUp_confirm_password);
        emailEditText = view.findViewById(R.id.signUp_email);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkEmail() & checkUserName() & checkPassword()){
                    storeInformation();
                    getActivity().startActivity(new Intent(getContext(), MainActivity.class));
                    getActivity().finish();
                }
            }
        });

        return view;
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

    private boolean checkEmail() {
        email = emailEditText.getText().toString();

        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            userNameEditText.setError(null);
            return true;
        } else if (email.isEmpty()){
            emailEditText.setError("Email can not be empty");
            return false;
        }else {
            emailEditText.setError("Email must be example@org.com");
            return false;
        }
    }

    private boolean checkPassword() {
        password = passwordEditText.getText().toString();
        confirmPassword = confirmPasswordEditText.getText().toString();

        if (password.length() > 15) {
            passwordEditText.setError("Password cannot be greater than 15 characters");
            return false;
        } else if (password.length() < 8) {
            passwordEditText.setError("Password cannot be less than 8 characters");
            return false;
        } else if (!confirmPassword.equals(password)) {
            confirmPasswordEditText.setError("Confirm password does not match password");
            return false;
        } else {
            passwordEditText.setError(null);
            confirmPasswordEditText.setError(null);
            return true;

        }
    }

    private void storeInformation() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("NAME", userName);
        editor.putString("PASSWORD", password);
        editor.putString("EMAIL", email);
        editor.commit();
    }
}