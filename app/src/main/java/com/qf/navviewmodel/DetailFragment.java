package com.qf.navviewmodel;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qf.navviewmodel.databinding.FragmentDetailBinding;

public class DetailFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        MyViewModel myViewModel;
        myViewModel = new ViewModelProvider(getActivity()).get(MyViewModel.class);
        FragmentDetailBinding binding;

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container,false);
        binding.setData(myViewModel);
        binding.setLifecycleOwner(getActivity());

        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_detailFragment_to_masterFragment);
            }
        });

        return binding.getRoot();
    }
}