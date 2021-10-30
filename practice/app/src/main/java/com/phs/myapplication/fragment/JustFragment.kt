package com.phs.myapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.phs.myapplication.R
import com.phs.myapplication.databinding.FragmentJustBinding
import com.phs.myapplication.viewModel.JustViewModel


class JustFragment : Fragment() {
    private var _binding:FragmentJustBinding? = null
    private val binding get() = _binding!!
    //private val justViewModel:JustViewModel by activityViewModels()
    private val justViewModel:JustViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = DataBindingUtil.inflate<FragmentJustBinding>(
            inflater,
            R.layout.fragment_just,
            container,
            false
        ).apply {
            viewModel = justViewModel
            lifecycleOwner = viewLifecycleOwner
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*justViewModel.playerData.observe(viewLifecycleOwner, Observer {
            binding.goalNumberTextJust.text = it!!.goal.toString()
        })*/
    }

}