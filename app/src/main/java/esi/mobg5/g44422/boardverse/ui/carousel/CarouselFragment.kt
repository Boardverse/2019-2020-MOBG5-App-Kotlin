package esi.mobg5.g44422.boardverse.ui.carousel

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import esi.mobg5.g44422.boardverse.R

class CarouselFragment : Fragment() {

    companion object {
        fun newInstance() = CarouselFragment()
    }

    private lateinit var viewModel: CarouselViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.carousel_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CarouselViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
