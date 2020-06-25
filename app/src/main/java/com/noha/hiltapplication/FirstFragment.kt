package com.noha.hiltapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.noha.hiltapplication.model.Car
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_first.*
import javax.inject.Inject

//ToDo 1: Add @AndroidEntryPoint To inject fields in Fragment
@AndroidEntryPoint
class FirstFragment : Fragment() {

    //ToDo 3: To inject a new instance of Car
    // use the @Inject annotation to perform field injection
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

        //ToDo 6 : use you car instance
        textview_first.text = car.start()

        Glide.with(context)
            .load("https://api.ferrarinetwork.ferrari.com/v2/network-content/medias/resize/5dd560d4f8fc7b0aa906c8ca-line-up-ferrari-812-superfast-v2?apikey=9QscUiwr5n0NhOuQb463QEKghPrVlpaF&height=750")
            .into(imageView)

    }
}

//ToDo 7 : Run your app
// Congratulation: Now you learn how to inject fields using Hilt
