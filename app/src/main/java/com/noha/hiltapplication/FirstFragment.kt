package com.noha.hiltapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.noha.hiltapplication.model.Car
import com.noha.hiltapplication.model.Engine
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val car = Car(Engine())
        textview_first.text = car.start()

        Glide.with(context)
            .load("https://api.ferrarinetwork.ferrari.com/v2/network-content/medias/resize/5dd560d4f8fc7b0aa906c8ca-line-up-ferrari-812-superfast-v2?apikey=9QscUiwr5n0NhOuQb463QEKghPrVlpaF&height=750")
            .into(imageView)
    }
}