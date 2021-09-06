package com.androidtrivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.androidtrivia.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    private lateinit var binding : FragmentTitleBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_title,container,false)

        // 1 way
//        binding.playButton.setOnClickListener { view:View ->
//            Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment)
//        }
        // 2 way
//        binding.playButton.setOnClickListener { view:View ->
//            // kotlin extension function to reduce code structure
//            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
//        }
        // 3 way
        binding.playButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
        )
        return binding.root
    }

}