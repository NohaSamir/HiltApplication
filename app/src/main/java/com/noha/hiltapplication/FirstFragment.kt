package com.noha.hiltapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.RequestManager
import com.noha.hiltapplication.model.Car
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_first.*
import javax.inject.Inject


@AndroidEntryPoint
class FirstFragment : Fragment() {

    @Inject
    lateinit var car: Car

    // ToDo 1 : We need to inject Glide Request manager
    @Inject
    lateinit var glideRequestManager: RequestManager

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

        //ToDo 5: Now you can use your injected field
        //Glide.with(context)
        glideRequestManager
            .load("https://api.ferrarinetwork.ferrari.com/v2/network-content/medias/resize/5dd560d4f8fc7b0aa906c8ca-line-up-ferrari-812-superfast-v2?apikey=9QscUiwr5n0NhOuQb463QEKghPrVlpaF&height=750")
            .into(imageView)

    }
}

//ToDo 6 : Run your app
// Congratulation: Now you learn how to inject fields using Hilt Module
