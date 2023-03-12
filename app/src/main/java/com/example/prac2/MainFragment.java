package com.example.prac2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.prac2.databinding.MainFragmBinding;
import com.example.prac2.databinding.RegistrationFragmentBinding;

public class MainFragment extends Fragment {

    final private String MFTAG = "Main Fragment";
    private String username;
    private MainFragmBinding mainFragmBinding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);
        mainFragmBinding = MainFragmBinding.inflate(
                inflater, container, false
        );
        return mainFragmBinding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Toast.makeText(this.getContext(), "onAttach method called", Toast.LENGTH_SHORT).show();
        Log.i(MFTAG, "onAttach method called");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toast.makeText(this.getContext(), "onViewCreated method called", Toast.LENGTH_SHORT).show();
        Log.i(MFTAG, "onViewCreated method called");
        mainFragmBinding.greetingMessage.setText("ASSBUT");
        Bundle bundle = getArguments();
        if (bundle != null) {
            username = bundle.getString("un");
            username = (username.equals(""))? "User" : username;
            mainFragmBinding.greetingMessage.setText("Hello, " + username);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(this.getContext(), "onStart method called", Toast.LENGTH_SHORT).show();
        Log.i(MFTAG, "onStart method called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(this.getContext(), "onResume method called", Toast.LENGTH_SHORT).show();
        Log.i(MFTAG, "onResume method called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(this.getContext(), "onPause method called", Toast.LENGTH_SHORT).show();
        Log.i(MFTAG, "onPause method called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(this.getContext(), "onStop method called", Toast.LENGTH_SHORT).show();
        Log.i(MFTAG, "onStop method called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(this.getContext(), "onDestroyView method called", Toast.LENGTH_SHORT).show();
        Log.i(MFTAG, "onDestroyView method called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this.getContext(), "onDestroy method called", Toast.LENGTH_SHORT).show();
        Log.i(MFTAG, "onDestroy method called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(this.getContext(), "onDetach method called", Toast.LENGTH_SHORT).show();
        Log.i(MFTAG, "onDetach method called");
    }
}
