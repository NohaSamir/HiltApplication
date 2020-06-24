package com.noha.hiltapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.noha.hiltapplication.model.Car
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_first.*
import javax.inject.Inject

//ToDo 2: Add @AndroidEntryPoint To inject fields in Fragment
@AndroidEntryPoint
class FirstFragment : Fragment() {

    //ToDo 1: To inject a new instance of Car
    // first add inject annotation before filed then tell Hilt how to create instance
    @Inject
    lateinit var car: Car

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textview_first.text = car.start()

        Glide.with(context)
            .load("https://api.ferrarinetwork.ferrari.com/v2/network-content/medias/resize/5dd560d4f8fc7b0aa906c8ca-line-up-ferrari-812-superfast-v2?apikey=9QscUiwr5n0NhOuQb463QEKghPrVlpaF&height=750")
            .into(imageView)

    }
}