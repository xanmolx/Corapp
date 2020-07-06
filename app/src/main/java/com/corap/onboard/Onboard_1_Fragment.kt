package com.corap.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.corap.R

/**
 * A simple [Fragment] subclass.
 * Use the [Onboard_1.newInstance] factory method to
 * create an instance of this fragment.
 */
class Onboard_1_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.onboard_1_fragment, container, false)
    }

}