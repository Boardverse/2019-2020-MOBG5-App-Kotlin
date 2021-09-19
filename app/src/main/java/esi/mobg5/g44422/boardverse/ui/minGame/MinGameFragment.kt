package esi.mobg5.g44422.boardverse.ui.minGame

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.min_game_fragment.*

import esi.mobg5.g44422.boardverse.R
import esi.mobg5.g44422.boardverse.model.MinGame

class MinGameFragment : Fragment() {

    private lateinit var viewModel: MinGameViewModel

    companion object {
        fun newInstance() = MinGameFragment()
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.min_game_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MinGameViewModel::class.java)

        viewModel.minGame.observe(this, Observer {
            minGameName.text = ""
        })

        minGameFragment.setOnClickListener({

        })

        var minGame: MinGame? = null
        if(savedInstanceState != null) {
            minGame = savedInstanceState.getParcelable<MinGame>("Parcel")
        }

        Glide.with(this).load(minGame.)
    }

}
