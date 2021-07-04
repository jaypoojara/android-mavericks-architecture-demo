package com.mavericks.demo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.airbnb.mvrx.MavericksView
import com.airbnb.mvrx.fragmentViewModel
import com.airbnb.mvrx.withState
import com.mavericks.demo.R
import com.mavericks.demo.databinding.FragmentRandomNumberBinding
import com.mavericks.demo.mavericks.viewmodel.RandomNumberViewModel




class RandomNumberFragment : Fragment(), MavericksView {
    private val binding by lazy { FragmentRandomNumberBinding.inflate(layoutInflater) }
    private val viewModel: RandomNumberViewModel by fragmentViewModel()
    override fun invalidate(): Unit = withState(viewModel) {
        binding.textViewRandomNumber.text = getString(R.string.random_number, it.randomNumber)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonGenerateRandomNumber.setOnClickListener {
            viewModel.updateRandomNumber()
        }
    }
}