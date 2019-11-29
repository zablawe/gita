package com.bawei.gitdemos.frag;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.bawei.gitdemos.MyActivity;
import com.bawei.gitdemos.R;


public  class ShowFragment extends Fragment {

    private Button button;
    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_show, container, false );
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated( view, savedInstanceState );
        inniView(view);
    }

    private void inniView(View view) {
        button = view.findViewById( R.id.nexts );
        textView = view.findViewById( R.id.text_view );

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated( savedInstanceState );
        inniDate(savedInstanceState);
    }

    private void inniDate(Bundle savedInstanceState) {

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(getActivity(), MyActivity.class );
                 intent.putExtra( "key", textView.getText().toString() );
                 startActivity( intent );
            }
        } );
    }


}
