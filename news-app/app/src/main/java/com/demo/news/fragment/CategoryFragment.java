package com.demo.news.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.demo.news.R;
import com.demo.news.databinding.FragOthersBinding;


/**
 * Created by Vishal Patolia on 18-Feb-18.
 */

public class CategoryFragment extends Fragment {
    FragOthersBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.frag_others, container, false);
        mBinding.homeTxtTitle.setText(getString(R.string.menu_categories));
        return mBinding.getRoot();
    }
}
