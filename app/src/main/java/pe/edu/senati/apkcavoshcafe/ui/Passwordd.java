package pe.edu.senati.apkcavoshcafe.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pe.edu.senati.apkcavoshcafe.R;
import pe.edu.senati.apkcavoshcafe.databinding.FragmentLoginBinding;
import pe.edu.senati.apkcavoshcafe.databinding.FragmentPassworddBinding;

public class Passwordd extends Fragment {
    FragmentPassworddBinding binding;
    Context context;
    View view;
    NavController navController;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPassworddBinding.inflate(inflater, container, false);
        return view = binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        context = getContext();
        navController = Navigation.findNavController( view );

        binding.tvLogin.setOnClickListener( v -> navController.navigate( R.id.navigation_login));
        binding.btnActualizar.setOnClickListener( v -> btnActualizar_Click());
    }

    private void btnActualizar_Click() {
        String sCorreo = getArguments().getString("correo");

        String sPasswordd = binding.tilPasswordd.getEditText().getText().toString().trim();
        String sPassworddConfirmar = binding.tilPassworddConfirmar.getEditText().getText().toString().trim();

        // api -> actualizar passwordd para el correo
        // mensaje "Actualizacion exitosa"

        navController.navigate( R.id.navigation_login);
    }
}