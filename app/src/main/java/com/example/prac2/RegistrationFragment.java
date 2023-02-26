package com.example.prac2;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.prac2.databinding.RegistrationFragmentBinding;

public class RegistrationFragment extends Fragment {
    private String name;
    RegistrationFragmentBinding registrationFragmentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);
//        View rootView = inflater.inflate(R.layout.registration_fragment, container, false);
//        return rootView;

        registrationFragmentBinding = RegistrationFragmentBinding.inflate(
                inflater, container, false
        );
        return registrationFragmentBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        registrationFragmentBinding.companyName.setText("Aragon Inc.");
        registrationFragmentBinding.logo.setImageResource(R.drawable.ssssssssssssssssssss);

        registrationFragmentBinding.anon.setOnClickListener(new View.OnClickListener() { //программный способ установки слушателя
            @Override
            public void onClick(View v) {
                registrationFragmentBinding.enterName.setVisibility(View.VISIBLE);
                registrationFragmentBinding.enteringMes.setVisibility(View.VISIBLE);
            }
        });

        registrationFragmentBinding.enterName.setOnKeyListener((v, keyCode, event) -> {
                    if(event.getAction() == KeyEvent.ACTION_DOWN &&
                            (keyCode == KeyEvent.KEYCODE_ENTER))
                    {
                        name = registrationFragmentBinding.enterName.getText().toString();
                        registrationFragmentBinding.next.setVisibility(View.VISIBLE);
                        return true;
                    }
                    return false;
                }
        );

        registrationFragmentBinding.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new MainFragment();
                FragmentTransaction fragmentTransaction = getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction();
                fragmentTransaction.replace(R.id.mainlayout, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
