package com.androidtrivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.androidtrivia.databinding.FragmentGameWonBinding


class GameWonFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentGameWonBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_won, container, false)

        var args = GameWonFragmentArgs.fromBundle(requireArguments())

        Toast.makeText(context,"NumCorrect = ${args.numCorrect} , Numquestions = ${args.numQuestions}",Toast.LENGTH_LONG).show()

        binding.nextMatchButton.setOnClickListener{
//            it.findNavController().navigate(R.id.action_gameWonFragment_to_gameFragment)
            it.findNavController().navigate(GameWonFragmentDirections.actionGameWonFragmentToGameFragment())

        }
        return binding.root
    }

}