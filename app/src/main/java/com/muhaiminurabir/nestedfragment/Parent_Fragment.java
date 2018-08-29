package com.muhaiminurabir.nestedfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class Parent_Fragment extends Fragment {


    @BindView(R.id.one)
    Button one;
    @BindView(R.id.two)
    Button two;
    @BindView(R.id.three)
    Button three;
    Unbinder unbinder;

    public Parent_Fragment() {
        // Required empty public constructor
    }

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_parent, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.one)
    public void onOneClicked() {
        Fragment frag=new Child_Fragment_one();
        if(frag!=null){
            FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
            FragmentTransaction ft=fragmentManager.beginTransaction();
            ft.replace(R.id.parent_frag,frag);
            ft.commit();
        }
    }

    @OnClick(R.id.two)
    public void onTwoClicked() {
        Fragment frag=new Child_fragment_two();
        if(frag!=null){
            FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
            FragmentTransaction ft=fragmentManager.beginTransaction();
            ft.replace(R.id.parent_frag,frag);
            ft.commit();
        }
    }

    @OnClick(R.id.three)
    public void onThreeClicked() {
        Fragment frag=new Child_Fragment_three();
        if(frag!=null){
            FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
            FragmentTransaction ft=fragmentManager.beginTransaction();
            ft.replace(R.id.parent_frag,frag);
            ft.commit();
        }
    }
}
