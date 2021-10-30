package com.phs.myapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.phs.myapplication.R
import com.phs.myapplication.data.Player
import com.phs.myapplication.databinding.FragmentTestBinding
import com.phs.myapplication.viewModel.JustViewModel


class TestFragment : Fragment() {
    private val args:TestFragmentArgs by navArgs()
    private val justViewModel: JustViewModel by activityViewModels()
    private var _binding: FragmentTestBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var player:Pair<String,Int>? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.goJustBtn.setOnClickListener {
            if(player != null){
                justViewModel.setPlayer(Player(name = player!!.first, backNumber = player!!.second))
                findNavController().navigate(R.id.action_test_to_just)
            }
        }

        if(player != null){
            binding.nameText.text = player!!.first
            binding.backNumberText.text = player!!.second.toString()
        }
        else{
            player = Pair(args.a1, args.a2)
            binding.nameText.text = args.a1
            binding.backNumberText.text = args.a2.toString()
        }




    }
}