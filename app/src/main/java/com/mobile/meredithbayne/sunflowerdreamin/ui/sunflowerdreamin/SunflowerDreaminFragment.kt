package com.mobile.meredithbayne.sunflowerdreamin.ui.sunflowerdreamin

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mobile.meredithbayne.sunflowerdreamin.R

class SunflowerDreaminFragment : Fragment() {

    companion object {
        fun newInstance() = SunflowerDreaminFragment()
    }

    private lateinit var viewModel: SunflowerDreaminViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.sunflower_dreamin_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SunflowerDreaminViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
